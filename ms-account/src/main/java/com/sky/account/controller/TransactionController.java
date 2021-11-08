package com.sky.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sky.account.controller.api.TransationResponse;
import com.sky.account.dto.GetTransactionsAccountRequest;
import com.sky.account.dto.GetTransactionsRequest;
import com.sky.account.dto.TransactionsInfo;
import com.sky.account.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	private TransactionService transactionService;

	@GetMapping("/get")
	public TransactionsInfo getTransaction(@RequestBody GetTransactionsRequest request) {

		if (request == null) {
			return null;
		}
		TransactionsInfo info = transactionService.getTransaction(request);

		return info;
	}

	@GetMapping("/getDebits")
	public TransactionsInfo getTransaction(@RequestBody GetTransactionsAccountRequest request) {

		if (request == null) {
			return null;
		}
		TransactionsInfo info = transactionService.getTransactionForAccount(request);

		return info;
	}

	@GetMapping("/webclient")
	public TransactionsInfo getWebClient() {

		TransactionsInfo info = transactionService.makeWebClientCall();

		return info;
	}

}
