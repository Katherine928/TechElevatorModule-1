package com.techelevator;

import java.util.Scanner;

public class SimpsonsVacation {
    public static void main(String[] args) {
        // Create and initialize a scanner to read from the console (keyboard)
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Are we there yet? Enter (Y) or (N):");
            String answer = myScanner.nextLine();
            System.out.println("Your answer with: " + answer);

            if (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("Y")) {
                System.out.println("Cowabunga!");
                break;

            } else {
                System.out.println("Eat my shorts!");
            }
        }
    }
}
