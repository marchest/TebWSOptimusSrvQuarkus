package tr.com.teb.tebws.optimus.soapmessage.parser;

import tr.com.teb.tebws.optimus.model.MainMethodResponse;
import tr.com.teb.tebws.optimus.utils.CommonWebServiceUtils;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;


@RequestScoped
public class MessageProcessor {
    @Inject
    CommonWebServiceUtils utils;

    public MainMethodResponse unmarshalResponse(String body) throws Exception {
        XMLInputFactory inputFactory = XMLInputFactory.newFactory();
        try {
            XMLStreamReader xsr = inputFactory.createXMLStreamReader(new ByteArrayInputStream(body.getBytes(StandardCharsets.UTF_8)));
            xsr.nextTag();
            xsr.nextTag();
            xsr.nextTag();
            JAXBContext jaxbContext = JAXBContext.newInstance(MainMethodResponse.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            JAXBElement<MainMethodResponse> jaxbElement = unmarshaller.unmarshal(xsr, MainMethodResponse.class);
            return jaxbElement.getValue();
        } catch (XMLStreamException e) {
            e.printStackTrace();
            throw new Exception(e);

        } catch (JAXBException e) {
            e.printStackTrace();
            throw new Exception(e);
        }
    }

    public StringBuffer prepareFinalResponse(MainMethodResponse response) {
        StringBuffer StrBuffer = new StringBuffer();
        StrBuffer.append("<MESSAGE>\n");
        StrBuffer.append("<RESULT>\n");
        StrBuffer.append("<RESULT_CODE>" + "0" + "</RESULT_CODE>\n");
        StrBuffer.append("<RESULT_STR>" + "OK" + "</RESULT_STR>\n");
        StrBuffer.append("</RESULT>\n");
        StrBuffer.append("<BSMAINMETHOD>\n");
        StrBuffer.append("<BSRESPONSE>");
        StrBuffer.append("<RESPONSE>");
        StrBuffer.append(utils.nullToEmpty(response.getMainMethodResult()));
        StrBuffer.append("</RESPONSE>\n");
        StrBuffer.append("<RESPONSECODE>");
        StrBuffer.append(utils.nullToEmpty(response.getPReturnCode()));
        StrBuffer.append("</RESPONSECODE>\n");
        StrBuffer.append("<RESPONSEMSG>");
        StrBuffer.append(utils.nullToEmpty(response.getPReturnMsg()));
        StrBuffer.append("</RESPONSEMSG>\n");
        StrBuffer.append("</BSRESPONSE>");
        StrBuffer.append("<OUTPUTXML>");
        StrBuffer.append(utils.nullToEmpty(response.getPOutputXML()));
        StrBuffer.append("</OUTPUTXML>\n");
        StrBuffer.append("</BSMAINMETHOD>\n");
        StrBuffer.append("</MESSAGE>\n");
        return StrBuffer;
    }

    public StringBuffer returnFault(Response response) throws Exception {
        StringBuffer sb = new StringBuffer();
        InputStream res = null;
        if (response != null) {
            try {
                res = (InputStream) response.getEntity();

                byte[] buf = new byte[1024];
                int length;
                try (InputStream is = res) {
                    while ((length = is.read(buf)) != -1) {
                        sb.append(new String(buf, 0, length));
                    }
                }
            } catch (Exception e) {
                throw new Exception(e);
            } finally {
                try {
                    if (res != null) {
                        res.close();
                    }
                } catch (IOException e) {
                    System.out.println("Failed to close streams");
                    throw new Exception(e);
                }
            }
        }
        return sb;
    }
}