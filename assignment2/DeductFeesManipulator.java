package edu.ccsu.classwork.cs407.assignment2;

/**
 * Deduct Fees Manipulator that is a subtype of ArrayManipulator
 *
 * @author Jeremy Beardsley
 * @author Andrew McCoy
 */
public class DeductFeesManipulator implements ArrayManipulator {

    /**
     * This method accepts an array of Accounts, and attempts to process fee deduction on Accounts.
     * If an InsufficientFundsException is thrown, it is caught here and handled.
     *
     * @param accounts an array of Accounts
     */
    @Override
    public void manipulateArray(Account[] accounts) {
        for (Account current : accounts) {
            try {
                current.deductFees();
                System.out.println(current.getName() + "'s balance is: "
                        + current.getBalance());
            } catch (InsufficientFundsException ex) {
                System.out.println(current.getName()
                        + "'s account has Insufficient Funds!");
            }

        }

    }
}
