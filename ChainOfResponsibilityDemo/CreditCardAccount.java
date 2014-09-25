package edu.ccsu.classwork.cs406.ChainOfResponsibilityDemo;

/**
 * Credit card account which can be part of a payment chain.
 *
 * @author cw1491
 */
public class CreditCardAccount extends PaymentHandler {

    /**
     * Credit limit for the account
     */
    private final double CREDIT_LIMIT;
    /**
     * Amount owed
     */
    private double debt = 0;

    /**
     * Create new credit account with the specified credit limit.
     *
     * @param creditLimit Credit limit for the account
     */
    public CreditCardAccount(double creditLimit) {
        this.CREDIT_LIMIT = creditLimit;
    }
    
    /**
     * Getter for debt amount
     * @return Returns the debt on the card
     */
    public double getDebt(){
        return debt;
    }

    /**
     * Adds the specified amount to the customer's debt if above the credit
     * limit it passes the remaining balance down the chain.
     *
     * @param paymentAmount
     * @throws InsufficientFundsException
     * @throws NegativePaymentAmountException
     */
    @Override
    void processPayment(double paymentAmount) throws InsufficientFundsException {
        if ((paymentAmount + debt) < CREDIT_LIMIT) {
            debt += paymentAmount;
        } else {
            double remainingAmount = paymentAmount - (CREDIT_LIMIT - debt);
            debt = CREDIT_LIMIT;
            super.processPayment(remainingAmount);
        }
    }
}
