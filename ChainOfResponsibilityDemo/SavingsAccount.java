package edu.ccsu.classwork.cs406.ChainOfResponsibilityDemo;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Savings account which can be part of a payment chain.
 * @author cw1491
 */
public class SavingsAccount extends CheckingAccount{
    private double interestRate = 0;
    
    public SavingsAccount(double initialBalance, double interestRate){
        super(initialBalance);
        this.interestRate = interestRate;
    }
}
