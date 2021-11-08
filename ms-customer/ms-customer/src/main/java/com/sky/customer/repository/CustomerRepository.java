package com.sky.customer.repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

import com.sky.customer.controller.CustomerController;
import com.sky.customer.dto.CustomerDto;
import com.sky.customer.entity.CustSpec;
import com.sky.customer.entity.Customer;
import com.sky.customer.entity.CustomerDao;
import com.sky.customer.entity.CustomerSpecificationsBuilder;

@Repository
public class CustomerRepository {

	private static Logger logger = LoggerFactory.getLogger(CustomerRepository.class);

	@Autowired
	private CustomerDao customerDao;

	@Autowired
	private CustSpec custSpec;

	public Customer persistCustomer(CustomerDto customerDto) {
		Customer customerDab = new Customer();
		BeanUtils.copyProperties(customerDto, customerDab);
		// customerDab.setCustomerId(1l);
		Customer cust = customerDao.save(customerDab);
		return cust;
	}

	public CustomerDto getCustomer(Integer customerId) {
		CustomerDto customerDto = new CustomerDto();

		Optional<Customer> cust = customerDao.findByCustomerId(customerId);
		if (cust.isPresent()) {
			BeanUtils.copyProperties(cust.get(), customerDto);
			return customerDto;
		}

		return new CustomerDto();
	}

	public String deleteCust(Integer customerId) {
		Optional<Customer> cust = customerDao.findByCustomerId(customerId);
		if (cust.isPresent()) {
			customerDao.delete(cust.get());
			return "Successfully Deleted Cust ID" + customerId;
		}
		return "Not deleted";
	}

	public String updateCust(Integer customerId, String name) {
		Optional<Customer> cust = customerDao.findByCustomerId(customerId);
		if (cust.isPresent()) {
			cust.get().setCustomerName(name);
			customerDao.save(cust.get());
			return "Successfully Updated Cust Name" + cust.get().getCustomerName();
		}
		return "Not Updated";
	}

	public static int findNumber(int[] a) {

		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		return max;

	}

	public static int sum(int a, int b) {

		int max = a + b;

		return max;

	}

	public List<Customer> get(List<Integer> phones) {
		// TODO Auto-generated method stub
		Pageable page = PageRequest.of(1, 10);

		Page<Customer> custs = customerDao.findByPhoneIn(phones, page);

		List<Customer> u = custs.getContent().stream().collect(Collectors.toList());

		return u;
	}

	public List<Customer> getCustomerPhones(List<Integer> phoneNumbers) {
		Pageable pageable = PageRequest.of(0, 10);

		// Specification<Customer> specification = new
		// CustomerSpecificationsBuilder().withListOfPhoneNums(phoneNumbers)
		// .build();
		// System.out.println(" Specifications : " + specification);

		// Page<Customer> custs = customerDao.findAll(specification, pageable);
		System.out.println(" Specifications : " + custSpec.getUser(phoneNumbers));
		Page<Customer> custs = customerDao.findAll(custSpec.getUser(phoneNumbers), pageable);

		System.out.println(" Custs : " + custs.getContent());
		return custs.getContent().stream().collect(Collectors.toList());
	}

}
