
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
 *         &lt;element name="UserDepartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserBarcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserRFID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserRightGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserRegDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "userDepartment",
    "userBarcode",
    "userName",
    "userRFID",
    "userRightGroup",
    "userRegDate",
    "userExpiryDate"
})
@XmlRootElement(name = "CreateNewUser")
public class CreateNewUser {

    @XmlElement(name = "SchoolID")
    protected String schoolID;
    @XmlElement(name = "WebservicePwd")
    protected String webservicePwd;
    @XmlElement(name = "UserDepartment")
    protected String userDepartment;
    @XmlElement(name = "UserBarcode")
    protected String userBarcode;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "UserRFID")
    protected String userRFID;
    @XmlElement(name = "UserRightGroup")
    protected String userRightGroup;
    @XmlElement(name = "UserRegDate")
    protected String userRegDate;
    @XmlElement(name = "UserExpiryDate")
    protected String userExpiryDate;

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
     * ��ȡuserDepartment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDepartment() {
        return userDepartment;
    }

    /**
     * ����userDepartment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDepartment(String value) {
        this.userDepartment = value;
    }

    /**
     * ��ȡuserBarcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserBarcode() {
        return userBarcode;
    }

    /**
     * ����userBarcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserBarcode(String value) {
        this.userBarcode = value;
    }

    /**
     * ��ȡuserName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * ����userName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * ��ȡuserRFID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRFID() {
        return userRFID;
    }

    /**
     * ����userRFID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserRFID(String value) {
        this.userRFID = value;
    }

    /**
     * ��ȡuserRightGroup���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRightGroup() {
        return userRightGroup;
    }

    /**
     * ����userRightGroup���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserRightGroup(String value) {
        this.userRightGroup = value;
    }

    /**
     * ��ȡuserRegDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRegDate() {
        return userRegDate;
    }

    /**
     * ����userRegDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserRegDate(String value) {
        this.userRegDate = value;
    }

    /**
     * ��ȡuserExpiryDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserExpiryDate() {
        return userExpiryDate;
    }

    /**
     * ����userExpiryDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserExpiryDate(String value) {
        this.userExpiryDate = value;
    }

}
