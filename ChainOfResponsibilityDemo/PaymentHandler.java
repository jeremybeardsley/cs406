package edu.ccsu.classwork.cs406.ChainOfResponsibilityDemo;

/**
 * This is the base class for potential payment sources in the chain of
 * responsibility.
 * @author cw1491
 */
public abstract class PaymentHandler {
    /**
     * The next handler in the chain
     */
    private PaymentHandler successor = null;
    
    /**
     * Setter for successor
     * @param successor New successor
     */
    void setSuccessor(PaymentHandler successor){
        this.successor = successor;
    }
    
    /**
     * This method should be called to process payments for a payment amount.
     * This implementation will by default just pass the handling on to the
     * next item in the chain.
     * @param paymentAmount Amount to be deducted by the chain, assumes paymentAmount is >=0.
     * @throws InsufficientFundsException Thrown if end of chain is reached without sufficient funds to cover the payment.
     * @throws NegativePaymentAmountException Thrown if payment amount is negative;
     * insufficient funds to process the specified payment.
     */
    void processPayment(double paymentAmount) throws InsufficientFundsException{
        if ((paymentAmount>0)&&(successor==null)){
            throw new InsufficientFundsException();
        }else if(paymentAmount==0){
            return;
        }else{
            successor.processPayment(paymentAmount);
        }
    }
}
