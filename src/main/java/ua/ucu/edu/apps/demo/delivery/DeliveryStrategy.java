package ua.ucu.edu.apps.demo.delivery;

import java.util.List;

import ua.ucu.edu.apps.demo.store.Item;

public interface DeliveryStrategy {
    String deliver(List<Item> items);
}
