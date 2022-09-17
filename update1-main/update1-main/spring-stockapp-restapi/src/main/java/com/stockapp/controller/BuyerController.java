package com.stockapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.stockapp.model.Buyer;
import com.stockapp.model.Stock;
import com.stockapp.service.IBuyerService;

@RestController
@RequestMapping("stocks-api")
public class BuyerController {

	IBuyerService buyerService;

	@Autowired
	public void setBuyerService(IBuyerService buyerService) {
		this.buyerService = buyerService;
	}

	// http://localhost:8080/stocks-api/buyers
	@GetMapping("/buyers")
	public ResponseEntity<List<Buyer>> getAll() {
		// response body
		List<Buyer> buyers = buyerService.getAll();
		HttpHeaders headers = new HttpHeaders();
		// response headers
		headers.add("desc", "All buyers");
		headers.add("info", "Getting buyers from db");
		ResponseEntity<List<Buyer>> responseEntity = new ResponseEntity<List<Buyer>>(buyers, headers, HttpStatus.OK);
		return responseEntity;
	}

	// http://localhost:8080/stocks-api/buyers
	@PostMapping("/buyers")
	public ResponseEntity<Void> addBuyer(@RequestBody Buyer buyer) {
		buyerService.addBuyer(buyer);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", " one buyer added");
		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).build();
	}

}
