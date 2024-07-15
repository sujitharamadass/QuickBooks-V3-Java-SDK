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
 * <p>Java class for AttachableCategoryEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AttachableCategoryEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Image"/&gt;
 *     &lt;enumeration value="Signature"/&gt;
 *     &lt;enumeration value="Contact Photo"/&gt;
 *     &lt;enumeration value="Receipt"/&gt;
 *     &lt;enumeration value="Document"/&gt;
 *     &lt;enumeration value="Sound"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AttachableCategoryEnum")
@XmlEnum
public enum AttachableCategoryEnum {

    @XmlEnumValue("Image")
    IMAGE("Image"),
    @XmlEnumValue("Signature")
    SIGNATURE("Signature"),
    @XmlEnumValue("Contact Photo")
    CONTACT_PHOTO("Contact Photo"),
    @XmlEnumValue("Receipt")
    RECEIPT("Receipt"),
    @XmlEnumValue("Document")
    DOCUMENT("Document"),
    @XmlEnumValue("Sound")
    SOUND("Sound"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    AttachableCategoryEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttachableCategoryEnum fromValue(String v) {
        for (AttachableCategoryEnum c: AttachableCategoryEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
