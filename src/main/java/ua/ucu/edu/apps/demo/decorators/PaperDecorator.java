package ua.ucu.edu.apps.demo.decorators;

import lombok.AllArgsConstructor;
import ua.ucu.edu.apps.demo.store.Item;

@AllArgsConstructor
public class PaperDecorator implements ItemDecorator {
    private Item item;

    @Override
    public String getDescription() {
        return "Decorated with paper";
    }

    public double getPrice() {
        int paperPrice = 13;
        return paperPrice + this.item.getPrice();
    }

    
}
