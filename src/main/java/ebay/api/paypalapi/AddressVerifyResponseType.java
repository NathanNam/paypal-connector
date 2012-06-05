/**
 * Mule Paypal Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package ebay.api.paypalapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ebay.apis.eblbasecomponents.AbstractResponseType;
import ebay.apis.eblbasecomponents.AddressStatusCodeType;
import ebay.apis.eblbasecomponents.CountryCodeType;
import ebay.apis.eblbasecomponents.MatchStatusCodeType;


/**
 * <p>Java class for AddressVerifyResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressVerifyResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="ConfirmationCode" type="{urn:ebay:apis:eBLBaseComponents}AddressStatusCodeType"/>
 *         &lt;element name="StreetMatch" type="{urn:ebay:apis:eBLBaseComponents}MatchStatusCodeType"/>
 *         &lt;element name="ZipMatch" type="{urn:ebay:apis:eBLBaseComponents}MatchStatusCodeType" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{urn:ebay:apis:eBLBaseComponents}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="PayPalToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressVerifyResponseType", propOrder = {
    "confirmationCode",
    "streetMatch",
    "zipMatch",
    "countryCode",
    "payPalToken"
})
public class AddressVerifyResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "ConfirmationCode", required = true)
    protected AddressStatusCodeType confirmationCode;
    @XmlElement(name = "StreetMatch", required = true)
    protected MatchStatusCodeType streetMatch;
    @XmlElement(name = "ZipMatch")
    protected MatchStatusCodeType zipMatch;
    @XmlElement(name = "CountryCode")
    protected CountryCodeType countryCode;
    @XmlElement(name = "PayPalToken")
    protected String payPalToken;

    /**
     * Gets the value of the confirmationCode property.
     * 
     * @return
     *     possible object is
     *     {@link AddressStatusCodeType }
     *     
     */
    public AddressStatusCodeType getConfirmationCode() {
        return confirmationCode;
    }

    /**
     * Sets the value of the confirmationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressStatusCodeType }
     *     
     */
    public void setConfirmationCode(AddressStatusCodeType value) {
        this.confirmationCode = value;
    }

    /**
     * Gets the value of the streetMatch property.
     * 
     * @return
     *     possible object is
     *     {@link MatchStatusCodeType }
     *     
     */
    public MatchStatusCodeType getStreetMatch() {
        return streetMatch;
    }

    /**
     * Sets the value of the streetMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchStatusCodeType }
     *     
     */
    public void setStreetMatch(MatchStatusCodeType value) {
        this.streetMatch = value;
    }

    /**
     * Gets the value of the zipMatch property.
     * 
     * @return
     *     possible object is
     *     {@link MatchStatusCodeType }
     *     
     */
    public MatchStatusCodeType getZipMatch() {
        return zipMatch;
    }

    /**
     * Sets the value of the zipMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchStatusCodeType }
     *     
     */
    public void setZipMatch(MatchStatusCodeType value) {
        this.zipMatch = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountryCode(CountryCodeType value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the payPalToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayPalToken() {
        return payPalToken;
    }

    /**
     * Sets the value of the payPalToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayPalToken(String value) {
        this.payPalToken = value;
    }

}