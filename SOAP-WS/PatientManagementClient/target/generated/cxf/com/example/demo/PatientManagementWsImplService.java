package com.example.demo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;
import org.example.patientmanagement.PatientManagementPortType;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2023-04-24T10:56:32.789+05:30
 * Generated source version: 3.3.0
 *
 */
@WebServiceClient(name = "PatientManagementWsImplService",
                  wsdlLocation = "file:/E:/spring-suite-tool-workspace/PatientManagementClient/src/main/resources/wsdl/patientManagementService.wsdl",
                  targetNamespace = "http://demo.example.com/")
public class PatientManagementWsImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://demo.example.com/", "PatientManagementWsImplService");
    public final static QName PatientManagementWsImplPort = new QName("http://demo.example.com/", "PatientManagementWsImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/E:/spring-suite-tool-workspace/PatientManagementClient/src/main/resources/wsdl/patientManagementService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PatientManagementWsImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/E:/spring-suite-tool-workspace/PatientManagementClient/src/main/resources/wsdl/patientManagementService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PatientManagementWsImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PatientManagementWsImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PatientManagementWsImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public PatientManagementWsImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public PatientManagementWsImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public PatientManagementWsImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns PatientManagementPortType
     */
    @WebEndpoint(name = "PatientManagementWsImplPort")
    public PatientManagementPortType getPatientManagementWsImplPort() {
        return super.getPort(PatientManagementWsImplPort, PatientManagementPortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PatientManagementPortType
     */
    @WebEndpoint(name = "PatientManagementWsImplPort")
    public PatientManagementPortType getPatientManagementWsImplPort(WebServiceFeature... features) {
        return super.getPort(PatientManagementWsImplPort, PatientManagementPortType.class, features);
    }

}
