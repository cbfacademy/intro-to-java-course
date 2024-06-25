package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    protected double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return this.overdraftLimit;
    }

    public void setOverdraftLimit(double newOverdraftLimit) {
        if (newOverdraftLimit >= 0) {
            this.overdraftLimit = newOverdraftLimit;
        }
    }

    @Override
    public double withdraw(double requested) {
        double grant = 0;
        if ((this.balance + this.overdraftLimit) >= requested) {
            grant = Math.abs(requested);
            balance -= grant;
        }

        return grant;
    }

}
