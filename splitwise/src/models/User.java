package models;

public class User {
    private long userId ;
    private String name ;
    UserExpenseBalanceSheet userExpenseBalanceSheet;
    public User(long userId, String name) {
        this.userId = userId;
        this.name = name;
        this.userExpenseBalanceSheet = new UserExpenseBalanceSheet();
    }
    public long getUserId() {
        return userId;
    }

    public UserExpenseBalanceSheet getUserExpenseBalanceSheet() {
        return userExpenseBalanceSheet;
    }
}
