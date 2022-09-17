package com.stockapp.service;

import java.util.List;

import com.stockapp.model.Buyer;
import com.stockapp.model.Stock;

public interface IBuyerService {

	void addBuyer(Buyer buyer);
	void updateBuyer(Buyer buyer);
	void deleteBuyer(int buyerId);
	Buyer getByBuyerId(int buyerId);

	// Derived querry
	List<Buyer> getByStockQuantity(int stockQuantity);
	Buyer getByBuyerName(String buyerName);
	Buyer getByAccountNumber(long accountNumber);
	List<Buyer> getAll();
	
	
	
	//native query
	List<Buyer> getByStockName(String stockName);
	
	//customized querry
	List<Buyer> getBuyersByStock(String stockName);
	
	
	
}
