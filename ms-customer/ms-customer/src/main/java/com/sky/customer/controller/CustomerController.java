package com.sky.customer.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sky.customer.controller.api.CustomerResponse;
import com.sky.customer.dto.CustomerDto;
import com.sky.customer.dto.CustomerRequest;
import com.sky.customer.entity.Customer;
import com.sky.customer.exception.CustomerNotFoundException;
import com.sky.customer.service.CustomerService;

@RestController
public class CustomerController {

	private static Logger logger = LoggerFactory.getLogger(CustomerController.class);

	@Autowired
	private CustomerService service;

	@PostMapping(path = "/save")
	public ResponseEntity<Customer> saveCustomer(@RequestBody CustomerRequest customerRequest) {
		CustomerDto customerDto = new CustomerDto();
		BeanUtils.copyProperties(customerRequest, customerDto);
		Customer custResponse = service.saveCustomer(customerDto);
		logger.info(" Save Cust ======================" + customerDto);
		return new ResponseEntity<Customer>(custResponse, HttpStatus.CREATED);
	}

	@GetMapping(path = "/{customerId}")
	public ResponseEntity<CustomerDto> getCust(@PathVariable Integer customerId) {

		CustomerDto customerDto = service.getCustomer(customerId);
		// CustomerDto customerDto = null;
		/*
		 * if (customerDto == null) { throw new
		 * CustomerNotFoundException("Cust Not Found"); } else { return new
		 * ResponseEntity<CustomerDto>(customerDto,HttpStatus.ACCEPTED); }
		 */

		return new ResponseEntity<CustomerDto>(customerDto, HttpStatus.OK);
	}

	@GetMapping(path = "/get")
	public List<Customer> getCustomer() {
		// CustomerDto customerDto = service.getCustomer(customerId);
		List<Integer> phoneNumbers = new ArrayList<Integer>();
		phoneNumbers.add(12);
		phoneNumbers.add(34);

		List<Customer> customerDto = service.getC(phoneNumbers);
		return customerDto;
	}

	@GetMapping(path = "/get-phones")
	public List<Customer> getCustomerPhones(@RequestParam Integer number, @RequestParam Integer numberTwo) {
		// CustomerDto customerDto = service.getCustomer(customerId);
		List<Integer> phoneNumbers = new ArrayList<Integer>();
		phoneNumbers.add(number);
		phoneNumbers.add(numberTwo);

		List<Customer> customerDto = service.getCustomerPhones(phoneNumbers);
		return customerDto;
	}

	@DeleteMapping(path = "/del/{customerId}")
	public ResponseEntity<String> deleteCust(@PathVariable Integer customerId) {
		String message = service.deleteCust(customerId);
		logger.info(" Delete ======================" + message);
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}

	@PutMapping(path = "/dec/{customerId}")
	public ResponseEntity<String> updateCust(@PathVariable Integer customerId, @RequestParam String name) {
		String message = service.updateCust(customerId, name);
		logger.info(" Update ======================" + message);
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}

}
