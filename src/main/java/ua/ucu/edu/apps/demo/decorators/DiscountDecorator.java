package ua.ucu.edu.apps.demo.decorators;

import ua.ucu.edu.apps.demo.store.Item;

public class DiscountDecorator extends ItemDecorator {

    public DiscountDecorator(Item item) {
        super(item);
    }

    public double getPrice() {
        final double DISCOUNT = 0.08;
        return super.getPrice() * DISCOUNT;
    }
}
