
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _SueldoCalculado_QNAME = new QName("http://WS/", "SueldoCalculado");
    private final static QName _SueldoCalculadoResponse_QNAME = new QName("http://WS/", "SueldoCalculadoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SueldoCalculado }
     * 
     */
    public SueldoCalculado createSueldoCalculado() {
        return new SueldoCalculado();
    }

    /**
     * Create an instance of {@link SueldoCalculadoResponse }
     * 
     */
    public SueldoCalculadoResponse createSueldoCalculadoResponse() {
        return new SueldoCalculadoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SueldoCalculado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "SueldoCalculado")
    public JAXBElement<SueldoCalculado> createSueldoCalculado(SueldoCalculado value) {
        return new JAXBElement<SueldoCalculado>(_SueldoCalculado_QNAME, SueldoCalculado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SueldoCalculadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "SueldoCalculadoResponse")
    public JAXBElement<SueldoCalculadoResponse> createSueldoCalculadoResponse(SueldoCalculadoResponse value) {
        return new JAXBElement<SueldoCalculadoResponse>(_SueldoCalculadoResponse_QNAME, SueldoCalculadoResponse.class, null, value);
    }

}
