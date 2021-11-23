package com.details.demo2.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Builder;


@Entity
@Table(name ="tbl_account")
public class Account{
	
	@Id
	@Column(name = "accountId")
	private int accountId;
	
	@Column(name = "accountName")
	private String accountName;
	 
	@Column(name = "profileId")
	private int profileId;
	
	@Column(name = "totalAccountBalanc")
	private int totalAccountBalance;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "accountId",referencedColumnName = "accountId")
	private List<Holding> holding;
	
	public Account() {
		super();
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public int getTotalAccountBalance() {
		return totalAccountBalance;
	}

	public void setTotalAccountBalance(int totalAccountBalance) {
		this.totalAccountBalance = totalAccountBalance;
	}

	public List<Holding> getHolding() {
		return holding;
	}

	public void setHolding(List<Holding> holding) {
		this.holding = holding;
	}

	public Account(int accountId, String accountName, int profileId, int totalAccountBalance, List<Holding> holding) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.profileId = profileId;
		this.totalAccountBalance = totalAccountBalance;
		this.holding = holding;
	}
	
	
}
