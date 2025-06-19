package models;

import java.util.ArrayList;
import java.util.List;

public class Expense {
    
    long expenseId;
    String description;
    double amount;
    User paidBy;
    String date;
    ExpenseSplitType splitType;
    List<Split> splits = new ArrayList<>();
    public static long idCounter = 0;
    
    public Expense(String description, double amount, User paidBy, String date, ExpenseSplitType splitType ,List<Split> splits) {
        this.expenseId = idCounter++;
        this.description = description;
        this.amount = amount;
        this.paidBy = paidBy;
        this.date = date;
        this.splitType = splitType;
        this.splits = splits;
    }



    public double getAmount() {
        return amount;
    }

    public long getExpenseId() {
        return expenseId;
    }

    public String getDescription() {
        return description;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public String getDate() {
        return date;
    }

    public ExpenseSplitType getSplitType() {
        return splitType;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public static long getIdCounter() {
        return idCounter;
    }
}
