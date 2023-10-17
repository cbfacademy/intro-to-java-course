package com.cbfacademy.accounts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("SavingsAccount Tests")
public class SavingsAccountTest {

    private SavingsAccount savingsAccount;
    private int accountNumber = 12345;
    private double defaultBalance = 1000d;
    private double defaultInterestRate = 0.05d; // 5%
    private double delta = 0.001;

    @BeforeEach
    void setUp() {
        savingsAccount = new SavingsAccount(accountNumber, defaultBalance, defaultInterestRate);
    }

    @Test
    @DisplayName("getInterestRate() method returns current interest rate")
    public void getInterestRate_ReturnsCurrentInterestRate() {
        double currentInterestRate = savingsAccount.getInterestRate();

        assertEquals(this.defaultInterestRate, currentInterestRate, delta);
    }

    @Test
    @DisplayName("setInterestRate() method sets account interest rate")
    public void setInterestRate_SetsAccountInterestRate() {
        double newInterestRate = 0.06d;

        savingsAccount.setInterestRate(newInterestRate);

        double currentInterestRate = savingsAccount.getInterestRate();

        assertEquals(newInterestRate, currentInterestRate, delta);
    }

    @Test
    @DisplayName("setInterestRate() method leaves account interest rate for negative value")
    public void setInterestRate_LeavesAccountInterestRateForNegativeValue() {
        savingsAccount.setInterestRate(-0.06d);

        double currentInterestRate = savingsAccount.getInterestRate();

        assertEquals(defaultInterestRate, currentInterestRate, delta);
    }

    @Test
    @DisplayName("applyInterest() method applies current interest to balance")
    public void applyInterest_AppliesCurrentInterest() {
        savingsAccount.applyInterest();

        double expected = defaultBalance + (defaultBalance * defaultInterestRate);
        double currentBalance = savingsAccount.getBalance();

        assertEquals(expected, currentBalance, delta);
    }
}
