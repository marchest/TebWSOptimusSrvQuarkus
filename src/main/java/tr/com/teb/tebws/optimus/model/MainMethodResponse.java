
package tr.com.teb.tebws.optimus.model;

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
 *         &lt;element name="MainMethodResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="p_ReturnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="p_ReturnMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="p_OutputXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "mainMethodResult",
    "pReturnCode",
    "pReturnMsg",
    "pOutputXML"
})
@XmlRootElement(name = "MainMethodResponse")
public class MainMethodResponse {

    @XmlElement(name = "MainMethodResult")
    protected String mainMethodResult;
    @XmlElement(name = "p_ReturnCode")
    protected String pReturnCode;
    @XmlElement(name = "p_ReturnMsg")
    protected String pReturnMsg;
    @XmlElement(name = "p_OutputXML")
    protected String pOutputXML;

    /**
     * Gets the value of the mainMethodResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainMethodResult() {
        return mainMethodResult;
    }

    /**
     * Sets the value of the mainMethodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainMethodResult(String value) {
        this.mainMethodResult = value;
    }

    /**
     * Gets the value of the pReturnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPReturnCode() {
        return pReturnCode;
    }

    /**
     * Sets the value of the pReturnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPReturnCode(String value) {
        this.pReturnCode = value;
    }

    /**
     * Gets the value of the pReturnMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPReturnMsg() {
        return pReturnMsg;
    }

    /**
     * Sets the value of the pReturnMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPReturnMsg(String value) {
        this.pReturnMsg = value;
    }

    /**
     * Gets the value of the pOutputXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOutputXML() {
        return pOutputXML;
    }

    /**
     * Sets the value of the pOutputXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOutputXML(String value) {
        this.pOutputXML = value;
    }

}
