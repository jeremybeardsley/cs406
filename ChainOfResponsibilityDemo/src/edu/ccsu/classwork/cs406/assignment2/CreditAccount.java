package edu.ccsu.classwork.cs406.assignment2;

// TODO: Auto-generated Javadoc
/**
 * Created by Bear on 9/23/2014.
 */
public class CreditAccount extends Account {
    
    /** The cr limit. */
    protected int crLimit;

    /**
     * Instantiates a new credit account.
     *
     * @param balance the balance
     * @param name the name
     * @param limit the limit
     */
    public CreditAccount(double balance, String name, int limit) {
        super(balance, name);
crLimit = limit;
    }

    /* (non-Javadoc)
     * @see edu.ccsu.classwork.cs406.assignment2.Account#deductFees()
     */
    @Override
    public void deductFees() throws InsufficientFundsException {

        if ((balance + 30) >= crLimit) {
            throw new InsufficientFundsException();
        } else
        {
            balance += 30;
        }

    }
}
