package ua.ucu.edu.apps.demo.decorators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.ucu.edu.apps.demo.flowers.Flower;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class BasketDecoratorTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private final int BASKET_PRICE = 4;
    private BasketDecorator basketDecorator;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
        basketDecorator = new BasketDecorator(flower);
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        price += BASKET_PRICE;
        Assertions.assertEquals(price, basketDecorator.getPrice());
    }

    @Test
    public void testDescription() {
        Assertions.assertEquals("Decorated with basket",
        basketDecorator.getDescription());
    }
}
