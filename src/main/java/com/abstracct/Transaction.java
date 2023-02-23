package com.abstracct;

public abstract class Transaction {

	int balance;
	int accno;
	String name;
	
	public abstract void checkDetails();

	public abstract void intiateTransact();

	public void rollback() {
		System.out.println("Initiating rollback");
	}

}
