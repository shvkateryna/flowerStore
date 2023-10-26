package ua.ucu.edu.apps.demo.delivery;

import java.util.List;

public class PostDeliveryStrategy implements DeliveryStrategy {

    @Override
    public String deliver(List<ua.ucu.edu.apps.demo.store.Item> items) {
        return "Delivery: Post delivery";
    }
}
