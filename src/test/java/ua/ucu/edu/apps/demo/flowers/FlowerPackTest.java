package ua.ucu.edu.apps.demo.flowers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlowerPackTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 1000;
    private FlowerPack flowerPack;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
        flower.setPrice(RANDOM_GENERATOR.nextInt(MAX_PRICE));
        int quantity = 0;
        flowerPack = new FlowerPack(flower, quantity);
    }

    @Test
    public void testQuantity() {
        int quantity = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flowerPack.setQuantity(quantity);
        Assertions.assertEquals(quantity, flowerPack.getQuantity());
    }

    @Test
    public void testPrice() {
        double price = flower.getPrice() * flowerPack.getQuantity();
        Assertions.assertEquals(price, flowerPack.getPrice());
    }
}

