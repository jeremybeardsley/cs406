package edu.ccsu.classwork.cs406.assignment2;


/**
 * Created by Bear on 9/23/2014.
 */
public class DeductFeesManipulator implements ArrayManipulator {
    @Override
    public void manipulateArray(Account[] accounts) {
        for (Account current : accounts) {
            try {
                current.deductFees();
                System.out.println(current.name+"'s balance is: " +current.balance);
            } catch (InsufficientFundsException ex) {
               System.out.println(current.name+"'s account has Insufficient Funds!");
            }

        }


    }
}
