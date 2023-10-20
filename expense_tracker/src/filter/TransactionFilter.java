package filter;

import model.Transaction;

import java.util.List;

/**
 * A simple interface to define the signature of filter method.
 */
public interface TransactionFilter {
    List<Integer> filter(List<Transaction> inputList);

}
