package com.techelevator.jgbankwithconstructor;

public class Account {

    //member variables
    private double accountBalance = 0;
    private String accountNumber;
    private String accountType;

    //create a custom constructor

    public Account  (String accountNumber, String accountType, double accountBalance) {

        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public Account () {

    }


    public Account (String accountType, String accountNumber) {
        this.accountType = accountType;
        this.accountNumber = accountNumber;
    }


    //methods

    public double deposit(double amountToDeposit) {

        this.accountBalance = this.accountBalance + amountToDeposit;
        return this.accountBalance;
    }

    public double withdraw(double amountToWithdraw) {

        //TODO: Come back later to check if there is an available balance..
        this.accountBalance = this.accountBalance - amountToWithdraw;
        return this.accountBalance;

    }


    //getters and setters
    public double getAccountBalance() {
        return accountBalance;
    }


    public String getAccountNumber() {
        return accountNumber;
    }


    public String getAccountType() {
        return accountType;
    }


}