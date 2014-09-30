package edu.ccsu.classwork.cs406.assignment2;

// TODO: Auto-generated Javadoc
/**
 * Created by Bear on 9/23/2014.
 */
public abstract class Account {

	/** The balance. */
	protected double balance;

	/** The name. */
	protected String name;

	/**
	 * Deduct fees.
	 *
	 * @throws InsufficientFundsException
	 *             the insufficient funds exception
	 */
	public abstract void deductFees() throws InsufficientFundsException;

	/**
	 * Instantiates a new account.
	 *
	 * @param bal
	 *            the bal
	 * @param lname
	 *            the lname
	 */
	public Account(double bal, String lname) {
		balance = bal;
		name = lname;
	}

	/**
	 * Gets the balance.
	 *
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Sets the balance.
	 *
	 * @param balance
	 *            the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
