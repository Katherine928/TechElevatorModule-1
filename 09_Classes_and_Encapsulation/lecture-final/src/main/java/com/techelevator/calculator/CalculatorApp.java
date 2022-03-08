package com.techelevator.calculator;

public class CalculatorApp {

    public static void main(String[] args) {


        Calculator calculator = new Calculator();   //create and instantiate a calculator object

        int sum = calculator.add(4,2);    //call its add method
        System.out.println(sum);

        sum = calculator.add(5,5);
        System.out.println();


        sum = calculator.add(3,4,5);




        int product = calculator.multiply(4,4);
        System.out.println(product);

        calculator.setBrand("Toshiba");
        System.out.println(calculator.getBrand());




    }
}
