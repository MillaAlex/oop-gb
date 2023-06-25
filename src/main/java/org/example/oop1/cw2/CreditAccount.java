package org.example.oop1.cw2;

public class CreditAccount extends Account {
    private double decreasePercent;

    public CreditAccount(String owner, Integer number, Double balance, double decreasePercent) {
        super(owner, number, balance);
        this.decreasePercent = decreasePercent;
    }

    public double getDecreasePercent() {
        return decreasePercent;
    }

    public void setDecreasePercent(double decreasePercent) {
        this.decreasePercent = decreasePercent;
    }

    public void calculateInterest() {
        double result = getBalance() * decreasePercent / 100;
        withdraw(result);
    }
}
