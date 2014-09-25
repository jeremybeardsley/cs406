package edu.ccsu.classwork.cs406.ChainOfResponsibilityDemo;

/**
 *
 * @author cw1491
 */
public class CheckProcessor {

    private CheckingAccount paymentMethod;

    /**
     * Creates a check processor using the specified payment method
     *
     * @param paymentMethod Payment method chain for this check processor
     */
    public CheckProcessor(final CheckingAccount paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Attempts to process the specified payment
     *
     * @param paymentAmount Amount to be paid
     * @return Message regarding success of payment
     * @throws NegativePaymentAmountException If payment amount specified is
     * invalid
     */
    public String makePayment(double paymentAmount) throws NegativePaymentAmountException {
        if (paymentAmount < 0) {
            throw new NegativePaymentAmountException();
        } else if (paymentAmount == 0) {
            return "Payment processed";
        } else if (paymentAmount > 0 && paymentMethod == null) {
            return "You have insufficient funds for this transaction";
        } else {
            try {
                paymentMethod.processPayment(paymentAmount);
                return "Payment processed";
            } catch (InsufficientFundsException e) {
                return "You have insufficient funds for this transaction";
            }
        }
    }
}
