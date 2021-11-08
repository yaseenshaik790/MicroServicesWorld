package com.sky.account.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.sky.account.dto.GetTransactionsAccountRequest;
import com.sky.account.dto.GetTransactionsRequest;
import com.sky.account.dto.TransactionDto;
import com.sky.account.dto.TransactionsInfo;
import com.sky.account.repository.TransactionRepository;

import reactor.core.publisher.Mono;

@Service
public class TransactionService {

	@Autowired
	private TransactionRepository repository;

	@Autowired
	private WebClient.Builder builder;

	public TransactionsInfo getTransaction(GetTransactionsRequest request) {
		// TODO Auto-generated method stub
		return repository.getTransaction(request);
	}

	public TransactionsInfo getTransactionForAccount(GetTransactionsAccountRequest request) {
		// TODO Auto-generated method stub
		return repository.getTransactionForAccount(request);
	}

	public TransactionsInfo makeWebClientCall() {
		TransactionDto dto = new TransactionDto();

		String output = builder.build().get().uri("http://localhost:8989/bank/users/").retrieve()
				.bodyToMono(String.class).block();
		dto.setAccountName(output);
		return new TransactionsInfo(Arrays.asList(dto), 1, 1, true, true);
		// return repository.getTransaction(request);
	}

}
