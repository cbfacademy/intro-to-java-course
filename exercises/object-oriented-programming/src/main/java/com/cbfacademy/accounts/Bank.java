package com.cbfacademy.accounts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The Bank class represents a bank that can create and manage accounts.
 * It provides methods to open new accounts, close existing accounts,
 * and perform various banking operations.
 */
public class Bank {
    private List<Account> accounts = new ArrayList<>();
    private double interestRate;
    private double overdraftLimit;

    /**
     * Constructs a new Bank object with an empty list of accounts.
     * Use this constructor to create a new bank instance that starts with no accounts.
     * To manage accounts, use the provided methods to open or close accounts and perform other banking operations.
     *
     * @param interestRate The interest rate for savings accounts.
     * @param overdraftLimit The overdraft limit for current accounts.
     */
    public Bank(double interestRate, double overdraftLimit) {
        this.interestRate = interestRate;
        this.overdraftLimit = overdraftLimit;
    }

    /**
     * Opens a new account of the specified type and adds it to the bank's account list.
     *
     * @param balance The initial balance of the new account.
     * @param accountType The type of account to be created (e.g., "basic", "savings" or "current").
     * @return The newly created Account object.
     */
    public Account openAccount(double balance, String accountType) {
        long accountNumber = generateAccountNumber();
        Account account = null;

        switch (accountType.toLowerCase()) {
            case "":
            case "basic":
                account = new Account(accountNumber, balance);
                break;
            case "savings":
                account = new SavingsAccount(accountNumber, balance, interestRate); // You can set the interest rate as needed
                break;
            case "current":
                account = new CurrentAccount(accountNumber, balance, overdraftLimit); // You can set the overdraft limit as needed
                break;
        }

        if (account != null) {
            accounts.add(account);
            System.out.println("Account " + accountNumber + " has been opened.");
        }

        return account;
    }

    /**
     * Closes the account with the specified account number.
     * If the account is found and successfully closed, it will be removed from the bank's account list.
     *
     * @param accountNumber The account number of the account to be closed.
     */
    public void closeAccount(long accountNumber) {
        Iterator<Account> iterator = accounts.iterator();

        while (iterator.hasNext()) {
            Account account = iterator.next();

            if (account.getAccountNumber() == accountNumber) {
                iterator.remove();
                System.out.println("Account " + accountNumber + " has been closed.");
                return;
            }
        }
        System.out.println("Account " + accountNumber + " not found. No action taken.");
    }
    
    /**
     * Updates all accounts in the bank.
     * If the account is a savings account, interest will be applied.
     * If the account is a current account and currently overdrawn, a letter will be sent to the holder.
     */
    public void update() {
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).applyInterest();
            } else if (account instanceof CurrentAccount) {
                if (account.getBalance() < 0) {
                    sendOverdraftLetter(account.getAccountNumber());
                }
            }
        }
    }
    
    /**
     * Pays a dividend into all accounts in the bank.
     *
     * @param dividend The dividend value.
     */
    public void payDividend(double dividend) {
        for (Account account : accounts) {
            account.deposit(dividend);
        }
    }

    /**
     * Sends an overdraft warning letter to the holder of the specified account number.
     *
     * @param accountNumber The account number of the account to be notified.
     */
    private void sendOverdraftLetter(long accountId) {
        System.out.println("Overdraft letter sent to holder of account no.: " + accountId);
    }

    /**
     * Generate an account number for a new account.
     * Creates an eight-digit account number and increments by 1 for every new account
     * 
     * @return A unique account number
     */
    private long generateAccountNumber(){
        // Finding the maximum accountNumber using a loop
        long maxAccountNumber = 10000000L;

        for (Account account : accounts) {
            long currentAccountNumber = account.getAccountNumber();
            if (currentAccountNumber > maxAccountNumber) {
                maxAccountNumber = currentAccountNumber;
            }
        }

        return maxAccountNumber + 1;
    }
}
