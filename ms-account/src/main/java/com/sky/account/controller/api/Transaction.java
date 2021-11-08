package com.sky.account.controller.api;

import java.time.LocalDateTime;

public class Transaction {
	
	private Integer transactionId;

	private Integer accountId;

	private String description;

	private Double amount;

	private LocalDateTime transactionDate;
	private Integer pageNumber;
	private Integer pageSize;
	private Boolean isLastPage;
	private Boolean isFirstPage;

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Transaction(Integer transactionId, Integer accountId, String description, Double amount,
			LocalDateTime transactionDate, Integer pageNumber, Integer pageSize, Boolean isLastPage,
			Boolean isFirstPage) {
		super();
		this.transactionId = transactionId;
		this.accountId = accountId;
		this.description = description;
		this.amount = amount;
		this.transactionDate = transactionDate;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
		this.isLastPage = isLastPage;
		this.isFirstPage = isFirstPage;
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



	public Integer getPageNumber() {
		return pageNumber;
	}



	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}



	public Integer getPageSize() {
		return pageSize;
	}



	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}



	public Boolean getIsLastPage() {
		return isLastPage;
	}



	public void setIsLastPage(Boolean isLastPage) {
		this.isLastPage = isLastPage;
	}



	public Boolean getIsFirstPage() {
		return isFirstPage;
	}



	public void setIsFirstPage(Boolean isFirstPage) {
		this.isFirstPage = isFirstPage;
	}
	
}
