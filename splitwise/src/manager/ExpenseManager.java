package manager;

import models.Expense;
import models.Split;
import models.User;

import java.util.List;

public interface ExpenseManager {
    public Expense addExpense(String description, double amount, String date, User paidBy , List<Split> splitList);
}
