package models;

public class Balance {
    private double amountOwed;
    private double amountGetBack;

    public Balance(double amountOwed, double amountGetBack) {
        this.amountOwed = amountOwed;
        this.amountGetBack = amountGetBack;
    }
    public double getAmountOwed() {
        return amountOwed;
    }
    public void setAmountOwed(double amountOwed) {
        this.amountOwed = amountOwed;
    }
    public double getAmountGetBack() {
        return amountGetBack;
    }


}
