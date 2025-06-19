package factory;

import jdk.jfr.Percentage;
import models.ExpenseSplitType;
import stratergy.EqualExpenseSplitStratergy;
import stratergy.ExpenseSplitStratergy;
import stratergy.PercentageExpenseSplitStratergy;
import stratergy.UnequalExpenseSplitStratergy;

import static constants.expense.ExceptionConstants.INVALID_SPLIT_TYPE;
import static models.ExpenseSplitType.*;


public class ExpenseSplitFactory {
    public ExpenseSplitStratergy getExpenseSplitStratergy(ExpenseSplitType type){
        if(type == null) {
            return null;
        }
        if(type == (PERCENTAGE)){
            return new PercentageExpenseSplitStratergy();
        }else if(type == (EQUAL)){
            return new EqualExpenseSplitStratergy();
        } else if (type == (UNEQUAL)) {
            return new UnequalExpenseSplitStratergy();
        }else {
            throw new IllegalArgumentException(INVALID_SPLIT_TYPE + type);
        }
    }

}
