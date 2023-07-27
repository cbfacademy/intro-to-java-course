package com.cbfacademy.accounts;

/**
 * The SavingsAccount class represents a bank savings account, which is a specific type of Account.
 * It extends the Account class to support interest being applied to the balance.
 */
public class SavingsAccount extends Account {

    protected double interestRate;

    /**
     * Constructs a new SavingsAccount object with the specified account number, initial balance,
     * and the interest rate for the savings account.
     *
     * @param accountNumber The account number to be assigned to the new savings account.
     * @param balance The initial balance of the new savings account.
     * @param interestRate The interest rate associated with the savings account, represented as a decimal value.
     *                     For example, an interest rate of 0.05 represents 5% interest.
     */
    public SavingsAccount(long accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    /**
     * Retrieves the interest rate associated with this savings account.
     *
     * @return The interest rate as a decimal value.
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Applies interest to the savings account based on its current balance and interest rate.
     * The interest is calculated and deposited into the savings account balance.
     * For example, if the interest rate is 0.05 (5%), £100 balance would receive £5 in interest.
     */
    public void applyInterest() {
        deposit(balance * interestRate);
    }
}
