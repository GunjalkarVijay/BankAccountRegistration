package com.codingNinjas.Bank.Account.Registration;


public class currentAccount implements Account{

    private double amount;
    
    public void init() {
    	System.out.println("Current Account has been created and I'm the init() method");
    }

    public void setBalance(double balance) {
        this.amount = balance;
    }

    @Override
    public String getAccountType() {
        return "Current Account";
    }

    @Override
    public void addBalance(double balance) {
        this.amount += balance;
    }

    @Override
    public double getBalance() {
        return this.amount;
    }
}
