package com.stockapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.stockapp.model.Buyer;
import com.stockapp.model.Detail;
import com.stockapp.model.Stock;
import com.stockapp.model.Term;
import com.stockapp.service.IBuyerService;

import com.stockapp.service.IStockService;

@SpringBootApplication
public class SpringStockappRestapiApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(SpringStockappRestapiApplication.class, args);
	}

	IStockService stockService;
	@Autowired
	public void setStockService(IStockService stockService) {
		this.stockService = stockService;
	}

	IBuyerService buyerService;
	@Autowired
	public void setBuyerService(IBuyerService buyerService) {
		this.buyerService = buyerService;
	}

	@Override
	public void run(String... args) throws Exception {

//		Detail detail = new Detail("NSE", 1000);
//		Term term1=new Term("short");
//		Term term2= new Term("long");
//		Set<Term> terms = new HashSet<>(Arrays.asList(term1,term2));
//		Buyer buyer1 = new Buyer("Kiran", 1234567, "kiran123@gmail.com", 10);
//		Buyer buyer2 = new Buyer("Rani", 1234555, "rani321@gmail.com", 5);
//		Set<Buyer> buyers = new HashSet<>(Arrays.asList(buyer1,buyer2));
//		Stock stock1= new Stock("Kiran", "kiran123", "tata", 10000, 10, 50, detail, buyers, terms);
//		
//		stockService.addStock(stock1);

		// Newly Created and Working
//		Detail detail1 = new Detail("NSE", 1000);
//		Term term1 = new Term("SHORTTERM");
//		Term term2 = new Term("LONGTERM");
//		
//		Set<Term> terms1 = new HashSet<>(Arrays.asList(term1, term2));
//		Buyer buyer1 = new Buyer("Sriram Shane", 1234567, "sriram@gmail.com", 10);
//		Buyer buyer2 = new Buyer("Akhil Mirashi", 1234568, "akhil@gmail.com", 200);
//		Set<Buyer> buyers = new HashSet<>(Arrays.asList(buyer1,buyer2));
//		Stock stock1 = new Stock("INFY", 5000, 25000, detail1, buyers, terms1);
//		stockService.addStock(stock1);
//		
//		Detail addDetail2 = new Detail("BSE", 10000);
//		detailService.add(addDetail2);
//		
//		Detail updateDetail1 = new Detail("BSE", 2000);
//		detailService.update(updateDetail1);
//		
//		termService.deleteByTerm(1);
//		
//		Buyer updateBuyer1 = new Buyer("Dhanya Kumar", 1234567, "dhanya123@gmail.com", 100);
//		buyerService.updateBuyer(updateBuyer1);
//		
//		Buyer newBuyer2 = new Buyer("Nikhil Mirashi", 1234568, "nikhil123@gmail.com", 200);
//		buyerService.addBuyer(newBuyer2);

//		Buyer updateBuyer1 = new Buyer("Dhanya", 2, 12565655, "kumar123@gmail.com", 10);
//		buyerService.updateBuyer(updateBuyer1);

		// buyerService.deleteBuyer(3);

		// termService.deleteTerm(2);

		// termService.deleteTerm(3);

		// stockService.deleteStock(3);

//		Detail detail1 = new Detail("NSE", 1000);
//		Term term1 = new Term("SHORTTERM");
//		Term term2 = new Term("LONGTERM");
//		
//		Set<Term> terms1 = new HashSet<>(Arrays.asList(term1, term2));
//		Stock stock1 = new Stock("INFY", 5, 20000, detail1, terms1);
//		stockService.addStock(stock1);
//		
		// Derived Querry
//		buyerService.getByStockQuantity(10).forEach(System.out::println);
//		System.out.println(buyerService.getByAccountNumber(12565655));
//		System.out.println(buyerService.getByBuyerName("Kiran"));

		// Derived Querry & custom querry
//		detailService.getByStockType("NSE").forEach(System.out::println);
//		detailService.getByStockCurrentPrice(1000).forEach(System.out::println);

//		termService.getByTermName("LONGTERM").forEach(System.out::println);

		// stockService.getAll().forEach(System.out::println);
//		System.out.println(stockService.getByStockName("INFY"));

//		System.out.println(stockService.getByProfit(5));

//		detailService.getAll().forEach(System.out::println);
//		termService.getAll().forEach(System.out::println);
//		buyerService.getAll().forEach(System.out::println);

		// Native query for buyer
		// buyerService.getByStockName("INFY").forEach(System.out::println);

//		System.out.println(stockService.getByDetailStockType("NSE"));
//		stockService.getAll().forEach(System.out::println);
//		buyerService.getAll().forEach(System.out::println);
//		stockService.getByTermTermName("LONGTERM").forEach(System.out::println);

//		stockService.getStocksByBuyer("Nikhil Mirashi").forEach(System.out::println);
//		buyerService.getBuyersByStock("INFY").forEach(System.out::println);
//		stockService.getStocksByBuyerAccountNumber(1234568).forEach(System.out::println);
		System.out.println(stockService.getByStockId(1));
	}

}
