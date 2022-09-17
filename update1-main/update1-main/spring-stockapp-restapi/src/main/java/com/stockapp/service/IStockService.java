package com.stockapp.service;

import java.util.List;

import com.stockapp.model.Stock;

public interface IStockService {
	
	//Derived Querry
	void addStock(Stock stock);
	void updateStock(Stock stock);
	void deleteStock(int stockId);
	Stock getByStockId(int stockId);
	
	List<Stock> getAll();
	Stock getByStockName(String stockName);
	Stock getByProfit(double profit);
	
	//Custom Querry
	Stock getByDetailStockType(String stockType);
	List<Stock> getByTermTermName(String termName);
	List<Stock> getStocksByBuyer(String buyerName);
	List<Stock> getStocksByBuyerAccountNumber(long accountNumber);
	
	
}
