package com.cbfacademy.accounts;

public class CurrentAccount extends Account {

    private double overdraftLimit;
    // constructor that accepts parameters representing the new account number, starting balance and overdraft limit
    public CurrentAccount(int accountNumber, double balance, double overdraftLimit){
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit(){
        return this.overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit){
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public  withdraw(double amount){
        if (getBalance() < 0) {
            getBalance() = requested ;
        }
    }

}
