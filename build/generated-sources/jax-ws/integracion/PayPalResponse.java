
package integracion;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayPalResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayPalResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operationError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayPalResponse", propOrder = {
    "operationError"
})
@XmlSeeAlso({
    LoginPayPalResponse.class,
    PagarPayPalResponse.class
})
public class PayPalResponse implements Serializable{

    protected String operationError;

    /**
     * Gets the value of the operationError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationError() {
        return operationError;
    }

    /**
     * Sets the value of the operationError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationError(String value) {
        this.operationError = value;
    }

}
