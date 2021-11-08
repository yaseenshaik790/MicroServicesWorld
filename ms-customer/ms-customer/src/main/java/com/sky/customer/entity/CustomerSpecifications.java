package com.sky.customer.entity;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class CustomerSpecifications {
	
	public CustomerSpecifications() {
		
	}

	public static Specification<Customer> withPhoneNums(List<Integer> phoneNumbers) {
		
		return ( root , criteria, criteriaBuilder ) ->{
			return criteriaBuilder.in(root.get("phone")).value(phoneNumbers);					
		};

	}

}
