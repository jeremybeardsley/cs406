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

}
