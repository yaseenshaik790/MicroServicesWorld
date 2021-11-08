package com.sky.account.repository;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.sky.account.dto.GetTransactionsAccountRequest;
import com.sky.account.dto.GetTransactionsRequest;
import com.sky.account.dto.TransactionDto;
import com.sky.account.dto.TransactionsInfo;
import com.sky.account.model.Account;
import com.sky.account.model.Transaction;
import com.sky.account.model.TransactionDao;
import com.sky.account.model.TransactionSpecification;

@Repository
public class TransactionRepository {

	@Autowired
	private TransactionDao dao;

	@Autowired
	private TransactionSpecification specification;

	@Transactional
	public TransactionsInfo getTransaction(GetTransactionsRequest request) {

		Pageable pageable = PageRequest.of(request.getPageNumber() - 1, request.getPageSize(), Sort.Direction.DESC,
				"amount");
		Page<Transaction> pages = dao.findAll(specification.getSpec(request), pageable);

		System.out.println(" Specification : " + specification.getSpec(request));

		if (pages.hasContent()) {
			System.out.println(" List Size : " + pages.getContent().size());
			List<TransactionDto> dtos = pages.getContent().stream().map((Transaction t) -> {
				TransactionDto dto = new TransactionDto();
				dto.setTransactionId(t.getTransactionId());
				Account account = t.getAccount();
				dto.setAccountNo(account.getAccountNo());
				dto.setAmount(t.getAmount());
				dto.setDescription(t.getDescription());
				dto.setTransactionDate(t.getTransactionDate());
				return dto;
			}).collect(Collectors.toList());

			return new TransactionsInfo(dtos, pages.getSize(), pages.getSize(), pages.isLast(), pages.isFirst());
		}
		return new TransactionsInfo(Collections.emptyList(), pages.getSize(), pages.getSize(), pages.isLast(),
				pages.isFirst());
	}

	public TransactionsInfo getTransactionForAccount(GetTransactionsAccountRequest request) {

		Pageable pageable = PageRequest.of(request.getPageNumber() - 1, request.getPageSize(), Sort.Direction.DESC,
				"amount");
		Page<Transaction> pages = dao.findAll(specification.createSpec(request), pageable);

		System.out.println(" Specification : " + specification.createSpec(request));

		if (pages.hasContent()) {
			System.out.println(" List Size : " + pages.getContent().size());
			List<TransactionDto> dtos = pages.getContent().stream().map((Transaction t) -> {

				TransactionDto dto = new TransactionDto();
				dto.setTransactionId(t.getTransactionId());

				dto.setAmount(t.getAmount());
				dto.setDescription(t.getDescription());
				dto.setTransactionDate(t.getTransactionDate());

				Account account = t.getAccount();
				dto.setAccountNo(account.getAccountNo());
				return dto;
			}).collect(Collectors.toList());

			return new TransactionsInfo(dtos, pages.getSize(), pages.getSize(), pages.isLast(), pages.isFirst());
		}
		return new TransactionsInfo(Collections.emptyList(), pages.getSize(), pages.getSize(), pages.isLast(),
				pages.isFirst());
	}

}
