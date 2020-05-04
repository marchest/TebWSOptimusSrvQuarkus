
package tr.com.teb.tebws.optimus.model;

import io.quarkus.runtime.annotations.RegisterForReflection;

import javax.enterprise.context.RequestScoped;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="p_Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="p_CallerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="p_ServiceID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p_InputXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pPassword",
    "pCallerID",
    "pServiceID",
    "pInputXML"
})
@XmlRootElement(name = "MainMethod")
@RegisterForReflection
public class MainMethod {

    @XmlElement(name = "p_Password")
    protected String pPassword;
    @XmlElement(name = "p_CallerID")
    protected String pCallerID;
    @XmlElement(name = "p_ServiceID")
    protected int pServiceID;
    @XmlElement(name = "p_InputXML")
    protected String pInputXML;

    /**
     * Gets the value of the pPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPassword() {
        return pPassword;
    }

    /**
     * Sets the value of the pPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPassword(String value) {
        this.pPassword = value;
    }

    /**
     * Gets the value of the pCallerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCallerID() {
        return pCallerID;
    }

    /**
     * Sets the value of the pCallerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCallerID(String value) {
        this.pCallerID = value;
    }

    /**
     * Gets the value of the pServiceID property.
     * 
     */
    public int getPServiceID() {
        return pServiceID;
    }

    /**
     * Sets the value of the pServiceID property.
     * 
     */
    public void setPServiceID(int value) {
        this.pServiceID = value;
    }

    /**
     * Gets the value of the pInputXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPInputXML() {
        return pInputXML;
    }

    /**
     * Sets the value of the pInputXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPInputXML(String value) {
        this.pInputXML = value;
    }

}
