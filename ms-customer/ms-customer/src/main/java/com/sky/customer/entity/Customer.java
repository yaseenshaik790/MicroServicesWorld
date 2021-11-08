package com.sky.customer.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CUSTOMER_ID")
	private Integer customerId;
	
	@Column(name = "CUSTOMER_NAME")
	private String customerName;
	
	@Column(name = "AGE")
	private Integer age;
	
	@Column(name = "DATE_OF_BIRTH")
	private LocalDate dateOfBirth;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "PHONE_NUMBER")
	private Integer phone;

	public Customer() {
		super();
	}

	public Customer(Integer customerId, String customerName, Integer age, LocalDate dateOfBirth, String address,
			Integer phone) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phone = phone;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPhoneNumber() {
		return phone;
	}

	public void setPhoneNumber(Integer phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", age=" + age
				+ ", dateOfBirth=" + dateOfBirth + ", address=" + address + ", phone=" + phone + "]";
	}

}
