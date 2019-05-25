package oop1.pizzeria.data.drinks;

import oop1.pizzeria.interfaces.Drink;
import oop1.pizzeria.interfaces.MenuItem;

public class SoftDrink implements MenuItem, Drink {

    private double price;

    public SoftDrink() {
    }

    public SoftDrink(double price) {
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
        return "SoftDrink{" +
                "price=" + price +
                '}';
    }
}
