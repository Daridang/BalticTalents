package oop1.pizzeria.data.drinks;

import oop1.pizzeria.interfaces.Drink;
import oop1.pizzeria.interfaces.MenuItem;

public class Water implements MenuItem, Drink {

    private boolean sparkling = false;
    private boolean still = true;
    private double price;

    public Water() {}

    public Water(double price) {
        this.price = price;
    }

    public boolean isSparkling() {
        return sparkling;
    }

    public void setSparkling(boolean sparkling) {
        this.sparkling = sparkling;
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
        return "Water{" +
                "sparkling=" + sparkling +
                ", price=" + price +
                '}';
    }

    public void setStill(boolean b) {
        this.still = b;
    }
}
