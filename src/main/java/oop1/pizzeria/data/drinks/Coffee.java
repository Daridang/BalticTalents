package oop1.pizzeria.data.drinks;

import oop1.pizzeria.interfaces.Drink;
import oop1.pizzeria.interfaces.MenuItem;

public class Coffee implements MenuItem, Drink {

    private boolean sugar;
    private boolean milk;
    private double price;

    public Coffee() {
    }

    public Coffee(double price) {
        this.price = price;
    }

    public Coffee(double price, boolean sugar, boolean milk) {
        this.price = price;
        this.sugar = sugar;
        this.milk = milk;
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
        return "Coffee{" +
                "sugar=" + sugar +
                ", milk=" + milk +
                ", price=" + price +
                '}';
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }
}
