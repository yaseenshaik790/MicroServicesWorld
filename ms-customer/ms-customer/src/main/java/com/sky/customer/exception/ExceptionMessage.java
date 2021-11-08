package com.sky.customer.exception;

import java.time.LocalDate;

public class ExceptionMessage {

	private Object message;
	private LocalDate date;
	public Object getMessage() {
		return message;
	}
	public void setMessage(Object message) {
		this.message = message;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public ExceptionMessage(Object message, LocalDate date) {
		super();
		this.message = message;
		this.date = date;
	}
	
}
