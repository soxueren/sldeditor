//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: [TEXT REMOVED by maven-replacer-plugin]
//


package com.sldeditor.common.xml.ui;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XMLFieldBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XMLFieldBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="field" use="required" type="{}FieldIdEnum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XMLFieldBase")
@XmlSeeAlso({
    XMLFieldDisabled.class,
    XMLSetFieldAttributeEx.class,
    XMLFieldAttribute.class,
    XMLColourMapEntries.class,
    XMLSetFieldLiteralBase.class,
    XMLFieldExpression.class,
    XMLFieldLiteralBase.class,
    XMLSetFieldExpressionEx.class
})
public class XMLFieldBase {

    @XmlAttribute(required = true)
    protected FieldIdEnum field;

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link FieldIdEnum }
     *     
     */
    public FieldIdEnum getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIdEnum }
     *     
     */
    public void setField(FieldIdEnum value) {
        this.field = value;
    }

}
