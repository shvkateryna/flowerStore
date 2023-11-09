package ua.ucu.edu.apps.demo.decorators;

import ua.ucu.edu.apps.demo.store.Item;
public class RibbonDecorator extends ItemDecorator {

    public RibbonDecorator(Item item) {
        super(item);
    }
    public String getDescription() {
        return "Decorated with Ribbon";
    }

    public double getPrice() {
        final int RIBBON_PRICE = 40;
        return RIBBON_PRICE + super.getPrice();
    }
    
}
