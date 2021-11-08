package com.sky.account.dto;

import java.time.LocalDateTime;
import java.util.List;

public class GetTransactionsAccountRequest {

	private List<Integer> accountNo;
	private LocalDateTime transactionDateTime;
	private Integer pageNumber;
	private Integer pageSize;

	public GetTransactionsAccountRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GetTransactionsAccountRequest(List<Integer> accountNo, LocalDateTime transactionDateTime, Integer pageNumber,
			Integer pageSize) {
		super();
		this.accountNo = accountNo;
		this.transactionDateTime = transactionDateTime;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
	}

	public List<Integer> getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(List<Integer> accountNo) {
		this.accountNo = accountNo;
	}

	public LocalDateTime getTransactionDateTime() {
		return transactionDateTime;
	}

	public void setTransactionDateTime(LocalDateTime transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
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

}
