
package org.example.patientmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for patientDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="patientDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roomNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bedNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="admitDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "patientDetails", propOrder = {
    "roomNo",
    "bedNo",
    "admitDate"
})
public class PatientDetails {

    @XmlElement(required = true)
    protected String roomNo;
    @XmlElement(required = true)
    protected String bedNo;
    @XmlElement(required = true)
    protected String admitDate;

    /**
     * Gets the value of the roomNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * Sets the value of the roomNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomNo(String value) {
        this.roomNo = value;
    }

    /**
     * Gets the value of the bedNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * Sets the value of the bedNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedNo(String value) {
        this.bedNo = value;
    }

    /**
     * Gets the value of the admitDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmitDate() {
        return admitDate;
    }

    /**
     * Sets the value of the admitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdmitDate(String value) {
        this.admitDate = value;
    }

}
