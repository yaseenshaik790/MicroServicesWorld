package com.sky.customer.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CustomerRequest {

	private String customerName;
	private Integer age;
	private LocalDateTime dateOfBirth;
	private String address;
	private Integer phoneNumber;

	public CustomerRequest() {
		super();
	}

	public CustomerRequest(String customerName, Integer age, LocalDateTime dateOfBirth, String address,
			Integer phoneNumber) {
		super();
		this.customerName = customerName;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
