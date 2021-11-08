package com.sky.customer.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.criteria.Predicate;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class CustSpec {

	public Specification<Customer> getUser(List<Integer> phones) {
		return (root, criteria, cb) -> {
			List<Predicate> predicates = new ArrayList<>();
			if (!CollectionUtils.isEmpty(phones)) {
				Predicate p = cb.in(root.get("phone")).value(phones);
				predicates.add(p);
			}
						
			return cb.and(predicates.toArray(new Predicate[0]));
		};
	}

}
