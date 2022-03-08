package com.techelevator;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class HumanAgeInDogYear {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("OPTION 1: How old are you human:");
        String answer = myScanner.nextLine();
        int humanAge = Integer.parseInt(answer);
        int ageInDogYears = humanAge * 7;
        System.out.println("Your human age is " + humanAge + ", and your dog age is " + ageInDogYears + "!");

        System.out.println("OPTION 2: How old are you human:");
        int ageAsInteger = myScanner.nextInt();
        myScanner.nextLine(); // get rid of "\n"

        System.out.println("OPTION 3: Enter human ages as a series of numbers separated by commas:");
        String values = myScanner.nextLine();   // ex: 12,2,4,5  ==> "12,2,4,5"
        System.out.println(values);
        String[] inputValues = values.split(",");
        for (int i = 0; i < inputValues.length; i++) {

        }
    }
}
