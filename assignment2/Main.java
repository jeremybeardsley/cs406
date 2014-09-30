package edu.ccsu.classwork.cs407.assignment2;

/**
 * This is where new actual accounts would be initialized
 * Contains some dummy test data.
 * @author Jeremy Beardsley
 * @author Andrew McCoy
 */
public class Main {

	/**
	 *
	 * @param args the arguments for the main method
	 */
	public static void main(String[] args) {
		Account[] acc = new Account[3];
		DeductFeesManipulator dfm = new DeductFeesManipulator();
		acc[0] = new BankAccount("Jeremy", 50);
		acc[1] = new CreditAccount(100, "Susan", 300);
		acc[2] = new CreditAccount(280, "Steve", 300);
		dfm.manipulateArray(acc);
	}
}