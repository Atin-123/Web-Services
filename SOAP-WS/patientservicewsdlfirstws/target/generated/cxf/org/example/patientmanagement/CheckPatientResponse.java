
package org.example.patientmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkPatientResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkPatientResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="patientDetails" type="{http://www.example.org/PatientManagement/}patientDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkPatientResponse", propOrder = {
    "patientDetails"
})
public class CheckPatientResponse {

    @XmlElement(required = true)
    protected PatientDetails patientDetails;

    /**
     * Gets the value of the patientDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PatientDetails }
     *     
     */
    public PatientDetails getPatientDetails() {
        return patientDetails;
    }

    /**
     * Sets the value of the patientDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientDetails }
     *     
     */
    public void setPatientDetails(PatientDetails value) {
        this.patientDetails = value;
    }

}
