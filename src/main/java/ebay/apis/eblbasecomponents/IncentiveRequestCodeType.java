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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncentiveRequestCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IncentiveRequestCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="InCheckout"/>
 *     &lt;enumeration value="PreCheckout"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IncentiveRequestCodeType")
@XmlEnum
public enum IncentiveRequestCodeType {

    @XmlEnumValue("InCheckout")
    IN_CHECKOUT("InCheckout"),
    @XmlEnumValue("PreCheckout")
    PRE_CHECKOUT("PreCheckout");
    private final String value;

    IncentiveRequestCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IncentiveRequestCodeType fromValue(String v) {
        for (IncentiveRequestCodeType c: IncentiveRequestCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}