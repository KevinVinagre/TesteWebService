
package ws.org;

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
@WebService(name = "wssoma", targetNamespace = "http://org.ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Wssoma {


    /**
     * 
     * @param x
     * @param y
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "soma", targetNamespace = "http://org.ws/", className = "ws.org.Soma")
    @ResponseWrapper(localName = "somaResponse", targetNamespace = "http://org.ws/", className = "ws.org.SomaResponse")
    @Action(input = "http://org.ws/wssoma/somaRequest", output = "http://org.ws/wssoma/somaResponse")
    public double soma(
        @WebParam(name = "x", targetNamespace = "")
        double x,
        @WebParam(name = "y", targetNamespace = "")
        double y);

}
