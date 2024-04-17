package com.cbfacademy.accounts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("CurrentAccount Tests")
public class CurrentAccountTest {

    private CurrentAccount currentAccount;
    private int accountNumber = 12345;
    private double defaultBalance = 1000d;
    private double defaultOverdraftLimit = 500d;
    private double delta = 0.01;

    @BeforeEach
    void setUp() {
        currentAccount = new CurrentAccount(accountNumber, defaultBalance, defaultOverdraftLimit);
    }

    @Test
    @DisplayName("withdraw() method withdraws requested amount within balance")
    public void withdraw_WithdrawsRequestedAmountWithinBalance() {
        double withdrawnAmount = currentAccount.withdraw(500.0);
        double expectedBalance = 500.0;

        assertEquals(500.0, withdrawnAmount, delta);
        assertEquals(expectedBalance, currentAccount.getBalance(), delta);
    }

    @Test
    @DisplayName("withdraw() method withdraws requested amount within overdraft")
    public void withdraw_WithdrawsRequestedAmountWithinOverdraft() {
        double withdrawnAmount = currentAccount.withdraw(1500.0);
        double expectedBalance = -500.0;

        assertEquals(1500.0, withdrawnAmount, delta);
        assertEquals(expectedBalance, currentAccount.getBalance(), delta);
    }

    @Test
    @DisplayName("withdraw() method ignores requested amount exceeding overdraft")
    public void withdraw_IgnoresRequestedAmountExceedingOverdraft() {
        double withdrawnAmount = currentAccount.withdraw(2500.0);

        assertEquals(0.0, withdrawnAmount, delta);
        assertEquals(defaultBalance, currentAccount.getBalance(), delta);
    }

    @Test
    @DisplayName("getOverdraftLimit() method returns current limit")
    public void getOverdraftLimit_ReturnsCurrentLimit() {
        double currentOverdraftLimit = currentAccount.getOverdraftLimit();

        assertEquals(defaultOverdraftLimit, currentOverdraftLimit, delta);
    }

    @Test
    @DisplayName("setOverdraftLimit() method sets current limit")
    public void setOverdraftLimit_SetsCurrentLimit() {
        double expectedOverdraftLimit = 1000d;

        currentAccount.setOverdraftLimit(expectedOverdraftLimit);

        double currentOverdraftLimit = currentAccount.getOverdraftLimit();

        assertEquals(expectedOverdraftLimit, currentOverdraftLimit, delta);
    }
}
