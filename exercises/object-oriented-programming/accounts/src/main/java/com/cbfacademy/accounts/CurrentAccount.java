package com.cbfacademy.accounts;

public class CurrentAccount extends Account{

    protected double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return this.overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        if (overdraftLimit >= 0) {
            this.overdraftLimit = overdraftLimit;
        }
    }

    // Override withdraw method in parent constructor "Account"
    @Override
    public double withdraw(double requested) {
        if ((getBalance() + this.overdraftLimit) < requested) {
            return 0;
        } else {
            // more secure as we do not want users
            this.balance -= requested;
            return requested;
        }
    }
}
