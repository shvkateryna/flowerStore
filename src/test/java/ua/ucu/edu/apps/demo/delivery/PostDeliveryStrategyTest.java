package ua.ucu.edu.apps.demo.delivery;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.ucu.edu.apps.demo.store.Item;

public class PostDeliveryStrategyTest {
    private PostDeliveryStrategy postDeliveryStrategy;
    private List<Item> items;
    
    @BeforeEach
    public void init() {
        postDeliveryStrategy = new PostDeliveryStrategy();

    }
    
    @Test
    public void testDeliver() {
        Assertions.assertEquals("Delivery: Post delivery", postDeliveryStrategy.deliver(items));
    }
}