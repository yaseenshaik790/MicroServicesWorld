package com.sky.customer.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalException extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = CustomerNotFoundException.class)
	public ResponseEntity<Object> throwCustomerNot(CustomerNotFoundException exception, WebRequest request) {

		ExceptionMessage exceptionMessage = new ExceptionMessage(exception.getMessage(), LocalDate.now());

		return new ResponseEntity<Object>(exceptionMessage, HttpStatus.NOT_FOUND);
	}

}
