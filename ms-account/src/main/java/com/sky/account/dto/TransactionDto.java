package com.sky.account.dto;

import java.time.LocalDateTime;

public class TransactionDto {

	private Integer transactionId;

	private Integer accountId;

	private String description;

	private Double amount;
	
	private Integer accountNo;
	
	private String accountName;

	private LocalDateTime transactionDate;

	public TransactionDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getAccountNo() {
		return accountNo;
	}



	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}



	public String getAccountName() {
		return accountName;
	}



	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}



	public TransactionDto(Integer transactionId, Integer accountId, String description, Double amount,
			Integer accountNo, String accountName, LocalDateTime transactionDate) {
		super();
		this.transactionId = transactionId;
		this.accountId = accountId;
		this.description = description;
		this.amount = amount;
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.transactionDate = transactionDate;
	}



	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}

}
