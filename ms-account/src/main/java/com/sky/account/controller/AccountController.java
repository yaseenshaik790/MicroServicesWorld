package com.sky.account.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sky.account.dto.GetAccountRequest;
import com.sky.account.service.AccountService;

@RestController
public class AccountController {

	// @Autowired
	// private AccountService accountService;

	public ResponseEntity<String> saveAccountNumber(@RequestBody GetAccountRequest request) {

		// String message = request != null ? accountService.saveAccount(request) :
		// null;

		return new ResponseEntity<>(null, HttpStatus.CREATED);
	}

}
