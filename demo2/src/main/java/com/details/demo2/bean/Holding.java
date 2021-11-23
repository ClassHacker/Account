
package com.details.demo2.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tbl_holding")
public class Holding{
	
	@Id
	@Column(name="holdingId")
	private int holdingId;
	
	@Column(name="holdingName")
	private String holdingName;
	
	@Column(name="balance")
	private int balance;
	
	@Column(name="holdingType")
	private String holdingType;
	
	@Column(name="quantity")
	private int quantity;
		
	public Holding() {
		super();
		
	}
	
	public Holding(int holdingId, String holdingName, int balance, String holdingType, int quantity) {
		super();
		this.holdingId = holdingId;
		this.holdingName = holdingName;
		this.balance = balance;
		this.holdingType = holdingType;
		this.quantity = quantity;
	}

	public int getHoldingId() {
		return holdingId;
	}
	public void setHoldingId(int holdingId) {
		this.holdingId = holdingId;
	}
	public String getHoldingName() {
		return holdingName;
	}
	public void setHoldingName(String holdingName) {
		this.holdingName = holdingName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getHoldingType() {
		return holdingType;
	}
	public void setHoldingType(String holdingType) {
		this.holdingType = holdingType;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}