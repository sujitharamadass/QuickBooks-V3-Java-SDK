//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.07.12 at 12:19:07 PM IST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateAdapter;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Bill is an AP transaction representing a
 * 				request-for-payment from a third party for goods/services rendered
 * 				and/or received
 * 
 * <p>Java class for Bill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bill"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}PurchaseByVendor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayerRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="SalesTermRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="RemitToAddr" type="{http://schema.intuit.com/finance/v3}PhysicalAddress" minOccurs="0"/&gt;
 *         &lt;element name="ShipAddr" type="{http://schema.intuit.com/finance/v3}PhysicalAddress" minOccurs="0"/&gt;
 *         &lt;element name="VendorAddr" type="{http://schema.intuit.com/finance/v3}PhysicalAddress" minOccurs="0"/&gt;
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="HomeBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="BillEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/&gt;
 *         &lt;element name="LessCIS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IncludeInAnnualTPAR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bill", propOrder = {
    "payerRef",
    "salesTermRef",
    "dueDate",
    "remitToAddr",
    "shipAddr",
    "vendorAddr",
    "balance",
    "homeBalance",
    "billEx",
    "lessCIS",
    "includeInAnnualTPAR"
})
public class Bill
    extends PurchaseByVendor
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PayerRef")
    protected ReferenceType payerRef;
    @XmlElement(name = "SalesTermRef")
    protected ReferenceType salesTermRef;
    @XmlElement(name = "DueDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date dueDate;
    @XmlElement(name = "RemitToAddr")
    protected PhysicalAddress remitToAddr;
    @XmlElement(name = "ShipAddr")
    protected PhysicalAddress shipAddr;
    @XmlElement(name = "VendorAddr")
    protected PhysicalAddress vendorAddr;
    @XmlElement(name = "Balance")
    protected BigDecimal balance;
    @XmlElement(name = "HomeBalance")
    protected BigDecimal homeBalance;
    @XmlElement(name = "BillEx")
    protected IntuitAnyType billEx;
    @XmlElement(name = "LessCIS")
    protected BigDecimal lessCIS;
    @XmlElement(name = "IncludeInAnnualTPAR")
    protected Boolean includeInAnnualTPAR;

    /**
     * Gets the value of the payerRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getPayerRef() {
        return payerRef;
    }

    /**
     * Sets the value of the payerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setPayerRef(ReferenceType value) {
        this.payerRef = value;
    }

    /**
     * Gets the value of the salesTermRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getSalesTermRef() {
        return salesTermRef;
    }

    /**
     * Sets the value of the salesTermRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setSalesTermRef(ReferenceType value) {
        this.salesTermRef = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(Date value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the remitToAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddress }
     *     
     */
    public PhysicalAddress getRemitToAddr() {
        return remitToAddr;
    }

    /**
     * Sets the value of the remitToAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setRemitToAddr(PhysicalAddress value) {
        this.remitToAddr = value;
    }

    /**
     * Gets the value of the shipAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddress }
     *     
     */
    public PhysicalAddress getShipAddr() {
        return shipAddr;
    }

    /**
     * Sets the value of the shipAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setShipAddr(PhysicalAddress value) {
        this.shipAddr = value;
    }

    /**
     * Gets the value of the vendorAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddress }
     *     
     */
    public PhysicalAddress getVendorAddr() {
        return vendorAddr;
    }

    /**
     * Sets the value of the vendorAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setVendorAddr(PhysicalAddress value) {
        this.vendorAddr = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the homeBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHomeBalance() {
        return homeBalance;
    }

    /**
     * Sets the value of the homeBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHomeBalance(BigDecimal value) {
        this.homeBalance = value;
    }

    /**
     * Gets the value of the billEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getBillEx() {
        return billEx;
    }

    /**
     * Sets the value of the billEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setBillEx(IntuitAnyType value) {
        this.billEx = value;
    }

    /**
     * Gets the value of the lessCIS property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLessCIS() {
        return lessCIS;
    }

    /**
     * Sets the value of the lessCIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLessCIS(BigDecimal value) {
        this.lessCIS = value;
    }

    /**
     * Gets the value of the includeInAnnualTPAR property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeInAnnualTPAR() {
        return includeInAnnualTPAR;
    }

    /**
     * Sets the value of the includeInAnnualTPAR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeInAnnualTPAR(Boolean value) {
        this.includeInAnnualTPAR = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Bill that = ((Bill) object);
        {
            ReferenceType lhsPayerRef;
            lhsPayerRef = this.getPayerRef();
            ReferenceType rhsPayerRef;
            rhsPayerRef = that.getPayerRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "payerRef", lhsPayerRef), LocatorUtils.property(thatLocator, "payerRef", rhsPayerRef), lhsPayerRef, rhsPayerRef, (this.payerRef!= null), (that.payerRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsSalesTermRef;
            lhsSalesTermRef = this.getSalesTermRef();
            ReferenceType rhsSalesTermRef;
            rhsSalesTermRef = that.getSalesTermRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesTermRef", lhsSalesTermRef), LocatorUtils.property(thatLocator, "salesTermRef", rhsSalesTermRef), lhsSalesTermRef, rhsSalesTermRef, (this.salesTermRef!= null), (that.salesTermRef!= null))) {
                return false;
            }
        }
        {
            Date lhsDueDate;
            lhsDueDate = this.getDueDate();
            Date rhsDueDate;
            rhsDueDate = that.getDueDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dueDate", lhsDueDate), LocatorUtils.property(thatLocator, "dueDate", rhsDueDate), lhsDueDate, rhsDueDate, (this.dueDate!= null), (that.dueDate!= null))) {
                return false;
            }
        }
        {
            PhysicalAddress lhsRemitToAddr;
            lhsRemitToAddr = this.getRemitToAddr();
            PhysicalAddress rhsRemitToAddr;
            rhsRemitToAddr = that.getRemitToAddr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remitToAddr", lhsRemitToAddr), LocatorUtils.property(thatLocator, "remitToAddr", rhsRemitToAddr), lhsRemitToAddr, rhsRemitToAddr, (this.remitToAddr!= null), (that.remitToAddr!= null))) {
                return false;
            }
        }
        {
            PhysicalAddress lhsShipAddr;
            lhsShipAddr = this.getShipAddr();
            PhysicalAddress rhsShipAddr;
            rhsShipAddr = that.getShipAddr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipAddr", lhsShipAddr), LocatorUtils.property(thatLocator, "shipAddr", rhsShipAddr), lhsShipAddr, rhsShipAddr, (this.shipAddr!= null), (that.shipAddr!= null))) {
                return false;
            }
        }
        {
            PhysicalAddress lhsVendorAddr;
            lhsVendorAddr = this.getVendorAddr();
            PhysicalAddress rhsVendorAddr;
            rhsVendorAddr = that.getVendorAddr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vendorAddr", lhsVendorAddr), LocatorUtils.property(thatLocator, "vendorAddr", rhsVendorAddr), lhsVendorAddr, rhsVendorAddr, (this.vendorAddr!= null), (that.vendorAddr!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsBalance;
            lhsBalance = this.getBalance();
            BigDecimal rhsBalance;
            rhsBalance = that.getBalance();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balance", lhsBalance), LocatorUtils.property(thatLocator, "balance", rhsBalance), lhsBalance, rhsBalance, (this.balance!= null), (that.balance!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsHomeBalance;
            lhsHomeBalance = this.getHomeBalance();
            BigDecimal rhsHomeBalance;
            rhsHomeBalance = that.getHomeBalance();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "homeBalance", lhsHomeBalance), LocatorUtils.property(thatLocator, "homeBalance", rhsHomeBalance), lhsHomeBalance, rhsHomeBalance, (this.homeBalance!= null), (that.homeBalance!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsBillEx;
            lhsBillEx = this.getBillEx();
            IntuitAnyType rhsBillEx;
            rhsBillEx = that.getBillEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billEx", lhsBillEx), LocatorUtils.property(thatLocator, "billEx", rhsBillEx), lhsBillEx, rhsBillEx, (this.billEx!= null), (that.billEx!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsLessCIS;
            lhsLessCIS = this.getLessCIS();
            BigDecimal rhsLessCIS;
            rhsLessCIS = that.getLessCIS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lessCIS", lhsLessCIS), LocatorUtils.property(thatLocator, "lessCIS", rhsLessCIS), lhsLessCIS, rhsLessCIS, (this.lessCIS!= null), (that.lessCIS!= null))) {
                return false;
            }
        }
        {
            Boolean lhsIncludeInAnnualTPAR;
            lhsIncludeInAnnualTPAR = this.isIncludeInAnnualTPAR();
            Boolean rhsIncludeInAnnualTPAR;
            rhsIncludeInAnnualTPAR = that.isIncludeInAnnualTPAR();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "includeInAnnualTPAR", lhsIncludeInAnnualTPAR), LocatorUtils.property(thatLocator, "includeInAnnualTPAR", rhsIncludeInAnnualTPAR), lhsIncludeInAnnualTPAR, rhsIncludeInAnnualTPAR, (this.includeInAnnualTPAR!= null), (that.includeInAnnualTPAR!= null))) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            ReferenceType thePayerRef;
            thePayerRef = this.getPayerRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "payerRef", thePayerRef), currentHashCode, thePayerRef, (this.payerRef!= null));
        }
        {
            ReferenceType theSalesTermRef;
            theSalesTermRef = this.getSalesTermRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesTermRef", theSalesTermRef), currentHashCode, theSalesTermRef, (this.salesTermRef!= null));
        }
        {
            Date theDueDate;
            theDueDate = this.getDueDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dueDate", theDueDate), currentHashCode, theDueDate, (this.dueDate!= null));
        }
        {
            PhysicalAddress theRemitToAddr;
            theRemitToAddr = this.getRemitToAddr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remitToAddr", theRemitToAddr), currentHashCode, theRemitToAddr, (this.remitToAddr!= null));
        }
        {
            PhysicalAddress theShipAddr;
            theShipAddr = this.getShipAddr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipAddr", theShipAddr), currentHashCode, theShipAddr, (this.shipAddr!= null));
        }
        {
            PhysicalAddress theVendorAddr;
            theVendorAddr = this.getVendorAddr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vendorAddr", theVendorAddr), currentHashCode, theVendorAddr, (this.vendorAddr!= null));
        }
        {
            BigDecimal theBalance;
            theBalance = this.getBalance();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "balance", theBalance), currentHashCode, theBalance, (this.balance!= null));
        }
        {
            BigDecimal theHomeBalance;
            theHomeBalance = this.getHomeBalance();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "homeBalance", theHomeBalance), currentHashCode, theHomeBalance, (this.homeBalance!= null));
        }
        {
            IntuitAnyType theBillEx;
            theBillEx = this.getBillEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billEx", theBillEx), currentHashCode, theBillEx, (this.billEx!= null));
        }
        {
            BigDecimal theLessCIS;
            theLessCIS = this.getLessCIS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lessCIS", theLessCIS), currentHashCode, theLessCIS, (this.lessCIS!= null));
        }
        {
            Boolean theIncludeInAnnualTPAR;
            theIncludeInAnnualTPAR = this.isIncludeInAnnualTPAR();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "includeInAnnualTPAR", theIncludeInAnnualTPAR), currentHashCode, theIncludeInAnnualTPAR, (this.includeInAnnualTPAR!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
