package ua.ucu.edu.apps.demo.delivery;

import java.util.List;

import ua.ucu.edu.apps.demo.store.Item;

public class DHLDeliveryStrategy implements DeliveryStrategy{

    @Override
    public String deliver(List<Item> items) {
        return "Delivery: DHL delivery";
    }
    
}
