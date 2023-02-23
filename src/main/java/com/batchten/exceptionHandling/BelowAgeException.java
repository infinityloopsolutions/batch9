package com.batchten.exceptionHandling;

public class BelowAgeException extends Exception{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = -8283458550375042271L;
	public BelowAgeException() {
		super();
	}
	public BelowAgeException(String message) {
		super(message);
		
		System.out.println("Hello, This is a custom exception");
	}
	

}
