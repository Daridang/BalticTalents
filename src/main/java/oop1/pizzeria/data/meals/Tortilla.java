package oop1.pizzeria.data.meals;

import oop1.pizzeria.Sauce;
import oop1.pizzeria.interfaces.Food;
import oop1.pizzeria.interfaces.MenuItem;

public class Tortilla implements MenuItem, Food {

    private Sauce sauce;
    private double price;

    public Tortilla() {
    }

    public Tortilla(double price) {
        this.price = price;
    }

    public Tortilla(double price, Sauce sauce) {
        this.price = price;
        this.sauce = sauce;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tortilla{" +
                "sauce=" + sauce +
                ", price=" + price +
                '}';
    }
}
