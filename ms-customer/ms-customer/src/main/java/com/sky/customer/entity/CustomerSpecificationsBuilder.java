package com.sky.customer.entity;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class CustomerSpecificationsBuilder {

	private List<Integer> phoneNumbers;

	public CustomerSpecificationsBuilder() {
	}

	public CustomerSpecificationsBuilder withListOfPhoneNums(List<Integer> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
		return this;
	}

	public Specification<Customer> build() {
		Deque<Specification<Customer>> specifications = this.createSpecifications();

		if (specifications.isEmpty()) {
			return null;
		} else {

			Specification<Customer> result = specifications.pop();
			for (Specification<Customer> sp : specifications) {
				result = Specification.where(result).and(sp);
			}

			return result;
		}

	}

	private Deque<Specification<Customer>> createSpecifications() {
		Deque<Specification<Customer>> specifications = new ArrayDeque<>();

		if (CollectionUtils.isEmpty(phoneNumbers)) {
			specifications.push(CustomerSpecifications.withPhoneNums(this.phoneNumbers));
		}

		return specifications;
	}

}
