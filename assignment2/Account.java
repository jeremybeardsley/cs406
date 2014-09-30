package edu.ccsu.classwork.cs407.assignment2;
/**
 * This is the base class for All Accounts
 * @author Jeremy Beardsley
 * @author Andrew McCoy
 *
 *
 */
public abstract class Account {

	/** The balance. */
	private double balance;

	/** The name. */
	private String name;



    /**
	 * This is the base DeductFees method
	 *
	 * @throws InsufficientFundsException if there are errors within the DeductFees Method, this exception is thrown
	 *
	 */
	public abstract void deductFees() throws InsufficientFundsException;

	/**
	 * Creates a new account with set balance and name.
	 *
	 * @param bal the Balance
	 * @param lname the Name
	 */
	public Account(double bal, String lname) {
		this.balance = bal;
		this.name = lname;
	}

	/**
	 * Getter for balance.
     * Primarily used by Test Classes
	 *
	 * @return the balance
	 */
	public double getBalance() {
		return this.balance;
	}

	/**
	 * Setter for the balance.
	 * Primarily used by Test Classes
     *
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * Getter for the name.
	 * Primarily used by Test Classes
	 *
     * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Setter for the name.
	 * Primarily used by Test Classes
     *
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
