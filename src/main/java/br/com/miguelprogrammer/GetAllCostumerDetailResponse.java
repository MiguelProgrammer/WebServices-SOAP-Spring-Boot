//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.09 at 10:24:13 AM BRT 
//


package br.com.miguelprogrammer;

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
 *         &lt;element name="CostumerDetail" type="{http://miguelprogrammer.com.br}CostumerDetail"/>
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
    "costumerDetail"
})
@XmlRootElement(name = "GetAllCostumerDetailResponse")
public class GetAllCostumerDetailResponse {

    @XmlElement(name = "CostumerDetail", required = true)
    protected CostumerDetail costumerDetail;

    /**
     * Gets the value of the costumerDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CostumerDetail }
     *     
     */
    public CostumerDetail getCostumerDetail() {
        return costumerDetail;
    }

    /**
     * Sets the value of the costumerDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostumerDetail }
     *     
     */
    public void setCostumerDetail(CostumerDetail value) {
        this.costumerDetail = value;
    }

}