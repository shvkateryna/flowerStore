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
        final int PAPER_PRICE = 13;
        return PAPER_PRICE + this.item.getPrice();
    }

    
}
