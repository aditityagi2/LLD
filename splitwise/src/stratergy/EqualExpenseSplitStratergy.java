package stratergy;

import models.Split;

import java.util.List;

public class EqualExpenseSplitStratergy implements  ExpenseSplitStratergy{
    @Override
    public void executeSplit(double amount, List<Split> splitList) {
        if (splitList == null || splitList.isEmpty()) {
            throw new IllegalArgumentException("Split list cannot be null or empty");
        }
        double splitAmount = amount / splitList.size();
        for(Split split : splitList){
            if (split.getAmount() <= 0) {
                throw new IllegalArgumentException("Split amount must be greater than zero");
            }
            split.setAmount(splitAmount);
        }
    }
}
