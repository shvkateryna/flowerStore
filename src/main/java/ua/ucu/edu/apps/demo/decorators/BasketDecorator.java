package ua.ucu.edu.apps.demo.decorators;
import ua.ucu.edu.apps.demo.store.Item;


public class BasketDecorator extends ItemDecorator {

    public BasketDecorator(Item item) {
        super(item);
    }

    public String getDescription() {
        return "Decorated with basket";
    }

    public double getPrice() {
        final int BASKET_PRICE = 4;
        return BASKET_PRICE + super.getPrice();
    }
    
}
