package com.sky.account.dto;

import java.time.LocalDateTime;
import java.util.List;

public class GetTransactionsRequest {

	private List<Integer> transactionId;
	private LocalDateTime transactionDateTime;
	private Integer pageNumber;
	private Integer pageSize;


	public List<Integer> getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(List<Integer> transactionId) {
		this.transactionId = transactionId;
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

	public GetTransactionsRequest(List<Integer> transactionId, LocalDateTime transactionDateTime, Integer pageNumber,
			Integer pageSize) {
		super();
		this.transactionId = transactionId;
		this.transactionDateTime = transactionDateTime;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
	}

	public GetTransactionsRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

}
