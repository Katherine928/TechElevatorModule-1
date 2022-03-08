package com.techelevator;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter in a series of decimal values (separated by spaces):");
		String input = myScanner.nextLine();
		String[] numbers = input.split(" ");
		for (int i = 0; i < numbers.length; i++) {
			int num = Integer.parseInt(numbers[i]);
			int number = Integer.parseInt(numbers[i]);
			int count = 0;
			while (num >= 1) {
				if (num % 2 == 0) {
					num = num / 2;

				} else {
					num = (num - 1) / 2;
				}
				count += 1;
			}
			String[] binary = new String[count];
			String[] binaryNumber = new String[count];
			for (int j = 0; j < binary.length; j++) {
				if (number % 2 == 0) {
					number = number / 2;
					binary[j] = "0";

				} else {
					number = (number - 1) / 2;
					binary[j] = "1";
				}
			}
			for (int l = 0; l < binary.length; l++) {
				binaryNumber[l] = binary[binary.length - l -1];
			}
			String rec = String.join("", binaryNumber);
			System.out.println(numbers[i] + " in binary is " + rec);
		}
	}

}
