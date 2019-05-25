package oop1.pizzeria.data.drinks;

import oop1.pizzeria.interfaces.Drink;
import oop1.pizzeria.interfaces.MenuItem;

public class Tea implements MenuItem, Drink {

    private boolean sugar;
    private boolean honey;
    private double price;

    public Tea() {
    }

    public Tea(double price) {
        this.price = price;
    }

    public Tea(double price, boolean sugar, boolean honey) {
        this.price = price;
        this.sugar = sugar;
        this.honey = honey;
    }

    public boolean isHoney() {
        return honey;
    }

    public void setHoney(boolean honey) {
        this.honey = honey;
    }

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
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
        return "Tea{" +
                "sugar=" + sugar +
                ", honey=" + honey +
                ", price=" + price +
                '}';
    }
}
