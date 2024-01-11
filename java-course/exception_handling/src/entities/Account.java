package entities;

import model.exception.DomainException;

public class Account {

    private int number;
    private String holder;
    private Double initialBalance;
    private Double withdraLimit;

    public Account(int number, String holder, Double initialBalance, Double withdraLimit) {
        this.number = number;
        this.holder = holder;
        this.initialBalance = initialBalance;
        this.withdraLimit = withdraLimit;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getInitialBalance() {
        return initialBalance;
    }

    public Double getWithdraLimit() {
        return withdraLimit;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setInitialBalance(Double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public void setWithdraLimit(Double withdraLimit) {
        this.withdraLimit = withdraLimit;
    }

    public Double withdrawOperation(double withdrawAmount) {
        withdrawAnalysis(withdrawAmount);
        return this.initialBalance -= withdrawAmount;
    }

    public void withdrawAnalysis(double withdrawAmount) {
        if(withdrawAmount > withdraLimit) {
            throw new DomainException("Withdraw error: The amount exceeds withdraw limit\n");
        } else if(withdrawAmount > initialBalance) {
            throw new DomainException("Withdraw error: Not enough balance\n");
        }
    }
}