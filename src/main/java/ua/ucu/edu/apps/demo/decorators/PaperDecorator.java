package ua.ucu.edu.apps.demo.decorators;

import ua.ucu.edu.apps.demo.store.Item;


public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }

    public String getDescription() {
        return "Decorated with paper";
    }

    public double getPrice() {
        final int PAPER_PRICE = 13;
        return PAPER_PRICE + super.getPrice();
    }

    
}
