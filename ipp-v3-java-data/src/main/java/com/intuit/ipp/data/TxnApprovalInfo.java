//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.07.12 at 12:19:07 PM IST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateTimeAdapter;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Details of approval status for the specific transaction.
 * 
 * <p>Java class for TxnApprovalInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TxnApprovalInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApprovalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApprovalStatusDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastChangedByUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastChangedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxnApprovalInfo", propOrder = {
    "approvalStatus",
    "approvalStatusDetail",
    "lastChangedByUser",
    "lastChangedDate"
})
public class TxnApprovalInfo implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ApprovalStatus")
    protected String approvalStatus;
    @XmlElement(name = "ApprovalStatusDetail")
    protected String approvalStatusDetail;
    @XmlElement(name = "LastChangedByUser")
    protected String lastChangedByUser;
    @XmlElement(name = "LastChangedDate", type = String.class)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date lastChangedDate;

    /**
     * Gets the value of the approvalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * Sets the value of the approvalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalStatus(String value) {
        this.approvalStatus = value;
    }

    /**
     * Gets the value of the approvalStatusDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalStatusDetail() {
        return approvalStatusDetail;
    }

    /**
     * Sets the value of the approvalStatusDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalStatusDetail(String value) {
        this.approvalStatusDetail = value;
    }

    /**
     * Gets the value of the lastChangedByUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastChangedByUser() {
        return lastChangedByUser;
    }

    /**
     * Sets the value of the lastChangedByUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastChangedByUser(String value) {
        this.lastChangedByUser = value;
    }

    /**
     * Gets the value of the lastChangedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getLastChangedDate() {
        return lastChangedDate;
    }

    /**
     * Sets the value of the lastChangedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastChangedDate(Date value) {
        this.lastChangedDate = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TxnApprovalInfo that = ((TxnApprovalInfo) object);
        {
            String lhsApprovalStatus;
            lhsApprovalStatus = this.getApprovalStatus();
            String rhsApprovalStatus;
            rhsApprovalStatus = that.getApprovalStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "approvalStatus", lhsApprovalStatus), LocatorUtils.property(thatLocator, "approvalStatus", rhsApprovalStatus), lhsApprovalStatus, rhsApprovalStatus, (this.approvalStatus!= null), (that.approvalStatus!= null))) {
                return false;
            }
        }
        {
            String lhsApprovalStatusDetail;
            lhsApprovalStatusDetail = this.getApprovalStatusDetail();
            String rhsApprovalStatusDetail;
            rhsApprovalStatusDetail = that.getApprovalStatusDetail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "approvalStatusDetail", lhsApprovalStatusDetail), LocatorUtils.property(thatLocator, "approvalStatusDetail", rhsApprovalStatusDetail), lhsApprovalStatusDetail, rhsApprovalStatusDetail, (this.approvalStatusDetail!= null), (that.approvalStatusDetail!= null))) {
                return false;
            }
        }
        {
            String lhsLastChangedByUser;
            lhsLastChangedByUser = this.getLastChangedByUser();
            String rhsLastChangedByUser;
            rhsLastChangedByUser = that.getLastChangedByUser();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastChangedByUser", lhsLastChangedByUser), LocatorUtils.property(thatLocator, "lastChangedByUser", rhsLastChangedByUser), lhsLastChangedByUser, rhsLastChangedByUser, (this.lastChangedByUser!= null), (that.lastChangedByUser!= null))) {
                return false;
            }
        }
        {
            Date lhsLastChangedDate;
            lhsLastChangedDate = this.getLastChangedDate();
            Date rhsLastChangedDate;
            rhsLastChangedDate = that.getLastChangedDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastChangedDate", lhsLastChangedDate), LocatorUtils.property(thatLocator, "lastChangedDate", rhsLastChangedDate), lhsLastChangedDate, rhsLastChangedDate, (this.lastChangedDate!= null), (that.lastChangedDate!= null))) {
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
            String theApprovalStatus;
            theApprovalStatus = this.getApprovalStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "approvalStatus", theApprovalStatus), currentHashCode, theApprovalStatus, (this.approvalStatus!= null));
        }
        {
            String theApprovalStatusDetail;
            theApprovalStatusDetail = this.getApprovalStatusDetail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "approvalStatusDetail", theApprovalStatusDetail), currentHashCode, theApprovalStatusDetail, (this.approvalStatusDetail!= null));
        }
        {
            String theLastChangedByUser;
            theLastChangedByUser = this.getLastChangedByUser();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastChangedByUser", theLastChangedByUser), currentHashCode, theLastChangedByUser, (this.lastChangedByUser!= null));
        }
        {
            Date theLastChangedDate;
            theLastChangedDate = this.getLastChangedDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastChangedDate", theLastChangedDate), currentHashCode, theLastChangedDate, (this.lastChangedDate!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
