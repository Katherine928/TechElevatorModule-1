package com.techelevator;

import java.util.Locale;
import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter the temperature:");
		int temp = myScanner.nextInt();
		myScanner.nextLine();
		System.out.println("Is the measurement in (C)elsius, or (F)ahrenheir?");
		String measurement = myScanner.nextLine();
		if (measurement.equalsIgnoreCase("c") || measurement.equalsIgnoreCase("celsius")) {
			double doubleTempF = temp * 1.8 + 32;
			int tempF = (int)doubleTempF;
			System.out.println(temp + "C is " + tempF + "F.");
		} else if (measurement.equalsIgnoreCase("f") || measurement.equalsIgnoreCase("fahrenheir")){
			double doubleTempC = (temp - 32) / 1.8;
			int tempC = (int)doubleTempC;
			System.out.println(temp + "F is " + tempC + "C.");
		}
		System.out.println("Please enter a valid answer for the question!");
	}

}
