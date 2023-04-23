package com.example.demo;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;
import org.example.customerorders.CustomerOrdersPortType;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2023-04-23T20:16:30.748+05:30
 * Generated source version: 3.3.0
 *
 */
@WebServiceClient(name = "CustomerOrdersWsImplService",
                  wsdlLocation = "classpath:CustomerOrders.wsdl",
                  targetNamespace = "http://demo.example.com/")
public class CustomerOrdersWsImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://demo.example.com/", "CustomerOrdersWsImplService");
    public final static QName CustomerOrdersWsImplPort = new QName("http://demo.example.com/", "CustomerOrdersWsImplPort");
    static {
        URL url = CustomerOrdersWsImplService.class.getClassLoader().getResource("CustomerOrders.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(CustomerOrdersWsImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:CustomerOrders.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CustomerOrdersWsImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CustomerOrdersWsImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CustomerOrdersWsImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public CustomerOrdersWsImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CustomerOrdersWsImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CustomerOrdersWsImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns CustomerOrdersPortType
     */
    @WebEndpoint(name = "CustomerOrdersWsImplPort")
    public CustomerOrdersPortType getCustomerOrdersWsImplPort() {
        return super.getPort(CustomerOrdersWsImplPort, CustomerOrdersPortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CustomerOrdersPortType
     */
    @WebEndpoint(name = "CustomerOrdersWsImplPort")
    public CustomerOrdersPortType getCustomerOrdersWsImplPort(WebServiceFeature... features) {
        return super.getPort(CustomerOrdersWsImplPort, CustomerOrdersPortType.class, features);
    }

}