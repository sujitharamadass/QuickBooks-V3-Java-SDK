//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.07.12 at 12:19:07 PM IST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * 
 * 				Product: QBO
 * 				Description: Contains the line details of an inventory adjustment transaction.
 * 			
 * 
 * <p>Java class for ItemAdjustmentLineDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemAdjustmentLineDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemRef" type="{http://schema.intuit.com/finance/v3}ReferenceType"/&gt;
 *         &lt;element name="SalesPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="QtyDiff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *           &lt;element name="NewQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ClassRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemAdjustmentLineDetail", propOrder = {
    "itemRef",
    "salesPrice",
    "qtyDiff",
    "newQty",
    "classRef"
})
public class ItemAdjustmentLineDetail implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ItemRef", required = true)
    protected ReferenceType itemRef;
    @XmlElement(name = "SalesPrice")
    protected BigDecimal salesPrice;
    @XmlElement(name = "QtyDiff")
    protected BigDecimal qtyDiff;
    @XmlElement(name = "NewQty")
    protected BigDecimal newQty;
    @XmlElement(name = "ClassRef")
    protected ReferenceType classRef;

    /**
     * Gets the value of the itemRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getItemRef() {
        return itemRef;
    }

    /**
     * Sets the value of the itemRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setItemRef(ReferenceType value) {
        this.itemRef = value;
    }

    /**
     * Gets the value of the salesPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesPrice() {
        return salesPrice;
    }

    /**
     * Sets the value of the salesPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesPrice(BigDecimal value) {
        this.salesPrice = value;
    }

    /**
     * Gets the value of the qtyDiff property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyDiff() {
        return qtyDiff;
    }

    /**
     * Sets the value of the qtyDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyDiff(BigDecimal value) {
        this.qtyDiff = value;
    }

    /**
     * Gets the value of the newQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewQty() {
        return newQty;
    }

    /**
     * Sets the value of the newQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewQty(BigDecimal value) {
        this.newQty = value;
    }

    /**
     * Gets the value of the classRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getClassRef() {
        return classRef;
    }

    /**
     * Sets the value of the classRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setClassRef(ReferenceType value) {
        this.classRef = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ItemAdjustmentLineDetail that = ((ItemAdjustmentLineDetail) object);
        {
            ReferenceType lhsItemRef;
            lhsItemRef = this.getItemRef();
            ReferenceType rhsItemRef;
            rhsItemRef = that.getItemRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemRef", lhsItemRef), LocatorUtils.property(thatLocator, "itemRef", rhsItemRef), lhsItemRef, rhsItemRef, (this.itemRef!= null), (that.itemRef!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsSalesPrice;
            lhsSalesPrice = this.getSalesPrice();
            BigDecimal rhsSalesPrice;
            rhsSalesPrice = that.getSalesPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesPrice", lhsSalesPrice), LocatorUtils.property(thatLocator, "salesPrice", rhsSalesPrice), lhsSalesPrice, rhsSalesPrice, (this.salesPrice!= null), (that.salesPrice!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsQtyDiff;
            lhsQtyDiff = this.getQtyDiff();
            BigDecimal rhsQtyDiff;
            rhsQtyDiff = that.getQtyDiff();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qtyDiff", lhsQtyDiff), LocatorUtils.property(thatLocator, "qtyDiff", rhsQtyDiff), lhsQtyDiff, rhsQtyDiff, (this.qtyDiff!= null), (that.qtyDiff!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsNewQty;
            lhsNewQty = this.getNewQty();
            BigDecimal rhsNewQty;
            rhsNewQty = that.getNewQty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "newQty", lhsNewQty), LocatorUtils.property(thatLocator, "newQty", rhsNewQty), lhsNewQty, rhsNewQty, (this.newQty!= null), (that.newQty!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsClassRef;
            lhsClassRef = this.getClassRef();
            ReferenceType rhsClassRef;
            rhsClassRef = that.getClassRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classRef", lhsClassRef), LocatorUtils.property(thatLocator, "classRef", rhsClassRef), lhsClassRef, rhsClassRef, (this.classRef!= null), (that.classRef!= null))) {
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
            ReferenceType theItemRef;
            theItemRef = this.getItemRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemRef", theItemRef), currentHashCode, theItemRef, (this.itemRef!= null));
        }
        {
            BigDecimal theSalesPrice;
            theSalesPrice = this.getSalesPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesPrice", theSalesPrice), currentHashCode, theSalesPrice, (this.salesPrice!= null));
        }
        {
            BigDecimal theQtyDiff;
            theQtyDiff = this.getQtyDiff();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qtyDiff", theQtyDiff), currentHashCode, theQtyDiff, (this.qtyDiff!= null));
        }
        {
            BigDecimal theNewQty;
            theNewQty = this.getNewQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "newQty", theNewQty), currentHashCode, theNewQty, (this.newQty!= null));
        }
        {
            ReferenceType theClassRef;
            theClassRef = this.getClassRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classRef", theClassRef), currentHashCode, theClassRef, (this.classRef!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
