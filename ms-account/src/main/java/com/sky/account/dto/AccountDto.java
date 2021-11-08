package com.sky.account.dto;


public class AccountDto {

	private Integer accountId;

	private String accountName;

	private Integer accountNo;

	public AccountDto(Integer accountId, String accountName, Integer accountNo) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountNo = accountNo;
	}

	public AccountDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

}
