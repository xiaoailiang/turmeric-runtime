//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.03 at 06:49:54 AM PDT 
//


package org.ebayopensource.turmeric.common.config;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonitorConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitorConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="storage-provider" type="{http://www.ebayopensource.org/turmeric/common/config}StorageProviderConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="snapshot-interval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitorConfig", propOrder = {
    "storageProvider",
    "snapshotInterval"
})
public class MonitorConfig {

    @XmlElement(name = "storage-provider")
    protected List<StorageProviderConfig> storageProvider;
    @XmlElement(name = "snapshot-interval")
    protected Integer snapshotInterval;

    /**
     * Gets the value of the storageProvider property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storageProvider property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStorageProvider().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StorageProviderConfig }
     * 
     * 
     */
    public List<StorageProviderConfig> getStorageProvider() {
        if (storageProvider == null) {
            storageProvider = new ArrayList<StorageProviderConfig>();
        }
        return this.storageProvider;
    }

    /**
     * Gets the value of the snapshotInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSnapshotInterval() {
        return snapshotInterval;
    }

    /**
     * Sets the value of the snapshotInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSnapshotInterval(Integer value) {
        this.snapshotInterval = value;
    }

}
