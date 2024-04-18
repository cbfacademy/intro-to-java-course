package com.cbfacademy.accounts;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Account Tests")
public class AccountTest {

    @Test
    @DisplayName("deposit() method returns updated balance")
    public void deposit_ReturnsUpdatedBalance() {
        Account account = new Account(12345, 100.0);

        double newBalance = account.deposit(50.0);

        assertEquals(150.0, newBalance, 0.01);
    }

    @Test
    @DisplayName("withdraw() method returns requested amount with sufficient balance")
    public void withdraw_ReturnsRequestedAmountWithSufficientBalance() {
        Account account = new Account(12345, 100.0);

        double withdrawnAmount = account.withdraw(50.0);

        assertEquals(50.0, withdrawnAmount, 0.01);
        assertEquals(50.0, account.getBalance(), 0.01);
    }

    @Test
    @DisplayName("withdraw() method returns zero with insufficient balance")
    public void withdrawReturnsZeroWithInsufficientBalance() {
        Account account = new Account(12345, 50.0);

        double withdrawnAmount = account.withdraw(100.0);

        assertEquals(0.0, withdrawnAmount, 0.01);
        assertEquals(50.0, account.getBalance(), 0.01);
    }

    @Test
    @DisplayName("withdraw() method returns zero for a negative requested amount")
    public void withdrawReturnsZeroForNegativeRequestedAmount() {
        Account account = new Account(12345, 50.0);

        double withdrawnAmount = account.withdraw(-10.0);

        assertEquals(0.0, withdrawnAmount, 0.01);
        assertEquals(50.0, account.getBalance(), 0.01);
    }

    @Test
    @DisplayName("getAccountNumber() method returns account number")
    public void getAccountNumber_ReturnsAccountNumber() {
        Account account = new Account(12345, 100.0);

        int accountNumber = account.getAccountNumber();

        assertEquals(12345, accountNumber);
    }

    @Test
    @DisplayName("getBalance() method returns balance")
    public void getBalance_ReturnsBalance() {
        Account account = new Account(12345, 100.0);

        double balance = account.getBalance();

        assertEquals(100.0, balance, 0.01);
    }

    @Test
    @DisplayName("toString() method returns string representation")
    public void toString_ReturnsStringRepresentation() {
        Account account = new Account(12345, 100.0);

        String accountString = account.toString();

        assertThat(accountString, containsString("Account no: 12345"));
        assertThat(accountString, containsString("Balance: £100.00"));
    }
}

