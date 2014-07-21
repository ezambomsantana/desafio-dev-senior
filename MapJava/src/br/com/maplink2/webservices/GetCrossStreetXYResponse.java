
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetCrossStreetXYResult" type="{http://webservices.maplink2.com.br}ArrayOfCrossStreetLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCrossStreetXYResult"
})
@XmlRootElement(name = "GetCrossStreetXYResponse")
public class GetCrossStreetXYResponse {

    @XmlElement(name = "GetCrossStreetXYResult")
    protected ArrayOfCrossStreetLocation getCrossStreetXYResult;

    /**
     * Gets the value of the getCrossStreetXYResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCrossStreetLocation }
     *     
     */
    public ArrayOfCrossStreetLocation getGetCrossStreetXYResult() {
        return getCrossStreetXYResult;
    }

    /**
     * Sets the value of the getCrossStreetXYResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCrossStreetLocation }
     *     
     */
    public void setGetCrossStreetXYResult(ArrayOfCrossStreetLocation value) {
        this.getCrossStreetXYResult = value;
    }

}
