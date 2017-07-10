/*******************************************************************************
 * Copyright (c) 2017 Intuit
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
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
 * QueryResponse entity describing the response of query
 * 
 * <p>Java class for IntuitBatchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntuitBatchRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BatchItemRequest" type="{http://schema.intuit.com/finance/v3}BatchItemRequest" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntuitBatchRequest", propOrder = {
    "batchItemRequest"
})
public class IntuitBatchRequest implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "BatchItemRequest", required = true)
    protected List<BatchItemRequest> batchItemRequest;

    /**
     * Gets the value of the batchItemRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchItemRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchItemRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchItemRequest }
     * 
     * 
     */
    public List<BatchItemRequest> getBatchItemRequest() {
        if (batchItemRequest == null) {
            batchItemRequest = new ArrayList<BatchItemRequest>();
        }
        return this.batchItemRequest;
    }

    /**
     * Sets the value of the batchItemRequest property.
     * 
     * @param batchItemRequest
     *     allowed object is
     *     {@link BatchItemRequest }
     *     
     */
    public void setBatchItemRequest(List<BatchItemRequest> batchItemRequest) {
        this.batchItemRequest = batchItemRequest;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IntuitBatchRequest that = ((IntuitBatchRequest) object);
        {
            List<BatchItemRequest> lhsBatchItemRequest;
            lhsBatchItemRequest = (((this.batchItemRequest!= null)&&(!this.batchItemRequest.isEmpty()))?this.getBatchItemRequest():null);
            List<BatchItemRequest> rhsBatchItemRequest;
            rhsBatchItemRequest = (((that.batchItemRequest!= null)&&(!that.batchItemRequest.isEmpty()))?that.getBatchItemRequest():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "batchItemRequest", lhsBatchItemRequest), LocatorUtils.property(thatLocator, "batchItemRequest", rhsBatchItemRequest), lhsBatchItemRequest, rhsBatchItemRequest, ((this.batchItemRequest!= null)&&(!this.batchItemRequest.isEmpty())), ((that.batchItemRequest!= null)&&(!that.batchItemRequest.isEmpty())))) {
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
            List<BatchItemRequest> theBatchItemRequest;
            theBatchItemRequest = (((this.batchItemRequest!= null)&&(!this.batchItemRequest.isEmpty()))?this.getBatchItemRequest():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "batchItemRequest", theBatchItemRequest), currentHashCode, theBatchItemRequest, ((this.batchItemRequest!= null)&&(!this.batchItemRequest.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
