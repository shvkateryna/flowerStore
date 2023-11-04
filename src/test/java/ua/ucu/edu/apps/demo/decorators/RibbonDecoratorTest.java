package ua.ucu.edu.apps.demo.decorators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.ucu.edu.apps.demo.flowers.Flower;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class RibbonDecoratorTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private RibbonDecorator ribbonDecorator;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
        ribbonDecorator = new RibbonDecorator(flower);
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price + 40, ribbonDecorator.getPrice());
    }

    @Test
    public void testDescription() {
        Assertions.assertEquals("Decorated with Ribbon", ribbonDecorator.getDescription());
    }
}