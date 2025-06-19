package models;

import java.util.Map;

public class UserExpenseBalanceSheet {
    Map<String , Balance> userVsBalance ;
    double totalYourExpense;
    double totalPayment;
    double totalYouOwed;
    double totalYouGetBack;

    public Map<String, Balance> getUserVsBalance() {
        return userVsBalance;
    }

    public void setUserVsBalance(Map<String, Balance> userVsBalance) {
        this.userVsBalance = userVsBalance;
    }

    public double getTotalYourExpense() {
        return totalYourExpense;
    }

    public void setTotalYourExpense(double totalYourExpense) {
        this.totalYourExpense = totalYourExpense;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public double getTotalYouOwed() {
        return totalYouOwed;
    }

    public void setTotalYouOwed(double totalYouOwed) {
        this.totalYouOwed = totalYouOwed;
    }

    public double getTotalYouGetBack() {
        return totalYouGetBack;
    }

    public void setTotalYouGetBack(double totalYouGetBack) {
        this.totalYouGetBack = totalYouGetBack;
    }
}
