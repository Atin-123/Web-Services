package org.example.patientmanagement;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2023-04-22T23:55:22.732+05:30
 * Generated source version: 3.3.0
 *
 */
@WebServiceClient(name = "PatientManagement",
                  wsdlLocation = "file:/D:/sprintToolSuite-workspace/patientservicewsdlfirstws/src/main/resources/wsdl/PatientManagement.wsdl",
                  targetNamespace = "http://www.example.org/PatientManagement/")
public class PatientManagement extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.example.org/PatientManagement/", "PatientManagement");
    public final static QName PatientManagementPort = new QName("http://www.example.org/PatientManagement/", "PatientManagementPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/sprintToolSuite-workspace/patientservicewsdlfirstws/src/main/resources/wsdl/PatientManagement.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PatientManagement.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/D:/sprintToolSuite-workspace/patientservicewsdlfirstws/src/main/resources/wsdl/PatientManagement.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PatientManagement(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PatientManagement(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PatientManagement() {
        super(WSDL_LOCATION, SERVICE);
    }

    public PatientManagement(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public PatientManagement(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public PatientManagement(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns PatientManagementPortType
     */
    @WebEndpoint(name = "PatientManagementPort")
    public PatientManagementPortType getPatientManagementPort() {
        return super.getPort(PatientManagementPort, PatientManagementPortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PatientManagementPortType
     */
    @WebEndpoint(name = "PatientManagementPort")
    public PatientManagementPortType getPatientManagementPort(WebServiceFeature... features) {
        return super.getPort(PatientManagementPort, PatientManagementPortType.class, features);
    }

}
