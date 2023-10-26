package ua.ucu.edu.apps.demo.payment;

public class CreditCartPaymentStrategy implements PaymentStrategy {
    @Override
    public String pay(double price) {
        return "Payment: Credit card payment";
    }
}
