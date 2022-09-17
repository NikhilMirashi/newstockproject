package com.stockapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockapp.model.Stock;
import com.stockapp.repository.IStockRepository;

@Service
public class StockServiceImpl implements IStockService {

	IStockRepository stockRepository;

	@Autowired
	public void setStockRepository(IStockRepository stockRepository) {
		this.stockRepository = stockRepository;
	}

	@Override
	public void addStock(Stock stock) {
		stockRepository.save(stock);
	}

	@Override
	public void updateStock(Stock stock) {
		stockRepository.save(stock);
	}

	@Override
	public void deleteStock(int stockId) {
		stockRepository.deleteById(stockId);

	}

	@Override
	public Stock getByStockId(int stockId) {
		return stockRepository.findById(stockId).get();
	}

	@Override
	public List<Stock> getAll() {
		return stockRepository.findAll();
	}

	@Override
	public Stock getByStockName(String stockName) {
		return stockRepository.findByStockName(stockName);
	}

	@Override
	public Stock getByProfit(double profit) {
		return stockRepository.findByProfit(profit);
	}

	@Override
	public Stock getByDetailStockType(String stockType) {
		return stockRepository.findByDetailStockType(stockType);
	}

	@Override
	public List<Stock> getByTermTermName(String termName) {
		return stockRepository.findByTermTermName(termName);
	}

	@Override
	public List<Stock> getStocksByBuyer(String buyerName) {
		return stockRepository.findStocksByBuyer(buyerName);
	}

	@Override
	public List<Stock> getStocksByBuyerAccountNumber(long accountNumber) {
		return stockRepository.findStocksByBuyerAccountNumber(accountNumber);
	}

	



}
