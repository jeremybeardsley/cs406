package edu.ccsu.classwork.cs406.assignment2;

/**
 * Created by Bear on 9/23/2014.
 */
public class BankAccount extends Account {
    public BankAccount(String name, double balance) {

        super(balance, name);
    }

    @Override
    public void deductFees() throws InsufficientFundsException
    {
        if ((balance - 20) > 0) {
            balance -= 20;
        } else {
            throw new InsufficientFundsException();
        }
    }
}
