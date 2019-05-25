package oop1.pizzeria.data.drinks;

import oop1.pizzeria.interfaces.Drink;
import oop1.pizzeria.interfaces.MenuItem;

public class Beer implements MenuItem, Drink {

    private double price;

    public Beer() {}

    public Beer(double price) {
        this.price = price;
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
        return "Beer{" +
                "price=" + price +
                '}';
    }
}
