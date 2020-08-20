
package ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CalculoSueldo", targetNamespace = "http://WS/", wsdlLocation = "http://localhost:8080/DGIP/CalculoSueldo?wsdl")
public class CalculoSueldo_Service
    extends Service
{

    private final static URL CALCULOSUELDO_WSDL_LOCATION;
    private final static WebServiceException CALCULOSUELDO_EXCEPTION;
    private final static QName CALCULOSUELDO_QNAME = new QName("http://WS/", "CalculoSueldo");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/DGIP/CalculoSueldo?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCULOSUELDO_WSDL_LOCATION = url;
        CALCULOSUELDO_EXCEPTION = e;
    }

    public CalculoSueldo_Service() {
        super(__getWsdlLocation(), CALCULOSUELDO_QNAME);
    }

    public CalculoSueldo_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCULOSUELDO_QNAME, features);
    }

    public CalculoSueldo_Service(URL wsdlLocation) {
        super(wsdlLocation, CALCULOSUELDO_QNAME);
    }

    public CalculoSueldo_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCULOSUELDO_QNAME, features);
    }

    public CalculoSueldo_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalculoSueldo_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CalculoSueldo
     */
    @WebEndpoint(name = "CalculoSueldoPort")
    public CalculoSueldo getCalculoSueldoPort() {
        return super.getPort(new QName("http://WS/", "CalculoSueldoPort"), CalculoSueldo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculoSueldo
     */
    @WebEndpoint(name = "CalculoSueldoPort")
    public CalculoSueldo getCalculoSueldoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WS/", "CalculoSueldoPort"), CalculoSueldo.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCULOSUELDO_EXCEPTION!= null) {
            throw CALCULOSUELDO_EXCEPTION;
        }
        return CALCULOSUELDO_WSDL_LOCATION;
    }

}
