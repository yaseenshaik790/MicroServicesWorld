package com.sky.customer.entity;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

public interface CustomerDao extends JpaRepository<Customer, Integer>, JpaSpecificationExecutor<Customer> {

	Optional<Customer> findByCustomerId(Integer customerId);

	Page<Customer> findByPhoneIn(List<Integer> phones, Pageable page);

	public Page<Customer> findAll(Specification<Customer> spec, Pageable pageable);

}
