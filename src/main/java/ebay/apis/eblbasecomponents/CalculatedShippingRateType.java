/**
 * Mule Paypal Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package ebay.apis.eblbasecomponents;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ebay.apis.corecomponenttypes.MeasureType;


/**
 * <p>Java class for CalculatedShippingRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculatedShippingRateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginatingPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingIrregular" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CarrierDetails" type="{urn:ebay:apis:eBLBaseComponents}ShippingCarrierDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingPackage" type="{urn:ebay:apis:eBLBaseComponents}ShippingPackageCodeType" minOccurs="0"/>
 *         &lt;element name="WeightMajor" type="{urn:ebay:apis:CoreComponentTypes}MeasureType" minOccurs="0"/>
 *         &lt;element name="WeightMinor" type="{urn:ebay:apis:CoreComponentTypes}MeasureType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculatedShippingRateType", propOrder = {
    "originatingPostalCode",
    "shippingIrregular",
    "carrierDetails",
    "shippingPackage",
    "weightMajor",
    "weightMinor"
})
public class CalculatedShippingRateType {

    @XmlElement(name = "OriginatingPostalCode")
    protected String originatingPostalCode;
    @XmlElement(name = "ShippingIrregular")
    protected Boolean shippingIrregular;
    @XmlElement(name = "CarrierDetails")
    protected List<ShippingCarrierDetailsType> carrierDetails;
    @XmlElement(name = "ShippingPackage")
    protected ShippingPackageCodeType shippingPackage;
    @XmlElement(name = "WeightMajor")
    protected MeasureType weightMajor;
    @XmlElement(name = "WeightMinor")
    protected MeasureType weightMinor;

    /**
     * Gets the value of the originatingPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingPostalCode() {
        return originatingPostalCode;
    }

    /**
     * Sets the value of the originatingPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingPostalCode(String value) {
        this.originatingPostalCode = value;
    }

    /**
     * Gets the value of the shippingIrregular property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShippingIrregular() {
        return shippingIrregular;
    }

    /**
     * Sets the value of the shippingIrregular property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShippingIrregular(Boolean value) {
        this.shippingIrregular = value;
    }

    /**
     * Gets the value of the carrierDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingCarrierDetailsType }
     * 
     * 
     */
    public List<ShippingCarrierDetailsType> getCarrierDetails() {
        if (carrierDetails == null) {
            carrierDetails = new ArrayList<ShippingCarrierDetailsType>();
        }
        return this.carrierDetails;
    }

    /**
     * Gets the value of the shippingPackage property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingPackageCodeType }
     *     
     */
    public ShippingPackageCodeType getShippingPackage() {
        return shippingPackage;
    }

    /**
     * Sets the value of the shippingPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingPackageCodeType }
     *     
     */
    public void setShippingPackage(ShippingPackageCodeType value) {
        this.shippingPackage = value;
    }

    /**
     * Gets the value of the weightMajor property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getWeightMajor() {
        return weightMajor;
    }

    /**
     * Sets the value of the weightMajor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setWeightMajor(MeasureType value) {
        this.weightMajor = value;
    }

    /**
     * Gets the value of the weightMinor property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getWeightMinor() {
        return weightMinor;
    }

    /**
     * Sets the value of the weightMinor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setWeightMinor(MeasureType value) {
        this.weightMinor = value;
    }

}