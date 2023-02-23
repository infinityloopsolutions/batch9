package com.batchten.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter divider value");
		int a = sc.nextInt();
		System.out.println("Enter divisor value");
		int b = sc.nextInt();		
		System.out.println("result = "+(a/b));
		}
		catch(ArithmeticException ae) {
			System.out.println("you have entered 0 as divisor. Please enter another value..");
		}
		catch(InputMismatchException ime) {
			System.out.println("Please enter valid input");
		}
		catch(Exception ex) {
			System.out.println();
		}
		finally {
			System.out.println("This is finally block");
		}

	}

}
