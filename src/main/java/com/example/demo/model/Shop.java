package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Shop {
	@Id
	@Column(name = "Id")
	private String shopId;
	private String name;
	private String address;
	private int phone;
	private String nameboss;
	private String emailboss;
	private int codeContact;
	private Date timeStart;
	private Date timeEnd;
	private String imagePath;

	public Shop() {
	}

	public Shop(String shopId, String name, String address, int phone, String nameboss, String emailboss,
			int codeContact, Date timeStart, Date timeEnd, String imagePath) {
		super();
		this.shopId = shopId;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.nameboss = nameboss;
		this.emailboss = emailboss;
		this.codeContact = codeContact;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
		this.imagePath = imagePath;
	}

	public String getId() {
		return shopId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getNameboss() {
		return nameboss;
	}

	public void setNameboss(String nameboss) {
		this.nameboss = nameboss;
	}

	public String getEmailboss() {
		return emailboss;
	}

	public void setEmailboss(String emailboss) {
		this.emailboss = emailboss;
	}

	public int getCodeContact() {
		return codeContact;
	}

	public void setCodeContact(int codeContact) {
		this.codeContact = codeContact;
	}

	public Date getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(Date timeStart) {
		this.timeStart = timeStart;
	}

	public Date getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(Date timeEnd) {
		this.timeEnd = timeEnd;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@Override
	public String toString() {
		return "Shop [name=" + name + ", address=" + address + ", phone=" + phone + ", nameboss=" + nameboss
				+ ", emailboss=" + emailboss + ", codeContact=" + codeContact + ", timeStart=" + timeStart
				+ ", timeEnd=" + timeEnd + ", imagePath=" + imagePath + "]";
	}
}
