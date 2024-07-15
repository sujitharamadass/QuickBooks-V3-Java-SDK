//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.07.12 at 12:19:07 PM IST 
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
 *  Product: QBO Description: Holder for a collection of Cascade objects. Used by messaging. Not intended for external clients.  
 * 
 * <p>Java class for CascadeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CascadeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cascade" type="{http://schema.intuit.com/finance/v3}Cascade" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CascadeResponse", propOrder = {
    "cascade"
})
public class CascadeResponse implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Cascade")
    protected List<Cascade> cascade;

    /**
     * Gets the value of the cascade property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cascade property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCascade().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cascade }
     * 
     * 
     */
    public List<Cascade> getCascade() {
        if (cascade == null) {
            cascade = new ArrayList<Cascade>();
        }
        return this.cascade;
    }

    /**
     * Sets the value of the cascade property.
     * 
     * @param cascade
     *     allowed object is
     *     {@link Cascade }
     *     
     */
    public void setCascade(List<Cascade> cascade) {
        this.cascade = cascade;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CascadeResponse that = ((CascadeResponse) object);
        {
            List<Cascade> lhsCascade;
            lhsCascade = (((this.cascade!= null)&&(!this.cascade.isEmpty()))?this.getCascade():null);
            List<Cascade> rhsCascade;
            rhsCascade = (((that.cascade!= null)&&(!that.cascade.isEmpty()))?that.getCascade():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cascade", lhsCascade), LocatorUtils.property(thatLocator, "cascade", rhsCascade), lhsCascade, rhsCascade, ((this.cascade!= null)&&(!this.cascade.isEmpty())), ((that.cascade!= null)&&(!that.cascade.isEmpty())))) {
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
            List<Cascade> theCascade;
            theCascade = (((this.cascade!= null)&&(!this.cascade.isEmpty()))?this.getCascade():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cascade", theCascade), currentHashCode, theCascade, ((this.cascade!= null)&&(!this.cascade.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
