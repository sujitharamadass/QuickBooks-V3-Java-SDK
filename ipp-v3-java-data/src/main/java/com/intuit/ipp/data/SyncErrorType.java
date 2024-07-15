//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.07.12 at 12:19:07 PM IST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SyncErrorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SyncErrorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OutOfSync"/&gt;
 *     &lt;enumeration value="BusinessLogic"/&gt;
 *     &lt;enumeration value="SystemError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SyncErrorType")
@XmlEnum
public enum SyncErrorType {

    @XmlEnumValue("OutOfSync")
    OUT_OF_SYNC("OutOfSync"),
    @XmlEnumValue("BusinessLogic")
    BUSINESS_LOGIC("BusinessLogic"),
    @XmlEnumValue("SystemError")
    SYSTEM_ERROR("SystemError");
    private final String value;

    SyncErrorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SyncErrorType fromValue(String v) {
        for (SyncErrorType c: SyncErrorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
