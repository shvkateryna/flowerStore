package ua.ucu.edu.apps.demo.payment;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreditCartPaymentTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private creditCartPaymentStrategy creditCartPayment;
    private double price;
    
    @BeforeEach
    public void init() {
        creditCartPayment = new creditCartPaymentStrategy();
        price = RANDOM_GENERATOR.nextDouble();
        

    }
    
    @Test
    public void testPay() {
        Assertions.assertEquals("Payment: Credit card payment", creditCartPayment.pay(price));
    }
}