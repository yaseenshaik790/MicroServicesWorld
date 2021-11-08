package com.sky.customer.dto;

import java.time.LocalDate;

public class CustomerDto {
	
	private String customerName;
	private Integer age;
	private LocalDate dateOfBirth;
	private String address;
	private Integer phoneNumber;
	
	
	public CustomerDto() {
		super();
	}
	
	public CustomerDto(String customerName, Integer age, LocalDate dateOfBirth, String address, Integer phoneNumber) {
		super();
		this.customerName = customerName;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phoneNumber = phoneNumber;
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
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
