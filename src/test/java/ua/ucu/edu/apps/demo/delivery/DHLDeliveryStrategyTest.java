package ua.ucu.edu.apps.demo.delivery;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.ucu.edu.apps.demo.store.Item;

public class DHLDeliveryStrategyTest {
    private DHLDeliveryStrategy dhlDeliveryStrategy;
    private List<Item> items;
    
    @BeforeEach
    public void init() {
        dhlDeliveryStrategy = new DHLDeliveryStrategy();

    }
    
    @Test
    public void testDeliver() {
        Assertions.assertEquals("Delivery: DHL delivery", 
        dhlDeliveryStrategy.deliver(items));
    }
}