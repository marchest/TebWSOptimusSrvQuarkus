package tr.com.teb.tebws.optimus.model;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2020-03-30T10:32:02.872+03:00
 * Generated source version: 2.7.11
 * 
 */
@WebService(targetNamespace = "TEB.WebServiceCard", name = "WebServiceCardSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface WebServiceCardSoap {

    @WebMethod(operationName = "GetOptimusODM", action = "TEB.WebServiceCard/GetOptimusODM")
    @RequestWrapper(localName = "GetOptimusODM", targetNamespace = "TEB.WebServiceCard", className = "webservicecard.teb.GetOptimusODM")
    @ResponseWrapper(localName = "GetOptimusODMResponse", targetNamespace = "TEB.WebServiceCard", className = "webservicecard.teb.GetOptimusODMResponse")
    @WebResult(name = "GetOptimusODMResult", targetNamespace = "TEB.WebServiceCard")
    public String getOptimusODM();


    @WebMethod(operationName = "QueryUpdate", action = "TEB.WebServiceCard/QueryUpdate")
    @RequestWrapper(localName = "QueryUpdate", targetNamespace = "TEB.WebServiceCard", className = "webservicecard.teb.QueryUpdate")
    @ResponseWrapper(localName = "QueryUpdateResponse", targetNamespace = "TEB.WebServiceCard", className = "webservicecard.teb.QueryUpdateResponse")
    @WebResult(name = "QueryUpdateResult", targetNamespace = "TEB.WebServiceCard")
    public String queryUpdate(
            @WebParam(name = "p_ConStr", targetNamespace = "TEB.WebServiceCard")
                    String pConStr,
            @WebParam(name = "p_SQL", targetNamespace = "TEB.WebServiceCard")
                    String pSQL,
            @WebParam(name = "p_FileXml", targetNamespace = "TEB.WebServiceCard")
                    String pFileXml
    );

    @WebMethod(operationName = "GetOptimusPRD", action = "TEB.WebServiceCard/GetOptimusPRD")
    @RequestWrapper(localName = "GetOptimusPRD", targetNamespace = "TEB.WebServiceCard", className = "webservicecard.teb.GetOptimusPRD")
    @ResponseWrapper(localName = "GetOptimusPRDResponse", targetNamespace = "TEB.WebServiceCard", className = "webservicecard.teb.GetOptimusPRDResponse")
    @WebResult(name = "GetOptimusPRDResult", targetNamespace = "TEB.WebServiceCard")
    public String getOptimusPRD();

    @WebMethod(operationName = "WebServiceVersion", action = "TEB.WebServiceCard/WebServiceVersion")
    @RequestWrapper(localName = "WebServiceVersion", targetNamespace = "TEB.WebServiceCard", className = "webservicecard.teb.WebServiceVersion")
    @ResponseWrapper(localName = "WebServiceVersionResponse", targetNamespace = "TEB.WebServiceCard", className = "webservicecard.teb.WebServiceVersionResponse")
    @WebResult(name = "WebServiceVersionResult", targetNamespace = "TEB.WebServiceCard")
    public String webServiceVersion();

    @WebMethod(operationName = "GetOptimusPREPROD", action = "TEB.WebServiceCard/GetOptimusPREPROD")
    @RequestWrapper(localName = "GetOptimusPREPROD", targetNamespace = "TEB.WebServiceCard", className = "webservicecard.teb.GetOptimusPREPROD")
    @ResponseWrapper(localName = "GetOptimusPREPRODResponse", targetNamespace = "TEB.WebServiceCard", className = "webservicecard.teb.GetOptimusPREPRODResponse")
    @WebResult(name = "GetOptimusPREPRODResult", targetNamespace = "TEB.WebServiceCard")
    public String getOptimusPREPROD();

    @WebMethod(operationName = "MainMethod", action = "TEB.WebServiceCard/MainMethod")
    @RequestWrapper(localName = "MainMethod", targetNamespace = "TEB.WebServiceCard", className = "webservicecard.teb.MainMethod")
    @ResponseWrapper(localName = "MainMethodResponse", targetNamespace = "TEB.WebServiceCard", className = "webservicecard.teb.MainMethodResponse")
    public void mainMethod(
            @WebParam(name = "p_Password", targetNamespace = "TEB.WebServiceCard")
                    String pPassword,
            @WebParam(name = "p_CallerID", targetNamespace = "TEB.WebServiceCard")
                    String pCallerID,
            @WebParam(name = "p_ServiceID", targetNamespace = "TEB.WebServiceCard")
                    int pServiceID,
            @WebParam(name = "p_InputXML", targetNamespace = "TEB.WebServiceCard")
                    String pInputXML,
            @WebParam(mode = WebParam.Mode.OUT, name = "MainMethodResult", targetNamespace = "TEB.WebServiceCard")
                    javax.xml.ws.Holder<String> mainMethodResult,
            @WebParam(mode = WebParam.Mode.OUT, name = "p_ReturnCode", targetNamespace = "TEB.WebServiceCard")
                    javax.xml.ws.Holder<String> pReturnCode,
            @WebParam(mode = WebParam.Mode.OUT, name = "p_ReturnMsg", targetNamespace = "TEB.WebServiceCard")
                    javax.xml.ws.Holder<String> pReturnMsg,
            @WebParam(mode = WebParam.Mode.OUT, name = "p_OutputXML", targetNamespace = "TEB.WebServiceCard")
                    javax.xml.ws.Holder<String> pOutputXML
    );

    @WebMethod(operationName = "GetOptimusDEV", action = "TEB.WebServiceCard/GetOptimusDEV")
    @RequestWrapper(localName = "GetOptimusDEV", targetNamespace = "TEB.WebServiceCard", className = "webservicecard.teb.GetOptimusDEV")
    @ResponseWrapper(localName = "GetOptimusDEVResponse", targetNamespace = "TEB.WebServiceCard", className = "webservicecard.teb.GetOptimusDEVResponse")
    @WebResult(name = "GetOptimusDEVResult", targetNamespace = "TEB.WebServiceCard")
    public String getOptimusDEV();

    @WebMethod(operationName = "GetOptimusTST", action = "TEB.WebServiceCard/GetOptimusTST")
    @RequestWrapper(localName = "GetOptimusTST", targetNamespace = "TEB.WebServiceCard", className = "webservicecard.teb.GetOptimusTST")
    @ResponseWrapper(localName = "GetOptimusTSTResponse", targetNamespace = "TEB.WebServiceCard", className = "webservicecard.teb.GetOptimusTSTResponse")
    @WebResult(name = "GetOptimusTSTResult", targetNamespace = "TEB.WebServiceCard")
    public String getOptimusTST();
}