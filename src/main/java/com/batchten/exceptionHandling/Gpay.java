package com.batchten.exceptionHandling;

import java.util.Scanner;

public class Gpay {

	public static void main(String[] args) {
		try {
			int balance = 10000;
			System.out.println("Enter how much you want to transfer");
			Scanner sc = new Scanner(System.in);
			int amount = sc.nextInt();
			System.out.println("Enter account number");
			int accountno = sc.nextInt();
			if(amount > balance) {
				throw new InsufficientBalanceException();
			}
			
			if(accountno!=123456) {
				throw new Exception("Account number mismatch exception");
			}
			
		}
		catch(InsufficientBalanceException ie) {
			
		}
		
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
