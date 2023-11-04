package ua.ucu.edu.apps.demo.decorators;

import lombok.AllArgsConstructor;
import ua.ucu.edu.apps.demo.store.Item;

@AllArgsConstructor
public class BasketDecorator implements ItemDecorator {
    private Item item;

    @Override
    public String getDescription() {
        return "Decorated with basket";
    }

    public double getPrice() {
        int basketPrice = 4;
        return basketPrice + this.item.getPrice();
    }
    
}
