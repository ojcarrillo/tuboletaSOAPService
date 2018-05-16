package org.tuboleta.demo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-05-16T01:40:23.817-05:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "TuBoletaService",
                  wsdlLocation = "file:/D:/oxygen/eclipse-workspace/tuboletaSOAPService/src/main/resources/wsdl/tuboleta.wsdl",
                  targetNamespace = "http://www.tuboleta.org/demo/")
public class TuBoletaService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.tuboleta.org/demo/", "TuBoletaService");
    public final static QName TuBoletaServicesEndpoint = new QName("http://www.tuboleta.org/demo/", "TuBoletaServicesEndpoint");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/oxygen/eclipse-workspace/tuboletaSOAPService/src/main/resources/wsdl/tuboleta.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TuBoletaService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/D:/oxygen/eclipse-workspace/tuboletaSOAPService/src/main/resources/wsdl/tuboleta.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TuBoletaService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TuBoletaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TuBoletaService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public TuBoletaService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public TuBoletaService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public TuBoletaService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns TuBoletaSystemServices
     */
    @WebEndpoint(name = "TuBoletaServicesEndpoint")
    public TuBoletaSystemServices getTuBoletaServicesEndpoint() {
        return super.getPort(TuBoletaServicesEndpoint, TuBoletaSystemServices.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TuBoletaSystemServices
     */
    @WebEndpoint(name = "TuBoletaServicesEndpoint")
    public TuBoletaSystemServices getTuBoletaServicesEndpoint(WebServiceFeature... features) {
        return super.getPort(TuBoletaServicesEndpoint, TuBoletaSystemServices.class, features);
    }

}
