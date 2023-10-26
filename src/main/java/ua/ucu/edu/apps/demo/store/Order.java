package ua.ucu.edu.apps.demo.store;

import java.util.LinkedList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.ucu.edu.apps.demo.delivery.DeliveryStrategy;
import ua.ucu.edu.apps.demo.payment.PaymentStrategy;

@AllArgsConstructor @Setter @Getter
public class Order {
    private LinkedList<Item> items;
    private PaymentStrategy paymentStrategy;
    private DeliveryStrategy delivery;

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Item item:items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public String processOrder() {
        return "Processing...";
    }

    public String addItem(Item item) {
        items.add(item);
        return "We added this item to your order";
    }

    public String removeItem(Item item) {
        if (items.contains(item)) {
            items.remove(item);
            return "We removed this item from your order";
        }
        return "No such item";
    }
}
