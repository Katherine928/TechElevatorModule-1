package com.techelevator.calculator;

public class Calculator {

    //member (or instance variables, or properties)
    private String brand;
    private double cost;

    private final double PI = 3.14;   // final means you can't change it later
    private final String FEB = "February";

    // methods
    public int add(int a, int b) {
        return a + b;    //how
    }

    //this is an overLOADED method
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    //this is an overLOADED method
    public int add(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    //getters and/or setters


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}
