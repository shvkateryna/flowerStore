package flower.store;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlowerPackTest {
    private FlowerPack flowerPack;
    private Flower flower;
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 100;
    private static final int MAX_PRICE = 1000;

    @BeforeEach
    public void init() {
        flower = new Flower();
        flower.setPrice(RANDOM_GENERATOR.nextInt(MAX_PRICE));
        flowerPack = new FlowerPack(flower, RANDOM_GENERATOR.nextInt(MAX_QUANTITY));
    }

    @Test
    public void testQuantity() {
        flowerPack.setQuantity(-2);
        Assertions.assertEquals(1, flowerPack.getQuantity());
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        flowerPack.setQuantity(quantity);
        Assertions.assertEquals(quantity, flowerPack.getQuantity());
    }

    @Test
    public void testPrice() {
        Assertions.assertEquals(flower.getPrice() * flowerPack.getQuantity(), flowerPack.getPrice());
    }
}
