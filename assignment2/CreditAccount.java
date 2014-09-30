package edu.ccsu.classwork.cs407.assignment2;

/**
 * Credit Account that is a subtype of Account
 *
 * @author Jeremy Beardsley
 * @author Andrew McCoy
 */
public class CreditAccount extends Account {
    
    /** The credit limit. */
    protected int crLimit;

    /**
     * Instantiates a new credit account with specified Balance, Name, and Credit Limit
     *
     * @param balance The balance
     * @param name The name
     * @param limit The limit
     */
    public CreditAccount(double balance, String name, int limit) {
        super(balance, name);
crLimit = limit;
    }

    /**
     * Checks to see if new fees would send the Account over Credit Limit
     *
     * @throws InsufficientFundsException if deductFees would cause the balance to go over the limit
     */
    @Override
    public void deductFees() throws InsufficientFundsException {

        if ((getBalance() + 30) >= crLimit) {
            throw new InsufficientFundsException();
        } else
        {
            setBalance(getBalance() + 30);
        }

    }
}
