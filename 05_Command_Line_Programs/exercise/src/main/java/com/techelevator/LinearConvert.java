package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter the length:");
		int lengthInput = myScanner.nextInt();
		myScanner.nextLine();
		System.out.println("Is the measurement in (m)eter, or (f)eet?");
		String measurement = myScanner.nextLine();
		if (measurement.equalsIgnoreCase("m") || measurement.equalsIgnoreCase("meter")) {
			double lengthF = lengthInput * 3.2808399;
			int feet = (int)lengthF;
			System.out.println(lengthInput + "m is " + feet + "f.");
		} else if (measurement.equalsIgnoreCase("f") || measurement.equalsIgnoreCase("feet")) {
			double lengthM = lengthInput * 0.3084;
			int meter = (int)lengthM;
			System.out.println(lengthInput + "f is " + meter + "m.");
		}
		System.out.println("Please enter a valid answer for the question!");
	}

}
