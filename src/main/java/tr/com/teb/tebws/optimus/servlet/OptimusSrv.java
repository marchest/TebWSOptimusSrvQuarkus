package tr.com.teb.tebws.optimus.servlet;


import org.eclipse.microprofile.rest.client.inject.RestClient;
import tr.com.teb.tebws.optimus.client.OptimusClient;
import tr.com.teb.tebws.optimus.config.OptimusConfiguration;
import tr.com.teb.tebws.optimus.model.MainMethod;
import tr.com.teb.tebws.optimus.model.MainMethodResponse;
import tr.com.teb.tebws.optimus.soapmessage.BuildSoapMessage;
import tr.com.teb.tebws.optimus.soapmessage.parser.MessageProcessor;
import tr.com.teb.tebws.optimus.utils.CommonWebServiceUtils;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/optimussrv")
public class OptimusSrv extends HttpServlet {
    private final String action = "TEB.WebServiceCard/MainMethod";
    private final String ENCODING="text/html; charset=ISO-8859-9";
    private static final String ERROR_PSWD_BOS = "Tanimli password bos olamaz.";
    private static final String ERROR_PARAMETRE_BOS = "Parametreler bos olamaz.";
    private static final String ERROR_PARAMETRE_SAYISI = "Gelen parametrelerin sayisi beklenenden farkli.";


    @Inject
    OptimusConfiguration configuration;

    @Inject
    CommonWebServiceUtils commonWebServiceUtils;

    @Inject
    @RestClient
    OptimusClient optimusClient;

    @Inject
    BuildSoapMessage buildSoapMessage;

    @Inject
    MessageProcessor parser;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuffer buffer = new StringBuffer();
        Response response = null;
        String certificatesTrustStorePath = "C:\\Temp\\sertifika\\cacerts";
        System.setProperty("javax.net.ssl.trustStore", certificatesTrustStorePath);
        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
        try {
            int parameterSize = req.getParameterMap().size();
            String callerID = req.getParameter("CALLERID");
            String serviceID = req.getParameter("SERVICEID");
            String inputXML = req.getParameter("INPUTXML");
            if (parameterSize == 4) {
                callerID = commonWebServiceUtils.hex2String(callerID);
                serviceID = commonWebServiceUtils.hex2String(serviceID);
                inputXML = commonWebServiceUtils.hex2String(inputXML);
                String password = configuration.getPassword(); //test ortamında şifre kullanılmamış
                if (commonWebServiceUtils.isEmpty(serviceID) | commonWebServiceUtils.isEmpty(inputXML) | commonWebServiceUtils.isEmpty(callerID)) {
                    String error=ERROR_PARAMETRE_BOS + "|" +
                            commonWebServiceUtils.nullToEmpty(callerID) + "|" +
                            commonWebServiceUtils.nullToEmpty(serviceID) + "|" +
                            commonWebServiceUtils.nullToEmpty(inputXML);
                throw new Exception(error);
                }
                MainMethod mainMethod = new MainMethod();
                mainMethod.setPServiceID(Integer.valueOf(serviceID));
                mainMethod.setPPassword(password);
                mainMethod.setPInputXML(inputXML);
                mainMethod.setPCallerID(callerID);
                String result = optimusClient.getMainMethodResponse(buildSoapMessage.buildMessage(mainMethod));
                if (result != null && !result.equals("")) {
                    MainMethodResponse mainMethodResponse = parser.unmarshalResponse(result);
                    buffer.append(parser.prepareFinalResponse(mainMethodResponse));
                }
            } else
                buffer.append(commonWebServiceUtils.getErrorXMLText(ERROR_PARAMETRE_SAYISI));

        } catch (Exception e) {
            buffer = new StringBuffer();
            if (e instanceof WebApplicationException) {
                WebApplicationException webx = (WebApplicationException) e;
                Response errResp = webx.getResponse();
                    try {
                        StringBuffer faultBuffer=parser.returnFault(errResp);
                        if (faultBuffer!=null){
                            buffer.append(commonWebServiceUtils.getErrorXMLText(faultBuffer.toString()));
                        }
                        else
                            buffer.append(commonWebServiceUtils.getErrorXMLText(e.getMessage()));

                    } catch (Exception ex) {
                        buffer.append(commonWebServiceUtils.getErrorXMLText(e.getMessage()));
                    }
                }
            else
                buffer.append(commonWebServiceUtils.getErrorXMLText(e.getMessage()));
            }

        PrintWriter writer = resp.getWriter();
        resp.setContentType(ENCODING);
        writer.println(buffer);
        writer.close();
    }


}
