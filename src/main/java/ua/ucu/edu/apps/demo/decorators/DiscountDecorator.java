package ua.ucu.edu.apps.demo.decorators;

import ua.ucu.edu.apps.demo.store.Item;

public class DiscountDecorator extends ItemDecorator{

    public DiscountDecorator(Item item) {
        super(item);
    }

    public double getPrice() {
        return super.getPrice() * 0.08;
    }
}
