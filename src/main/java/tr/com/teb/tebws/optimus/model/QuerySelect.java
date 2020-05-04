
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
 *         &lt;element name="p_ConStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="p_SQL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "pConStr",
    "psql"
})
@XmlRootElement(name = "QuerySelect")
public class QuerySelect {

    @XmlElement(name = "p_ConStr")
    protected String pConStr;
    @XmlElement(name = "p_SQL")
    protected String psql;

    /**
     * Gets the value of the pConStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPConStr() {
        return pConStr;
    }

    /**
     * Sets the value of the pConStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPConStr(String value) {
        this.pConStr = value;
    }

    /**
     * Gets the value of the psql property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSQL() {
        return psql;
    }

    /**
     * Sets the value of the psql property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSQL(String value) {
        this.psql = value;
    }

}
