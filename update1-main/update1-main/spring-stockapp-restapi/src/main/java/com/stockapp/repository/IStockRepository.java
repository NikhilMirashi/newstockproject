package com.stockapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.stockapp.model.Stock;

@Repository
public interface IStockRepository extends JpaRepository<Stock, Integer> {

	// Derived Querries
	Stock findByStockName(String stockName);
	Stock findByProfit(double profit);
	List<Stock> findAll();
//	Stock findByStockId();
	

	// custom Querry
	@Query("from Stock s inner join s.detail d where d.stockType=?1")
	Stock findByDetailStockType(String stockType);

	@Query("from Stock s inner join s.term t where t.termName=?1")
	List<Stock> findByTermTermName(String termName);

	@Query("from Stock s inner join s.buyers b where b.buyerName=?1")
	List<Stock> findStocksByBuyer(String buyerName);

	@Query("from Stock s inner join s.buyers b where b.accountNumber=?1")
	List<Stock> findStocksByBuyerAccountNumber(long accountNumber);

}
