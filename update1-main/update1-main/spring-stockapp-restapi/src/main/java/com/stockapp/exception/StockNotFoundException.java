package com.stockapp.exception;

public class StockNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;

	public StockNotFoundException() {
		super();
	}

	public StockNotFoundException(String message) {
		super(message);
	}
	

}
