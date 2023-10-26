package ua.ucu.edu.apps.demo.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



@Setter @Getter @AllArgsConstructor
public class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType type;


    public String getColor() {
        return color.toString();
    }


    public Flower(Flower flower) {
    }


    public Flower() {
    }
}