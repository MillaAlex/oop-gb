package org.example.oop1.cw2;

public class SaveAccount extends Account {
    private double percent;
    public SaveAccount(String owner, Integer number, Double balance, double percent) {
        super(owner, number, balance);
        this.percent = percent;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public void addInterest() {
        double result = getBalance() * this.percent / 100;
        deposit(result);
    }

    @Override
    public String toString() {
        return "SaveAccount{" +
                "percent=" + percent +
                '}';
    }
}
