package com.sky.account.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import com.sky.account.dto.GetTransactionsAccountRequest;
import com.sky.account.dto.GetTransactionsRequest;

@Component
public class TransactionSpecification {

	public TransactionSpecification() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Specification<Transaction> getSpec(GetTransactionsRequest request) {

		// return (root, query, cb) ->
		// cb.in(root.get("transactionId")).value(request.getTransactionId());

		return (root, query, cb) -> {
			List<Predicate> predicates = new ArrayList<>();
			Predicate p1 = cb.in(root.get("transactionId")).value(request.getTransactionId());
			predicates.add(p1);
			return cb.and(predicates.toArray(new Predicate[0]));
		};

	}

	public Specification<Transaction> createSpec(GetTransactionsAccountRequest request) {

		// return (root, query, cb) ->
		// cb.in(root.get("transactionId")).value(request.getTransactionId());

		return (root, query, cb) -> {
			List<Predicate> predicates = new ArrayList<>();
			Join<Account, Transaction> at = root.join("account", JoinType.INNER);

			Predicate p1 = cb.equal(at.get("amount"), 80);
			Predicate p2 = cb.in(at.get("accountNo")).value(request.getAccountNo());
			predicates.add(p1);
			predicates.add(p2);
			return cb.and(predicates.toArray(new Predicate[1]));
		};

	}

}
