package ua.ucu.edu.apps.demo.decorators;

import ua.ucu.edu.apps.demo.store.Item;

public class ItemDecorator extends Item {
    private Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }
    public String getDescription() {
        return item.getDescription();
    }

    public double getPrice() {
        return item.getPrice();
    }
}
