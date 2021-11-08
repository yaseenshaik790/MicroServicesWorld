package com.sky.customer.service;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.WebConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.function.ServerRequest.Headers;

import com.sky.customer.controller.api.CustomerResponse;
import com.sky.customer.dto.CustomerDto;
import com.sky.customer.entity.Customer;
import com.sky.customer.repository.CustomerRepository;

@Service
@Component
public class CustomerService {

	@Autowired
	private CustomerRepository repository;

	@Autowired
	private RestTemplate restTemplate;

	public Customer saveCustomer(CustomerDto customerDto) {

		return repository.persistCustomer(customerDto);
	}

	public CustomerDto getCustomer(Integer customerId) {
		return repository.getCustomer(customerId);

		/*
		 * HttpHeaders headers = new HttpHeaders();
		 * headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		 * HttpEntity<String> entity = new HttpEntity<>(headers); ResponseEntity<String>
		 * response = restTemplate.exchange("http://localhost:8989/bank/users/",
		 * HttpMethod.GET, entity, String.class); CustomerDto dto = new CustomerDto();
		 * dto.setCustomerName(response.getBody()); return dto;
		 */

	}

	public String deleteCust(Integer customerId) {
		return repository.deleteCust(customerId);
	}

	public String updateCust(Integer customerId, String name) {
		return repository.updateCust(customerId, name);
	}

	public List<Customer> getC(List<Integer> phoneNumbers) {
		return repository.get(phoneNumbers);

	}

	public List<Customer> getCustomerPhones(List<Integer> phoneNumbers) {
		return repository.getCustomerPhones(phoneNumbers);

	}

	public CustomerDto getCustDetailsThroughWebClient(Integer customerId) {
		// TODO Auto-generated method stub
		return repository.getCustomer(customerId);
	}

}
