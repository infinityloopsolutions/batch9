package com.batchten.exceptionHandling;

public class InsufficientBalanceException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5416530650635299836L;

	public InsufficientBalanceException() {
		super();
	}
	
	public InsufficientBalanceException(String message) {
		super(message);
		
	}
	
}
