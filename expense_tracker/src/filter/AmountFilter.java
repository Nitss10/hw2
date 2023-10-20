package filter;

import model.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to filter transactions based on amount specified.
 */
public class AmountFilter implements TransactionFilter{

    private Double amount;

    public AmountFilter(double amount){
      this.amount = amount;
    }
    /**
     * Filters out the list on the basis of amount
     * @param inputList is a list of Transactions
     * @return filtered list of Transactions indices
     */
    public List<Integer> filter(List<Transaction> inputList){
        List<Integer> filteredList = new ArrayList<>();
        for(int i= 0; i< inputList.size();i++)
        {
            if(inputList.get(i).getAmount()== this.amount)
            {
                filteredList.add(i);
            }
        }
        return filteredList;
    }

}
