package edu.ccsu.classwork.cs406.assignment2;

/**
 * Created by Bear on 9/23/2014.
 */
public abstract class Account {
	protected double balance;
	protected String name;

	public abstract void deductFees() throws InsufficientFundsException;

	public Account(double bal, String lname) {
		balance = bal;
		name = lname;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance
	 *            the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
