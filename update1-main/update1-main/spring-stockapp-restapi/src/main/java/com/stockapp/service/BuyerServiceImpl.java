package com.stockapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stockapp.model.Buyer;
import com.stockapp.repository.IBuyerRepository;

@Service
public class BuyerServiceImpl implements IBuyerService {

	IBuyerRepository buyerRepository;

	@Autowired
	public void setBuyerRepository(IBuyerRepository buyerRepository) {
		this.buyerRepository = buyerRepository;
	}

	@Override
	public void addBuyer(Buyer buyer) {
		buyerRepository.save(buyer);
	}

	@Override
	public void updateBuyer(Buyer buyer) {
		buyerRepository.save(buyer);
	}

	@Override
	public void deleteBuyer(int buyerId) {
		buyerRepository.deleteById(buyerId);
	}

	@Override
	public Buyer getByBuyerId(int buyerId) {
		return buyerRepository.findById(buyerId).get();
	}

	@Override
	public List<Buyer> getByStockQuantity(int stockQuantity) {
		return buyerRepository.findByStockQuantity(stockQuantity);
	}

	@Override
	public Buyer getByAccountNumber(long accountNumber) {
		return buyerRepository.findByAccountNumber(accountNumber);
	}

	@Override
	public Buyer getByBuyerName(String buyerName) {
		return buyerRepository.findByBuyerName(buyerName);
	}

	@Override
	public List<Buyer> getAll() {
		return buyerRepository.findAll();
	}

	@Override
	public List<Buyer> getByStockName(String stockName) {
		return buyerRepository.findByStockName(stockName);
	}

	@Override
	public List<Buyer> getBuyersByStock(String stockName) {
		return buyerRepository.findBuyersByStock(stockName);
	}

}
