package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter @Getter
public class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }
    public Flower() {}

    public Flower(Flower Flower) {
        this.sepalLength = Flower.sepalLength;
        this.color = Flower.color;
        this.price = Flower.price;
        this.flowerType = Flower.flowerType;
    }
}
