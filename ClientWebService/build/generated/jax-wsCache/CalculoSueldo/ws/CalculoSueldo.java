
package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculoSueldo", targetNamespace = "http://WS/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculoSueldo {


    /**
     * 
     * @param con
     * @param sueldohora
     * @param dia7
     * @param dia6
     * @param dia5
     * @param dia4
     * @param dia3
     * @param dia2
     * @param dia1
     * @return
     *     returns int
     */
    @WebMethod(operationName = "SueldoCalculado")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SueldoCalculado", targetNamespace = "http://WS/", className = "ws.SueldoCalculado")
    @ResponseWrapper(localName = "SueldoCalculadoResponse", targetNamespace = "http://WS/", className = "ws.SueldoCalculadoResponse")
    @Action(input = "http://WS/CalculoSueldo/SueldoCalculadoRequest", output = "http://WS/CalculoSueldo/SueldoCalculadoResponse")
    public int sueldoCalculado(
        @WebParam(name = "sueldohora", targetNamespace = "")
        double sueldohora,
        @WebParam(name = "dia1", targetNamespace = "")
        int dia1,
        @WebParam(name = "dia2", targetNamespace = "")
        int dia2,
        @WebParam(name = "dia3", targetNamespace = "")
        int dia3,
        @WebParam(name = "dia4", targetNamespace = "")
        int dia4,
        @WebParam(name = "dia5", targetNamespace = "")
        int dia5,
        @WebParam(name = "dia6", targetNamespace = "")
        int dia6,
        @WebParam(name = "dia7", targetNamespace = "")
        int dia7,
        @WebParam(name = "con", targetNamespace = "")
        int con);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://WS/", className = "ws.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://WS/", className = "ws.HelloResponse")
    @Action(input = "http://WS/CalculoSueldo/helloRequest", output = "http://WS/CalculoSueldo/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}