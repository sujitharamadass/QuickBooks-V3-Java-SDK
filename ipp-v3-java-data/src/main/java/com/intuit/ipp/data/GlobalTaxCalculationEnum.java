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
 * <p>Java class for GlobalTaxCalculationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalTaxCalculationEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TaxInclusive"/&gt;
 *     &lt;enumeration value="TaxExcluded"/&gt;
 *     &lt;enumeration value="NotApplicable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalTaxCalculationEnum")
@XmlEnum
public enum GlobalTaxCalculationEnum {

    @XmlEnumValue("TaxInclusive")
    TAX_INCLUSIVE("TaxInclusive"),
    @XmlEnumValue("TaxExcluded")
    TAX_EXCLUDED("TaxExcluded"),
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable");
    private final String value;

    GlobalTaxCalculationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalTaxCalculationEnum fromValue(String v) {
        for (GlobalTaxCalculationEnum c: GlobalTaxCalculationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
