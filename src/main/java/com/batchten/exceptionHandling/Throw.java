package com.batchten.exceptionHandling;

import java.util.Scanner;

public class Throw {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your age");
			int age = sc.nextInt();
			if (age > 18) {
				System.out.println("You are eligible to vote");
			} else {
				throw new BelowAgeException("age is lesser than 18");
			}

		} catch (BelowAgeException be) {
			System.out.println(be.getMessage());
		} finally {

		}

	}
}
