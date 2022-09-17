package com.stockapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.stockapp.model.Buyer;
import com.stockapp.model.Stock;

@Repository
public interface IBuyerRepository extends JpaRepository<Buyer, Integer> {

	// Derived querry
	Buyer findByBuyerName(String buyerName);
	Buyer findByAccountNumber(long accountNumber);
	List<Buyer> findByStockQuantity(int stockQuantity);
	List<Buyer> findAll();

	// Native query
	@Query(value = "select * from buyer b inner join stock s on b.buyer_id=s.stock_id where s.stock_name=?1", nativeQuery = true)
	List<Buyer> findByStockName(String stockName);

	//custom querry
	@Query("from Buyer b inner join b.stock s where s.stockName=?1")
	List<Buyer> findBuyersByStock(String stockName);

}
