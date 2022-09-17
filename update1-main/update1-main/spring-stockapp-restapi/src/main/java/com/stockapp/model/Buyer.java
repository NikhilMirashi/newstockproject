package com.stockapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Buyer {

	private String buyerName; // buyername

	@Id
	@GeneratedValue(generator = "buyer_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "buyer_gen", initialValue = 1, allocationSize = 1)
	private Integer buyerId; // buyerid
	private long accountNumber;// buyer account no
	private String emailId; // buyer mailid

	private int stockQuantity; // amount of stock brought

	@JsonIgnore
	@ManyToMany(mappedBy = "buyers")
	private Set<Stock> stock;

	public Buyer() {
		super();
	}

	public Buyer(String buyerName, long accountNumber, String emailId, int stockQuantity) {
		super();
		this.buyerName = buyerName;
		this.accountNumber = accountNumber;
		this.emailId = emailId;
		this.stockQuantity = stockQuantity;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public Integer getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public Set<Stock> getStock() {
		return stock;
	}

	public void setStock(Set<Stock> stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Buyer [buyerName=" + buyerName + ", accountNumber=" + accountNumber + ", emailId=" + emailId
				+ ", stockQuantity=" + stockQuantity + "]";
	}

}
