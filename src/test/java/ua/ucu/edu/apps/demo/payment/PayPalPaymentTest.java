package ua.ucu.edu.apps.demo.payment;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PayPalPaymentTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private PayPalPaymentStrategy payPalPayment;
    private double price;
    
    @BeforeEach
    public void init() {
        payPalPayment = new PayPalPaymentStrategy();
        price = RANDOM_GENERATOR.nextDouble();
        

    }
    
    @Test
    public void testPay() {
        Assertions.assertEquals("Payment: Pay Pal payment", payPalPayment.pay(price));
    }
}
