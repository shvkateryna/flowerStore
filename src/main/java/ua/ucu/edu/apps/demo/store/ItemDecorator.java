package ua.ucu.edu.apps.demo.store;

public class ItemDecorator extends Item{
    private Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }
    public String getDescription() {
        return item.getDescription();
    }

    public double getPrice() {
        return item.getPrice();
    }
}
