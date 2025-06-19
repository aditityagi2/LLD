package manager;

import factory.ExpenseSplitFactory;
import models.Expense;
import models.Split;
import models.User;
import stratergy.ExpenseSplitStratergy;

import java.util.List;


import static models.ExpenseSplitType.EQUAL;

public class EqualExpenseSplitManager implements  ExpenseManager{

    private ExpenseSplitStratergy expenseSplitStratergy ;
    private ExpenseSplitFactory expenseSplitFactory = new ExpenseSplitFactory();
    private BalanceSheetManager balanceSheetManager = new BalanceSheetManager();

    @Override
    public Expense addExpense(String description, double amount, String date, User paidBy, List<Split> splitList) {
        // Validate the input parameters
        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("Description cannot be null or empty");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        if (date == null || date.isEmpty()) {
            throw new IllegalArgumentException("Date cannot be null or empty");
        }
        if (paidBy == null) {
            throw new IllegalArgumentException("PaidBy user cannot be null");
        }
        if (splitList == null || splitList.isEmpty()) {
            throw new IllegalArgumentException("Split list cannot be null or empty");
        }

        // Create a new expense with equal splits
        // Assuming Expense class has a constructor that takes these parameters
        expenseSplitStratergy = expenseSplitFactory.getExpenseSplitStratergy(EQUAL);
        expenseSplitStratergy.executeSplit(amount , splitList);
        Expense expense = new Expense(description,amount, paidBy, date, EQUAL , splitList);
        balanceSheetManager.updateUserBalanceSheet(paidBy , splitList , amount);

        return expense;
        // Logic to save the expense to the database or in-memory storage
        // This part is not implemented here as it depends on the specific application context
    }
}
