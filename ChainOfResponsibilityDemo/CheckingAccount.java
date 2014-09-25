package edu.ccsu.classwork.cs406.ChainOfResponsibilityDemo;

/**
 * Checking account which can be part of a payment chain.
 *
 * @author cw1491
 */
public class CheckingAccount extends PaymentHandler {
    private String accountName;
    private double balance = 0;

    /**
     * Constructs a checking account with the specified balance.
     *
     * @param initialBalance Initial balance of the account
     */
    public CheckingAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    /**
     * Getter for balance
     * @return Returns the balance in the account
     */
    public double getBalance(){
        return balance;
    }

    /**
     * Deducts the amount from the balance and attempts to have any remaining
     * balance processed by the payment chain.
     *
     * @param paymentAmount
     * @throws InsufficientFundsException
     */
    @Override
    void processPayment(double paymentAmount) throws InsufficientFundsException{
        if (balance >= paymentAmount) {
            balance -= paymentAmount;
        } else {
            double remainingAmount = paymentAmount - balance;
            balance = 0;
            super.processPayment(paymentAmount); 
        }
    }
}
