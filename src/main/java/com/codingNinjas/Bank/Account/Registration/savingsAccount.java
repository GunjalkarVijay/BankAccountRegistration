package com.codingNinjas.Bank.Account.Registration;


public class savingsAccount implements Account{
    private double amount;
    
    
    public void init() {
    	System.out.println("Savings Account has been created and I'm the init() method");
    }
    
    
    public void setBalance(double balance) {
        this.amount = balance;
    }

    @Override
    public String getAccountType() {
        return "Savings Account";
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
