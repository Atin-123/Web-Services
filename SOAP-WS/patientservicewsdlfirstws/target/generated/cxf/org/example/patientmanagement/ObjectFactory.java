
package org.example.patientmanagement;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.patientmanagement package. 
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

    private final static QName _CheckPatientRequest_QNAME = new QName("http://www.example.org/PatientManagement/", "checkPatientRequest");
    private final static QName _CheckPatientResponse_QNAME = new QName("http://www.example.org/PatientManagement/", "checkPatientResponse");
    private final static QName _AdmitPatientRequest_QNAME = new QName("http://www.example.org/PatientManagement/", "admitPatientRequest");
    private final static QName _AdmitPatientResponse_QNAME = new QName("http://www.example.org/PatientManagement/", "admitPatientResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.patientmanagement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckPatientRequest }
     * 
     */
    public CheckPatientRequest createCheckPatientRequest() {
        return new CheckPatientRequest();
    }

    /**
     * Create an instance of {@link CheckPatientResponse }
     * 
     */
    public CheckPatientResponse createCheckPatientResponse() {
        return new CheckPatientResponse();
    }

    /**
     * Create an instance of {@link AdmitPatientRequest }
     * 
     */
    public AdmitPatientRequest createAdmitPatientRequest() {
        return new AdmitPatientRequest();
    }

    /**
     * Create an instance of {@link AdmitPatientResponse }
     * 
     */
    public AdmitPatientResponse createAdmitPatientResponse() {
        return new AdmitPatientResponse();
    }

    /**
     * Create an instance of {@link PatientDetails }
     * 
     */
    public PatientDetails createPatientDetails() {
        return new PatientDetails();
    }

    /**
     * Create an instance of {@link Patient }
     * 
     */
    public Patient createPatient() {
        return new Patient();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPatientRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckPatientRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.example.org/PatientManagement/", name = "checkPatientRequest")
    public JAXBElement<CheckPatientRequest> createCheckPatientRequest(CheckPatientRequest value) {
        return new JAXBElement<CheckPatientRequest>(_CheckPatientRequest_QNAME, CheckPatientRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPatientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckPatientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.example.org/PatientManagement/", name = "checkPatientResponse")
    public JAXBElement<CheckPatientResponse> createCheckPatientResponse(CheckPatientResponse value) {
        return new JAXBElement<CheckPatientResponse>(_CheckPatientResponse_QNAME, CheckPatientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdmitPatientRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdmitPatientRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.example.org/PatientManagement/", name = "admitPatientRequest")
    public JAXBElement<AdmitPatientRequest> createAdmitPatientRequest(AdmitPatientRequest value) {
        return new JAXBElement<AdmitPatientRequest>(_AdmitPatientRequest_QNAME, AdmitPatientRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdmitPatientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdmitPatientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.example.org/PatientManagement/", name = "admitPatientResponse")
    public JAXBElement<AdmitPatientResponse> createAdmitPatientResponse(AdmitPatientResponse value) {
        return new JAXBElement<AdmitPatientResponse>(_AdmitPatientResponse_QNAME, AdmitPatientResponse.class, null, value);
    }

}
