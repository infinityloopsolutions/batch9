package com.arrays;

import java.util.Scanner;

public class School {

	public static void main(String[] args) {
		String names[] = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many names you want to store? ");
		int num = sc.nextInt();
		names = new String[num];
		for (int i = 0; i < names.length; i++) {

			System.out.println("please enter " + (i + 1) + " name ");
			names[i] = sc.next();
		}

		for (int j = 0; j < names.length; j++) {
			System.out.println((j + 1) + " name : " + names[j]);
		}

	}

}
