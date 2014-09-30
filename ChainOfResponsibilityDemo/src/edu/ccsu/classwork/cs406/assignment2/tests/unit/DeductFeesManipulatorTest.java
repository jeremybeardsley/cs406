/**
 * 
 */
package edu.ccsu.classwork.cs406.assignment2.tests.unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import edu.ccsu.classwork.cs406.assignment2.Account;
import edu.ccsu.classwork.cs406.assignment2.BankAccount;
import edu.ccsu.classwork.cs406.assignment2.CreditAccount;
import edu.ccsu.classwork.cs406.assignment2.DeductFeesManipulator;
import edu.ccsu.classwork.cs406.assignment2.InsufficientFundsException;

/**
 * @author andrew & jeremy @ *
 */
public class DeductFeesManipulatorTest {

	private Account[] TestArrayOfAccounts;
	private DeductFeesManipulator dfm;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() {
		System.out.println("[DEBUG] Entering setUp() in @Before");

		TestArrayOfAccounts = new Account[2];
		dfm = new DeductFeesManipulator();
		TestArrayOfAccounts[0] = new BankAccount("testBankAccount", 100);
		TestArrayOfAccounts[1] = new CreditAccount(35, "testCreditAccount", 100);

		System.out.println("[DEBUG] Leaving setUp() in @Before");
	}

	@Test
	public void AllAccountsHappy() {
		System.out.println("[DEBUG] Entering AllFourAccountsHappy Test");
		assertNotNull(TestArrayOfAccounts);
		assertNotNull(dfm);
		dfm.manipulateArray(TestArrayOfAccounts);

		assertEquals("testBankAccountOne Balance is 80", 80,
				TestArrayOfAccounts[0].getBalance(), 0);
		assertEquals("testCreditAccountTwo Balance is 65", 65,
				TestArrayOfAccounts[1].getBalance(), 0);

		System.out.println("[DEBUG] Leaving AllFourAccountsHappy Test");
	}

	@Test(expected = InsufficientFundsException.class)
	public void CreditAccountFailure() {
		System.out.println("[DEBUG] Entering CreditAccountFailure");
		TestArrayOfAccounts[1].setBalance(95);
		assertNotNull(TestArrayOfAccounts);
		assertNotNull(dfm);
		dfm.manipulateArray(TestArrayOfAccounts);
		assertEquals("OverLimit and Balance is now 125!",
				TestArrayOfAccounts[1].getBalance(), 125, 0);
		System.out.println("[DEBUG] Leaving CreditAccountFailure");
	}

	@Test(expected = InsufficientFundsException.class)
	public void BankAccountFailure() {
		System.out.println("[DEBUG] Entering BankAccountFailure");
		TestArrayOfAccounts[0].setBalance(10);
		assertNotNull(TestArrayOfAccounts);
		assertNotNull(dfm);
		dfm.manipulateArray(TestArrayOfAccounts);
		assertEquals("Balance isn't Negative as expected",
				TestArrayOfAccounts[0].getBalance(), -10, 0);
		System.out.println("[DEBUG] Leaving BankAccountFailure");
	}
}
