package com.sky.customer.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.sky.customer.dto.CustomerDto;
import com.sky.customer.service.CustomerService;

@WebMvcTest
public class CustomerControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private CustomerService service;

	@Test
	public void getCustomerByID() throws Exception {
		CustomerDto customer = new CustomerDto("HH", 22, null, "Nelre", 2132);
		when(service.getCustomer(1)).thenReturn(customer);
		mockMvc.perform(get("/{customerId}", 1)).andExpect(status().isOk())
				.andExpect(jsonPath("$.age", Matchers.equalTo(22)))
				.andExpect(jsonPath("$.customerName", Matchers.equalTo("HH")));
	}

}
