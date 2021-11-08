package com.sky.account.controller.api;

import java.util.List;

public class TransationResponse {
	
	private List<Transaction> transaction;
	private Integer pageNumber;
	private Integer pageSize;
	private Boolean isLastPage;
	private Boolean isFirstPage;
	public TransationResponse(List<Transaction> transaction, Integer pageNumber, Integer pageSize, Boolean isLastPage,
			Boolean isFirstPage) {
		super();
		this.transaction = transaction;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
		this.isLastPage = isLastPage;
		this.isFirstPage = isFirstPage;
	}
	public TransationResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Transaction> getTransaction() {
		return transaction;
	}
	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
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
