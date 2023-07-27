package com.cbfacademy.accounts;

/**
 * The CurrentAccount class represents a bank current account, which is a specific type of Account.
 * It extends the Account class to support an overdraft facility.
 */
public class CurrentAccount extends Account {
    private double overdraftLimit;

    /**
     * Constructs a new CurrentAccount object with the specified account number, initial balance,
     * and overdraft limit for the current account.
     *
     * @param accountNumber The account number to be assigned to the new current account.
     * @param balance The initial balance of the new current account.
     * @param overdraftLimit The overdraft limit associated with the current account.
     *                       This represents the maximum negative balance allowed for the account.
     */
    public CurrentAccount(long accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    /**
     * Withdraws the requested amount from the current account if a sufficient balance (including overdraft limit) is available.
     * If the requested amount exceeds the available funds, the withdrawal will not be granted.
     * The account balance will be updated accordingly after the withdrawal.
     *
     * @param requested The amount to be withdrawn. A positive value is expected.
     * @return The amount actually withdrawn from the account. If the withdrawal is successful,
     *         the returned value will be equal to the requested amount. Otherwise, it will be 0.
     */
    @Override
    public double withdraw(double requested) {
        double granted = 0;

        requested = Math.abs(requested);

        if (balance + overdraftLimit >= requested) {
            balance -= requested;
            granted = requested;
        }

        return granted;
    }

    /**
     * Returns a string representation of the CurrentAccount object.
     * The method displays the account number, balance, and a sign to indicate whether the balance is positive or negative.
     *
     * @return A formatted string displaying the account number, balance, and a sign (e.g., "£1000" or "-£500").
     */
    @Override
    public String toString() {
        String sign = balance < 0 ? "-£" : "£";

        return "Account no: " + accountNumber + ". Balance: " + sign + String.format("%.2f", Math.abs(balance));
    }
}
