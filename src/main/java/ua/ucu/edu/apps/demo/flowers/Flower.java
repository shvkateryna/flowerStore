package ua.ucu.edu.apps.demo.flowers;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.ucu.edu.apps.demo.store.Item;



@Setter @Getter @AllArgsConstructor @Entity
public class Flower extends Item {
    @Id
    private int id;
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType type;

    public Flower() { }

    public Flower(Flower flower) {
    }

    public String getColor() {
        return color.toString();
    }
}