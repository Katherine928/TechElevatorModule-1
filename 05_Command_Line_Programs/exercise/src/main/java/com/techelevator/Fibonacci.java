package com.techelevator;

import java.io.OutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int numInput = myScanner.nextInt();
		myScanner.nextLine();
		if (numInput <= 0) {
			System.out.println("0, 1");
		} else if (numInput == 1) {
			System.out.println("0, 1, 1");
		} else {
			int numOfArray = 0;
			int sum = 0;
			int num1 = 0;
			int num2 = 1;
			while (sum <= numInput) {
				sum = num1 + num2;
				num1 = num2;
				num2 = sum;
				numOfArray += 1;
			}
			int[] fib = new int[numOfArray + 1];
			fib[0] = 0;
			fib[1] = 1;
			for (int i = 2; i < fib.length; i++) {
				fib[i] = fib[i-1] + fib[i-2];
			}
			String[] fibAsString = new String[numOfArray + 1];
			for (int j = 0; j < fib.length; j++) {
				fibAsString[j] = Integer.toString(fib[j]);
			}
			String result = String.join(", ", fibAsString);
			System.out.println(result);

		}

	}

}
