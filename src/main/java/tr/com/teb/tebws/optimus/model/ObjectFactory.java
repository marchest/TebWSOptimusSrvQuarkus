
package tr.com.teb.tebws.optimus.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservicecard.teb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _String_QNAME = new QName("TEB.WebServiceCard", "string");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservicecard.teb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOptimusODMResponse }
     * 
     */
    public GetOptimusODMResponse createGetOptimusODMResponse() {
        return new GetOptimusODMResponse();
    }

    /**
     * Create an instance of {@link GetOptimusTST }
     * 
     */
    public GetOptimusTST createGetOptimusTST() {
        return new GetOptimusTST();
    }

    /**
     * Create an instance of {@link WebServiceVersion }
     * 
     */
    public WebServiceVersion createWebServiceVersion() {
        return new WebServiceVersion();
    }

    /**
     * Create an instance of {@link QuerySelectResponse }
     * 
     */
    public QuerySelectResponse createQuerySelectResponse() {
        return new QuerySelectResponse();
    }

    /**
     * Create an instance of {@link QuerySelectResponse.PDataTable }
     * 
     */
    public QuerySelectResponse.PDataTable createQuerySelectResponsePDataTable() {
        return new QuerySelectResponse.PDataTable();
    }

    /**
     * Create an instance of {@link QueryUpdateResponse }
     * 
     */
    public QueryUpdateResponse createQueryUpdateResponse() {
        return new QueryUpdateResponse();
    }

    /**
     * Create an instance of {@link GetOptimusTSTResponse }
     * 
     */
    public GetOptimusTSTResponse createGetOptimusTSTResponse() {
        return new GetOptimusTSTResponse();
    }

    /**
     * Create an instance of {@link GetOptimusDEV }
     * 
     */
    public GetOptimusDEV createGetOptimusDEV() {
        return new GetOptimusDEV();
    }

    /**
     * Create an instance of {@link MainMethod }
     * 
     */
    public MainMethod createMainMethod() {
        return new MainMethod();
    }

    /**
     * Create an instance of {@link GetOptimusPREPRODResponse }
     * 
     */
    public GetOptimusPREPRODResponse createGetOptimusPREPRODResponse() {
        return new GetOptimusPREPRODResponse();
    }

    /**
     * Create an instance of {@link WebServiceVersionResponse }
     * 
     */
    public WebServiceVersionResponse createWebServiceVersionResponse() {
        return new WebServiceVersionResponse();
    }

    /**
     * Create an instance of {@link GetOptimusPREPROD }
     * 
     */
    public GetOptimusPREPROD createGetOptimusPREPROD() {
        return new GetOptimusPREPROD();
    }

    /**
     * Create an instance of {@link GetOptimusPRDResponse }
     * 
     */
    public GetOptimusPRDResponse createGetOptimusPRDResponse() {
        return new GetOptimusPRDResponse();
    }

    /**
     * Create an instance of {@link GetOptimusDEVResponse }
     * 
     */
    public GetOptimusDEVResponse createGetOptimusDEVResponse() {
        return new GetOptimusDEVResponse();
    }

    /**
     * Create an instance of {@link MainMethodResponse }
     * 
     */
    public MainMethodResponse createMainMethodResponse() {
        return new MainMethodResponse();
    }

    /**
     * Create an instance of {@link QueryUpdate }
     * 
     */
    public QueryUpdate createQueryUpdate() {
        return new QueryUpdate();
    }

    /**
     * Create an instance of {@link GetOptimusPRD }
     * 
     */
    public GetOptimusPRD createGetOptimusPRD() {
        return new GetOptimusPRD();
    }

    /**
     * Create an instance of {@link GetOptimusODM }
     * 
     */
    public GetOptimusODM createGetOptimusODM() {
        return new GetOptimusODM();
    }

    /**
     * Create an instance of {@link QuerySelect }
     * 
     */
    public QuerySelect createQuerySelect() {
        return new QuerySelect();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "TEB.WebServiceCard", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

}
