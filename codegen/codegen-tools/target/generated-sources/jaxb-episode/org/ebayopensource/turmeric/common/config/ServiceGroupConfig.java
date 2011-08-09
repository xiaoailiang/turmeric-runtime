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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ServiceGroupConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceGroupConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="provider-options" type="{http://www.ebayopensource.org/turmeric/common/config}ProviderOptions" minOccurs="0"/>
 *         &lt;element name="G11N-options" type="{http://www.ebayopensource.org/turmeric/common/config}ServerG11NOptions" minOccurs="0"/>
 *         &lt;element name="pipeline-config" type="{http://www.ebayopensource.org/turmeric/common/config}PipelineConfig" minOccurs="0"/>
 *         &lt;element name="protocol-processor" type="{http://www.ebayopensource.org/turmeric/common/config}ProtocolProcessorConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transport" type="{http://www.ebayopensource.org/turmeric/common/config}TransportConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="data-binding-config" type="{http://www.ebayopensource.org/turmeric/common/config}DataBindingConfig" minOccurs="0"/>
 *         &lt;element name="service-layer" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceGroupConfig", propOrder = {
    "providerOptions",
    "g11NOptions",
    "pipelineConfig",
    "protocolProcessor",
    "transport",
    "dataBindingConfig",
    "serviceLayer"
})
public class ServiceGroupConfig {

    @XmlElement(name = "provider-options")
    protected ProviderOptions providerOptions;
    @XmlElement(name = "G11N-options")
    protected ServerG11NOptions g11NOptions;
    @XmlElement(name = "pipeline-config")
    protected PipelineConfig pipelineConfig;
    @XmlElement(name = "protocol-processor")
    protected List<ProtocolProcessorConfig> protocolProcessor;
    protected List<TransportConfig> transport;
    @XmlElement(name = "data-binding-config")
    protected DataBindingConfig dataBindingConfig;
    @XmlElement(name = "service-layer")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceLayer;

    /**
     * Gets the value of the providerOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderOptions }
     *     
     */
    public ProviderOptions getProviderOptions() {
        return providerOptions;
    }

    /**
     * Sets the value of the providerOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderOptions }
     *     
     */
    public void setProviderOptions(ProviderOptions value) {
        this.providerOptions = value;
    }

    /**
     * Gets the value of the g11NOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ServerG11NOptions }
     *     
     */
    public ServerG11NOptions getG11NOptions() {
        return g11NOptions;
    }

    /**
     * Sets the value of the g11NOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerG11NOptions }
     *     
     */
    public void setG11NOptions(ServerG11NOptions value) {
        this.g11NOptions = value;
    }

    /**
     * Gets the value of the pipelineConfig property.
     * 
     * @return
     *     possible object is
     *     {@link PipelineConfig }
     *     
     */
    public PipelineConfig getPipelineConfig() {
        return pipelineConfig;
    }

    /**
     * Sets the value of the pipelineConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link PipelineConfig }
     *     
     */
    public void setPipelineConfig(PipelineConfig value) {
        this.pipelineConfig = value;
    }

    /**
     * Gets the value of the protocolProcessor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protocolProcessor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtocolProcessor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProtocolProcessorConfig }
     * 
     * 
     */
    public List<ProtocolProcessorConfig> getProtocolProcessor() {
        if (protocolProcessor == null) {
            protocolProcessor = new ArrayList<ProtocolProcessorConfig>();
        }
        return this.protocolProcessor;
    }

    /**
     * Gets the value of the transport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportConfig }
     * 
     * 
     */
    public List<TransportConfig> getTransport() {
        if (transport == null) {
            transport = new ArrayList<TransportConfig>();
        }
        return this.transport;
    }

    /**
     * Gets the value of the dataBindingConfig property.
     * 
     * @return
     *     possible object is
     *     {@link DataBindingConfig }
     *     
     */
    public DataBindingConfig getDataBindingConfig() {
        return dataBindingConfig;
    }

    /**
     * Sets the value of the dataBindingConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataBindingConfig }
     *     
     */
    public void setDataBindingConfig(DataBindingConfig value) {
        this.dataBindingConfig = value;
    }

    /**
     * Gets the value of the serviceLayer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLayer() {
        return serviceLayer;
    }

    /**
     * Sets the value of the serviceLayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLayer(String value) {
        this.serviceLayer = value;
    }

}
