
package com.example.demo.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchoolID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebservicePwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemBarcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemRFID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemLocationNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "schoolID",
    "webservicePwd",
    "itemBarcode",
    "itemRFID",
    "itemLocationNum"
})
@XmlRootElement(name = "UpdateItemInfo")
public class UpdateItemInfo {

    @XmlElement(name = "SchoolID")
    protected String schoolID;
    @XmlElement(name = "WebservicePwd")
    protected String webservicePwd;
    @XmlElement(name = "ItemBarcode")
    protected String itemBarcode;
    @XmlElement(name = "ItemRFID")
    protected String itemRFID;
    @XmlElement(name = "ItemLocationNum")
    protected String itemLocationNum;

    /**
     * ��ȡschoolID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolID() {
        return schoolID;
    }

    /**
     * ����schoolID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolID(String value) {
        this.schoolID = value;
    }

    /**
     * ��ȡwebservicePwd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebservicePwd() {
        return webservicePwd;
    }

    /**
     * ����webservicePwd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebservicePwd(String value) {
        this.webservicePwd = value;
    }

    /**
     * ��ȡitemBarcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemBarcode() {
        return itemBarcode;
    }

    /**
     * ����itemBarcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemBarcode(String value) {
        this.itemBarcode = value;
    }

    /**
     * ��ȡitemRFID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemRFID() {
        return itemRFID;
    }

    /**
     * ����itemRFID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemRFID(String value) {
        this.itemRFID = value;
    }

    /**
     * ��ȡitemLocationNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemLocationNum() {
        return itemLocationNum;
    }

    /**
     * ����itemLocationNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemLocationNum(String value) {
        this.itemLocationNum = value;
    }

}
