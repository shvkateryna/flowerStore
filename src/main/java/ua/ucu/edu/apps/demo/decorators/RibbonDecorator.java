package ua.ucu.edu.apps.demo.decorators;

import lombok.AllArgsConstructor;
import ua.ucu.edu.apps.demo.store.Item;

@AllArgsConstructor
public class RibbonDecorator implements ItemDecorator {
    private Item item;

    @Override
    public String getDescription() {
        return "Decorated with Ribbon";
    }

    public double getPrice() {
        final int RIBBON_PRICE = 40;
        return RIBBON_PRICE + this.item.getPrice();
    }
    
}
