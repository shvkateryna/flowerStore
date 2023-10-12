package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter @Getter
public class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public Flower(Flower flower) {
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        this.price = flower.price;
        this.flowerType = flower.flowerType;
    }

    public Flower() { }

    public String getColor() {
        return color.toString();
    }
}
