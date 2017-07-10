//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.10 at 10:56:50 AM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Defines Messages Prefs details 
 * 
 * <p>Java class for PrintDocumentPrefs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrintDocumentPrefs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NameValue" type="{http://schema.intuit.com/finance/v3}NameValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrintDocumentPrefs", propOrder = {
    "nameValue"
})
public class PrintDocumentPrefs implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "NameValue")
    protected List<NameValue> nameValue;

    /**
     * Gets the value of the nameValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValue }
     * 
     * 
     */
    public List<NameValue> getNameValue() {
        if (nameValue == null) {
            nameValue = new ArrayList<NameValue>();
        }
        return this.nameValue;
    }

    /**
     * Sets the value of the nameValue property.
     * 
     * @param nameValue
     *     allowed object is
     *     {@link NameValue }
     *     
     */
    public void setNameValue(List<NameValue> nameValue) {
        this.nameValue = nameValue;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PrintDocumentPrefs that = ((PrintDocumentPrefs) object);
        {
            List<NameValue> lhsNameValue;
            lhsNameValue = (((this.nameValue!= null)&&(!this.nameValue.isEmpty()))?this.getNameValue():null);
            List<NameValue> rhsNameValue;
            rhsNameValue = (((that.nameValue!= null)&&(!that.nameValue.isEmpty()))?that.getNameValue():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nameValue", lhsNameValue), LocatorUtils.property(thatLocator, "nameValue", rhsNameValue), lhsNameValue, rhsNameValue, ((this.nameValue!= null)&&(!this.nameValue.isEmpty())), ((that.nameValue!= null)&&(!that.nameValue.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            List<NameValue> theNameValue;
            theNameValue = (((this.nameValue!= null)&&(!this.nameValue.isEmpty()))?this.getNameValue():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nameValue", theNameValue), currentHashCode, theNameValue, ((this.nameValue!= null)&&(!this.nameValue.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
