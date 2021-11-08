package com.sky.account.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT")
public class Account implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ACCOUNT_ID")
	private Integer accountId;

	@Column(name = "ACCOUNT_NAME")
	private String accountName;
	
	@Column(name = "ACCOUNT_NO")
	private Integer accountNo;
	
	@OneToMany(mappedBy = "account")
	private List<Transaction> transactions;

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

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public Account(Integer accountId, String accountName, Integer accountNo, List<Transaction> transactions) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountNo = accountNo;
		this.transactions = transactions;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
