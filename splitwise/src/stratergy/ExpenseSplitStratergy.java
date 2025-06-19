package stratergy;

import models.Split;

import java.util.List;

public interface ExpenseSplitStratergy {
    public void executeSplit( double amount, List<Split> splitList);

}
