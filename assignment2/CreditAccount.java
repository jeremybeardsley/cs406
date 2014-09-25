package edu.ccsu.classwork.cs406.assignment2;

/**
 * Created by Bear on 9/23/2014.
 */
public class CreditAccount extends Account {
    protected int crLimit;

    public CreditAccount(double balance, String name, int limit) {
        super(balance, name);
crLimit = limit;
    }

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
