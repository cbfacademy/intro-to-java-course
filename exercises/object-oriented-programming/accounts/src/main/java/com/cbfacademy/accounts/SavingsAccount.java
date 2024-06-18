package com.cbfacademy.accounts;

public class SavingsAccount extends Account {

  private double interestRate;

  public SavingsAccount(int accountNumber, double balance, double interestRate) {
    super(accountNumber, balance);
    this.interestRate = interestRate;
  }

 

  public void applyInterest() {
    deposit(getBalance() * interestRate);
  }

  public double getInterestRate() {
    return this.interestRate;
  }

  public void setInterestRate(double interestRate) {
    if (interestRate >= 0) {
      this.interestRate = interestRate;
    }
  }
}
