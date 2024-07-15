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
 *  Product: QBO Description: Object representing cascading events on entities resulting from a transaction event. Used by messaging. Not intended for external clients. 
 * 
 * <p>Java class for Cascade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cascade"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Id" type="{http://schema.intuit.com/finance/v3}id"/&gt;
 *         &lt;element name="KeyValue" type="{http://schema.intuit.com/finance/v3}NameValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cascade", propOrder = {
    "entityName",
    "id",
    "keyValue"
})
public class Cascade implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "EntityName", required = true)
    protected String entityName;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "KeyValue")
    protected List<NameValue> keyValue;

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the keyValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValue }
     * 
     * 
     */
    public List<NameValue> getKeyValue() {
        if (keyValue == null) {
            keyValue = new ArrayList<NameValue>();
        }
        return this.keyValue;
    }

    /**
     * Sets the value of the keyValue property.
     * 
     * @param keyValue
     *     allowed object is
     *     {@link NameValue }
     *     
     */
    public void setKeyValue(List<NameValue> keyValue) {
        this.keyValue = keyValue;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Cascade that = ((Cascade) object);
        {
            String lhsEntityName;
            lhsEntityName = this.getEntityName();
            String rhsEntityName;
            rhsEntityName = that.getEntityName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entityName", lhsEntityName), LocatorUtils.property(thatLocator, "entityName", rhsEntityName), lhsEntityName, rhsEntityName, (this.entityName!= null), (that.entityName!= null))) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
                return false;
            }
        }
        {
            List<NameValue> lhsKeyValue;
            lhsKeyValue = (((this.keyValue!= null)&&(!this.keyValue.isEmpty()))?this.getKeyValue():null);
            List<NameValue> rhsKeyValue;
            rhsKeyValue = (((that.keyValue!= null)&&(!that.keyValue.isEmpty()))?that.getKeyValue():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keyValue", lhsKeyValue), LocatorUtils.property(thatLocator, "keyValue", rhsKeyValue), lhsKeyValue, rhsKeyValue, ((this.keyValue!= null)&&(!this.keyValue.isEmpty())), ((that.keyValue!= null)&&(!that.keyValue.isEmpty())))) {
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
            String theEntityName;
            theEntityName = this.getEntityName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entityName", theEntityName), currentHashCode, theEntityName, (this.entityName!= null));
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId, (this.id!= null));
        }
        {
            List<NameValue> theKeyValue;
            theKeyValue = (((this.keyValue!= null)&&(!this.keyValue.isEmpty()))?this.getKeyValue():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "keyValue", theKeyValue), currentHashCode, theKeyValue, ((this.keyValue!= null)&&(!this.keyValue.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
