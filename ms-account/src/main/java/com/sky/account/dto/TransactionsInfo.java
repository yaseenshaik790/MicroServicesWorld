package com.sky.account.dto;

import java.util.List;

public class TransactionsInfo {
	
	private List<TransactionDto> dtos;
	private Integer pageNumber;
	private Integer pageSize;
	private Boolean isLastPage;
	private Boolean isFirstPage;
	public List<TransactionDto> getDtos() {
		return dtos;
	}
	public void setDtos(List<TransactionDto> dtos) {
		this.dtos = dtos;
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
	public TransactionsInfo(List<TransactionDto> dtos, Integer pageNumber, Integer pageSize, Boolean isLastPage,
			Boolean isFirstPage) {
		super();
		this.dtos = dtos;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
		this.isLastPage = isLastPage;
		this.isFirstPage = isFirstPage;
	}
	public TransactionsInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
