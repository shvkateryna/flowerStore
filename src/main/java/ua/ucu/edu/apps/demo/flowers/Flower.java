package ua.ucu.edu.apps.demo.flowers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Setter @Getter @AllArgsConstructor @Entity @NoArgsConstructor
public class Flower {
    @Id
    private int id;
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType type;

    public Flower(Flower flower) {
    }

    public String getColor() {
        return color.toString();
    }
}