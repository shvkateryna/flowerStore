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
        int ribbonPrice = 40;
        return ribbonPrice + this.item.getPrice();
    }
    
}
