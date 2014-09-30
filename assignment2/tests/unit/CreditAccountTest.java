package edu.ccsu.classwork.cs407.assignment2.tests.unit;

import edu.ccsu.classwork.cs407.assignment2.CreditAccount;
import edu.ccsu.classwork.cs407.assignment2.InsufficientFundsException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Jeremy Beardsley
 * @author Andrew McCoy
 */
public class CreditAccountTest {

    /**
     *
     * @throws InsufficientFundsException if Credit Account would go over the Credit Limit
     */
	@Before
	public void setUp() throws InsufficientFundsException {
	}

	@Test(expected = InsufficientFundsException.class)
	public void TestOverLimitWithCreditAccounts()
			throws InsufficientFundsException {
		CreditAccount testCreditActNegative1 = new CreditAccount(90,
				"testCreditActNegative1", 100);
		System.out
				.println("Running Test: TestNegativeBalancesInCreditAccounts");
		assertNotNull(testCreditActNegative1);
		testCreditActNegative1.deductFees();

	}

	@Test
	public void TestPositiveBalancesInCreditAccounts()
			throws InsufficientFundsException {

		CreditAccount testCreditActPositive1 = new CreditAccount(50,
				"testCreditActPositive1", 100);
		System.out
				.println("Running Test: TestPositiveBalancesInCreditAccounts");
		testCreditActPositive1.deductFees();
		assertNotNull(testCreditActPositive1);
		assertEquals("Balance must be 80", 80,
				testCreditActPositive1.getBalance(), 0);

	}
}
