/**
 * 
 */
package edu.ccsu.classwork.cs407.assignment2.tests.unit;

import edu.ccsu.classwork.cs407.assignment2.BankAccount;
import edu.ccsu.classwork.cs407.assignment2.InsufficientFundsException;
import org.junit.*;
import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;


/**
 * @author Jeremy Beardsley
 * @author Andrew McCoy
 */
public class BankAccountTest {

	/**
	 * @throws edu.ccsu.classwork.cs407.assignment2.InsufficientFundsException if Bank Account would go below 0
	 */
	// @Before
	@BeforeClass
	public static void beforeClass() throws InsufficientFundsException{
		System.out.println("@BeforeClass");

		// TODO I couldn't get the @Before & @BeforeClass to work so I did each
		// one insdie of the individual tests

		// BankAccount testBankActPositive1 = new BankAccount(
		// "testBankActPositive1", 50);
		// BankAccount testBankActNegative1 = new BankAccount(
		// "testBankActNegative1", -50);
		// BankAccount testCreditActPositive1 = new BankAccount(
		// "testCreditActPositive1", 50);
		// BankAccount testCreditActNegative1 = new BankAccount(
		// "testCreditActNegative1", -50);

	}

	@Test(expected = InsufficientFundsException.class)
	public void TestNegativeBalancesInBankAccountsToStart()
			throws InsufficientFundsException {
		BankAccount testBankActNegative1 = new BankAccount(
				"testBankActNegative1", -50);
		System.out.println("Running Test: TestNegativeBalancesInBankAccounts");
		testBankActNegative1.deductFees();
	}

	@Test(expected = InsufficientFundsException.class)
	public void TestNegativeBalancesInBankAccountAfterDeduct()
			throws InsufficientFundsException {
		BankAccount testBankActNegative1 = new BankAccount(
				"testBankActNegative1", 5);
		System.out.println("Running Test: TestNegativeBalancesInBankAccounts");
		testBankActNegative1.deductFees();

	}

	@Test
	public void TestPositiveBalancesInBankAccounts() {
		BankAccount testBankActPositive1 = new BankAccount(
				"testBankActPositive1", 50);
		System.out.println("Running Test: TestPositiveBalancesInBankAccounts");
		try {
			testBankActPositive1.deductFees();
		} catch (InsufficientFundsException e) {
			System.out.println("Test Failed");
			org.junit.Assert.fail();
			e.printStackTrace();
		}
		assertNotNull(testBankActPositive1);
		assertEquals("Balance Must be $30", 30,
				testBankActPositive1.getBalance(), 0);

	}

}
