package com.techelevator.jgbank;

public class Account {



    //member variables
    private double accountBalance = 0;
    private String accountNumber;
    private String accountType;


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

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
