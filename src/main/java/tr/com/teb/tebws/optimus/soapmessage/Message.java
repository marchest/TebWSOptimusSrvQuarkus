package tr.com.teb.tebws.optimus.soapmessage;

import tr.com.teb.tebws.optimus.model.MainMethod;

import javax.enterprise.context.RequestScoped;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringWriter;

@RequestScoped
@XmlRootElement(name="soap:Envelope")
public class Message {

    @XmlAttribute(name = "xmlns:soap")
    private final String soapEnv="http://www.w3.org/2003/05/soap-envelope";

    private String soapHeader="";

    private String soapBody;

    public String getSoapEnv() {
        return soapEnv;
    }
    @XmlElement(name="header")
    public String getSoapHeader() {
        return soapHeader;
    }

    public void setSoapHeader(String soapHeader) {
        this.soapHeader = soapHeader;
    }
    @XmlElement(name = "soap:Body")
    public String getSoapBody() {
        return soapBody;
    }

    public void setSoapBody(String soapBody) {
        this.soapBody =soapBody;

    }
}
