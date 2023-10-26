package ua.ucu.edu.apps.demo.payment;

public class PayPalPaymentStrategy implements PaymentStrategy {
    @Override
    public String pay(double price) {
        return "Payment: Pay Pal payment";
    }
}
