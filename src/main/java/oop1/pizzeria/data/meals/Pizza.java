package oop1.pizzeria.data.meals;

import oop1.pizzeria.Sauce;
import oop1.pizzeria.interfaces.Food;
import oop1.pizzeria.interfaces.MenuItem;

public class Pizza implements MenuItem, Food {

    private Sauce sauce;
    private double price;

    public Pizza() {
    }

    public Pizza(double price) {
        this.price = price;
    }

    public Pizza(double price, Sauce sauce) {
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
        return "Pizza{" +
                "sauce=" + sauce +
                ", price=" + price +
                '}';
    }
}
