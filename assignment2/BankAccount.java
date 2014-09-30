package edu.ccsu.classwork.cs407.assignment2;

/**
 * Bank Account that is a subtype of Account
 *
 * @author Jeremy Beardsley
 * @author Andrew McCoy
 */
public class BankAccount extends Account {
    /** The balance. */

    /**
     * Creates Bank Account with specified name and Balance
     *
     * @param name    the name used for Bank Account
     * @param balance the balance of the Bank Account
     */
    public BankAccount(String name, double balance) {
        super(balance, name);

    }

    /**
     * Checks if a deduction would cause negative balance and deducts if possible
     *
     * @throws InsufficientFundsException if deductFees would cause a negative Balance
     */
    @Override
    public void deductFees() throws InsufficientFundsException {
        if ((getBalance() - 20) >= 0) {
            setBalance(getBalance() - 20);
        } else {
            throw new InsufficientFundsException();
        }
    }
}
