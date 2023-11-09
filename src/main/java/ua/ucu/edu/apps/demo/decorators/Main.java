package ua.ucu.edu.apps.demo.decorators;

import ua.ucu.edu.apps.demo.flowers.Flower;
import ua.ucu.edu.apps.demo.flowers.FlowerColor;
import ua.ucu.edu.apps.demo.flowers.FlowerType;
import ua.ucu.edu.apps.demo.store.Item;

public class Main {
    public static void main(String[] args) {
        Item item = new Flower(1, 80, FlowerColor.RED, 0.8, FlowerType.CHAMOMILE);
        item = new DiscountDecorator(new PaperDecorator(item));
        System.out.println(item.getPrice());
    }
}
