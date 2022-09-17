package com.stockapp.exception;

public class OutOfStockLimitException extends StockNotFoundException{

	private static final long serialVersionUID = 1L;

	public OutOfStockLimitException() {
		super();
	}

	public OutOfStockLimitException(String message) {
		super(message);
	}
	

}
