package edu.ccsu.classwork.cs406.assignment2;

// TODO: Auto-generated Javadoc
/**
 * Created by Bear on 9/23/2014.
 */
public class BankAccount extends Account {
	
	/**
	 * Instantiates a new bank account.
	 *
	 * @param name the name
	 * @param balance the balance
	 */
	public BankAccount(String name, double balance) {

		super(balance, name);
	}

	/* (non-Javadoc)
	 * @see edu.ccsu.classwork.cs406.assignment2.Account#deductFees()
	 */
	@Override
	public void deductFees() throws InsufficientFundsException {
		if ((balance - 20) > 0) {
			balance -= 20;
		} else {
			throw new InsufficientFundsException();
		}
	}
}
