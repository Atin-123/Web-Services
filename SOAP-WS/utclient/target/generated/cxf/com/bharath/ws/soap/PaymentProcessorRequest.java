
package com.bharath.ws.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentProcessorRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentProcessorRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentProcessorRequest" type="{http://soap.ws.bharath.com/}CreditCardInfo"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentProcessorRequest", propOrder = {
    "paymentProcessorRequest",
    "amount"
})
public class PaymentProcessorRequest {

    @XmlElement(name = "PaymentProcessorRequest", required = true)
    protected CreditCardInfo paymentProcessorRequest;
    protected Double amount;

    /**
     * Gets the value of the paymentProcessorRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardInfo }
     *     
     */
    public CreditCardInfo getPaymentProcessorRequest() {
        return paymentProcessorRequest;
    }

    /**
     * Sets the value of the paymentProcessorRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardInfo }
     *     
     */
    public void setPaymentProcessorRequest(CreditCardInfo value) {
        this.paymentProcessorRequest = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

}
