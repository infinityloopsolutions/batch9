package com.batchten.exceptionHandling;

import java.nio.ReadOnlyBufferException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTry {
	static Scanner sc;

	public static void main(String[] args) {
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter 1st input");
			int a = sc.nextInt();
			System.out.println("Enter 2nd input");
			int b = sc.nextInt();
			try {
				System.out.println("Division result = " + (a / b));
			} catch (InputMismatchException ae) {
				System.out.println("do not enter 0 as input");
			}
			finally {
				System.out.println("I am inner finally");
			}

		} catch (Exception ex) {
			System.out.println("Some problem occured");

		}
		finally {
			System.out.println("I am outter finally");
		}
	}

}
