package edu.ccsu.classwork.cs406.assignment2;

/**
 * Created by Bear on 9/23/2014.
 */
public class Main {

    public static void main(String[] args) {
        Account[] acc = new Account[3];
        DeductFeesManipulator dfm = new DeductFeesManipulator();
        acc[0] = new BankAccount("Jeremy", 50);
        acc[1] = new CreditAccount(100, "Susan", 300);
        acc[2] = new CreditAccount(280, "Steve", 300);
        dfm.manipulateArray(acc);
    }
}