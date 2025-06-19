package models;

import manager.ExpenseManager;

import java.util.List;

public class Group {
    long groupId;
    String groupName;
    List<User> groupMembers;
    
    List<Expense> expenses;
    
    ExpenseManager expenseManager;
    public Group() {
        // Default constructor
    }
    
    public Group(long groupId, String groupName, List<User> groupMembers, List<Expense> expenses, ExpenseManager expenseManager) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.groupMembers = groupMembers;
        this.expenses = expenses;
        this.expenseManager = expenseManager;
    }
    public void addMember(User user) {
        if (user != null && !groupMembers.contains(user)) {
            groupMembers.add(user);
        }
    }
    public void removeMember(User user) {
        if (user != null && groupMembers.contains(user)) {
            groupMembers.remove(user);
        }
    }
    public long getGroupId() {
        return groupId;
    }
    public String getGroupName() {
        return groupName;
    }
    public List<User> getGroupMembers() {
        return groupMembers;
    }
    public List<Expense> getExpenses() {
        return expenses;
    }
    public ExpenseManager getExpenseManager() {
        return expenseManager;
    }
    public Expense createExpense(String description, double amount, String date, User paidBy, List<Split> splitList) {
        Expense expense = expenseManager.addExpense(description, amount, date, paidBy, splitList);
        if (expense != null) {
            expenses.add(expense);
        }
        return expense;
    }

    public void setGroupId(long groupId) {
    }
}
