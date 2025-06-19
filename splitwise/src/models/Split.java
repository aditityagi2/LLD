package models;

public class Split {
    User user;
    double amount;
    double percentage;

    public Split(User user, double amount) {
        this.user = user;
        this.amount = amount;
    }
    public Split( double percentage , User user) {
        this.user = user;
        this.percentage = percentage;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
