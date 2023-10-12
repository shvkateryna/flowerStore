package flower.store;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlowerBucketTest {
    private FlowerBucket flowerBucket;
    private FlowerPack flowerPack;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
        flower.setPrice(10);
        flowerPack = new FlowerPack(flower, 10);
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
