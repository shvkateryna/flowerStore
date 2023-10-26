package ua.ucu.edu.apps.demo.flowers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 100;
    private FlowerBucket flowerBucket;
    private FlowerPack flowerPack;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        flowerPack = new FlowerPack(flower, quantity);
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testPrice() {
        Assertions.assertEquals(0, flowerBucket.getPrice());
    }

    @Test
    public void testAddFlowerPack() {
        flowerBucket.addFlowerPack(flowerPack);
        List<FlowerPack> flowerPacks = new ArrayList<>();
        flowerPacks.add(flowerPack);
        Assertions.assertEquals(flowerPacks, flowerBucket.getFlowerPacks());
    }


}
