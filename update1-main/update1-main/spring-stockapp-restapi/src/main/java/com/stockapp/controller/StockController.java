package com.stockapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockapp.model.Stock;
import com.stockapp.service.IStockService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("stocks-api")
public class StockController {

	IStockService stockService;

	@Autowired
	public void setStockService(IStockService stockService) {
		this.stockService = stockService;
	}

	// http://localhost:8081/stocks-api/stocks
	@PostMapping("/stocks")
	public ResponseEntity<Void> addStock(@RequestBody Stock stock) {
		stockService.addStock(stock);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "one stock is added");
		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).build();
	}

	// http://localhost:8081/stocks-api/stocks
	@PutMapping("/stocks")
	public ResponseEntity<Void> updateStock(@RequestBody Stock stock) {
		stockService.updateStock(stock);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "one stock is updated");
		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).build();
	}

	// http://localhost:8081/stocks-api/stocks/1
	@DeleteMapping("/stocks/{stockId}")
	public ResponseEntity<Void> deleteStock(@PathVariable("stockId") int stockId) {
		stockService.deleteStock(stockId);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "one stock is deleted");
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	// http://localhost:8081/stocks-api/stocks
	@GetMapping("/stocks")
	public ResponseEntity<List<Stock>> getAll() {
		// response body
		List<Stock> stocks = stockService.getAll();
		HttpHeaders headers = new HttpHeaders();
		// response headers
		headers.add("desc", "All stocks");
		headers.add("info", "Getting stocks from db");
		ResponseEntity<List<Stock>> responseEntity = new ResponseEntity<List<Stock>>(stocks, headers, HttpStatus.OK);
		return responseEntity;
	}

	// http://localhost:8081/stocks-api/stocks/stockId/1
	@GetMapping("/stocks/stockId/{stockId}")
	public ResponseEntity<Stock> getById(@PathVariable("stockId") int stockId) {
		Stock stock = stockService.getByStockId(stockId);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "one stock");
		headers.add("info", "getting one stock from db");
		ResponseEntity<Stock> responseEntity = new ResponseEntity<Stock>(stock, headers, HttpStatus.OK);
		return responseEntity;
	}

}
