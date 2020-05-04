package tr.com.teb.tebws.optimus.soapmessage;

import tr.com.teb.tebws.optimus.model.MainMethod;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;


@RequestScoped
public class BuildSoapMessage {
    @Inject
    private Message message;

    public String buildMessage(MainMethod mainMethod) throws Exception {
        try {

            StringWriter writer = new StringWriter();
            JAXBContext mainMethodContext = JAXBContext.newInstance(MainMethod.class);
            Marshaller mainMethodMarshaller = mainMethodContext.createMarshaller();
            mainMethodMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
            mainMethodMarshaller.marshal(mainMethod, writer);
            message.setSoapBody(writer.toString());
            writer = new StringWriter();
            JAXBContext messageContext = JAXBContext.newInstance(Message.class);
            Marshaller messageMarshaller = messageContext.createMarshaller();
            messageMarshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            messageMarshaller.marshal(message, writer);
            String rawMessage=writer.toString();
            rawMessage=rawMessage.replace("&lt;","<");
            rawMessage=rawMessage.replace("&gt;",">");
            rawMessage=rawMessage.replace("amp;","");
            return rawMessage;
        }catch (Exception e){
            throw new Exception("Error while building soap message"+e.getMessage());
        }
    }

}
