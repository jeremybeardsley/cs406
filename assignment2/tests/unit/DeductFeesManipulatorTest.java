/**
 *
 */
package edu.ccsu.classwork.cs407.assignment2.tests.unit;

import edu.ccsu.classwork.cs407.assignment2.*;
import org.junit.*;

import static junit.framework.Assert.*;


/**
 * @author Jeremy Beardsley
 * @author Andrew McCoy
 */
public class DeductFeesManipulatorTest {

    private Account[] TestArrayOfAccounts;
    private DeductFeesManipulator dfm;


    @Before
    public void setUp() {
        TestArrayOfAccounts = new Account[2];
        dfm = new DeductFeesManipulator();
        TestArrayOfAccounts[0] = new BankAccount("testBankAccount", 100);
        TestArrayOfAccounts[1] = new CreditAccount(35, "testCreditAccount", 100);
    }

    @Test
    public void testDeductFees() throws InsufficientFundsException {
        System.out.println("Testing deductFees() on BankAccount and CreditAccount.");
        assertNotNull(TestArrayOfAccounts);
        assertNotNull(dfm);
        dfm.manipulateArray(TestArrayOfAccounts);
        assertEquals("testBankAccountOne Balance is 80", 80,
                TestArrayOfAccounts[0].getBalance(), 0);
        assertEquals("testCreditAccountTwo Balance is 65", 65,
                TestArrayOfAccounts[1].getBalance(), 0);
        dfm.manipulateArray(TestArrayOfAccounts);
        assertEquals("testBankAccountOne Balance is 60", 60,
                TestArrayOfAccounts[0].getBalance(), 0);
        assertEquals("testCreditAccountTwo Balance is 95", 95,
                TestArrayOfAccounts[1].getBalance(), 0);
        System.out.println("deductFees() has passed test for CreditAccount BankAccount");
    }

    @Test
    public void CreditAccountFailure() throws InsufficientFundsException {
        System.out.println("Testing Credit Account by forcing it to go Over Limit");
        try {
            TestArrayOfAccounts[1].setBalance(90);
            TestArrayOfAccounts[1].deductFees();
            fail("Exception was not thrown for balance being over credit limit");
        } catch (InsufficientFundsException ex) {
            System.out.println("Exception Caught Correctly for Credit Account Going over Limit!");
        }
    }

    @Test
    public void BankAccountFailure() throws InsufficientFundsException {
        System.out.println("Testing Bank Account by making it go under 0 balance");
        TestArrayOfAccounts[0].setBalance(10);
        assertNotNull(TestArrayOfAccounts);
        assertNotNull(dfm);
        try {
            TestArrayOfAccounts[0].deductFees();
            fail("Exception was not thrown for balance being negative");
        } catch (InsufficientFundsException e) {
            System.out.println("Exception Caught Correctly for Bank Account Balance under 0!");
        }

    }
}
