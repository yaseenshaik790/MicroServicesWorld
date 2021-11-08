package com.sky.customer.repository;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sky.customer.controller.CustomerController;
import com.sky.customer.dto.CustomerDto;
import com.sky.customer.dto.CustomerRequest;
import com.sky.customer.entity.Customer;
import com.sky.customer.entity.CustomerDao;
import com.sky.customer.service.CustomerService;

@RunWith(MockitoJUnitRunner.class)
public class CustomerRepositoryTest {

	@InjectMocks
	private CustomerRepository repo;

	@Mock
	private CustomerDao dao;
	
	@Mock
	private CustomerService service;
	@Mock
	private CustomerController controller;
	Customer customer;
	CustomerDto customerDto;

	/*
	 * @Before public void setup() { MockitoAnnotations.initMocks(this); }
	 */

	@Before
	public void setup() {

		customer = new Customer();
		customer.setCustomerId(1);
		customer.setAge(22);
		customer.setAddress("Nell");
		customer.setCustomerName("Yaseen");

		customerDto = new CustomerDto();
		customerDto.setAge(22);
		customerDto.setAddress("Nell");
		customerDto.setCustomerName("Yaseen");
	}

	

	
	@Test
	public void getCustTest() {
		when(dao.findByCustomerId(1)).thenReturn(Optional.of(customer));

		CustomerDto actual = repo.getCustomer(1);

		assertNotNull(actual);
		assertEquals(actual.getAddress(), "Nell");
	}

	@Test
	public void testFact() {
		assertEquals(5, CustomerRepository.findNumber(new int[] { 2, 5, 3 }));
		assertEquals(5, CustomerRepository.findNumber(new int[] { 2, 5, 3, 5 }));
	}

	@Test
	public void testSumFact() {
		assertEquals(20, CustomerRepository.sum(10, 10));
	}
}
