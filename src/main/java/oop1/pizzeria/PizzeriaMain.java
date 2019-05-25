package oop1.pizzeria;


import com.google.gson.*;
import oop1.pizzeria.data.drinks.*;
import oop1.pizzeria.data.meals.Pizza;
import oop1.pizzeria.data.meals.Tortilla;
import oop1.pizzeria.data.meals.Wrap;
import oop1.pizzeria.interfaces.MenuItem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class PizzeriaMain {
    public static void main(String[] args) {
        printMenuHeader();
        List<MenuItem> menuItems = new ArrayList<>();

        Map<MenuItem, Integer> orderBook = new HashMap<>();

        try {
            getMenu(menuItems);
        } catch (IOException e) {
            e.printStackTrace();
        }

        menuItems.sort((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()));

        int item = 1;
        for (MenuItem m : menuItems) {
            String menuItem = String.format("\t\t\t|%-20s %20.2f Eur.|", m.getClass().getSimpleName(), m.getPrice());
            System.out.println(item + "." + menuItem);
            item++;
        }

        System.out.println(Texts.DIVIDER + "\n" + Texts.OPTIONS);

        handleInput(menuItems, orderBook);
    }

    private static void handleInput(List<MenuItem> menu, Map<MenuItem, Integer> orderBook) {

        // first int for menu item, second for quantity.
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {

            int index = in.nextInt() - 1;
            System.out.println("Great choice :), just one?");

            int quantity = in.nextInt();

            switch (menu.get(index).getClass().getSimpleName()) {
                case "Coffee":
                    System.out.println("1.Sugar? 2.Milk? 3.Sugar and Milk 4.Just black coffee");
                    int choiceForCoffee = in.nextInt();
                    Coffee c = (Coffee) menu.get(index);
                    if (choiceForCoffee == 1) {
                        c.setSugar(true);
                        orderBook.put(menu.get(index), quantity);
                    } else if (choiceForCoffee == 2) {
                        c.setMilk(true);
                        orderBook.put(menu.get(index), quantity);
                    } else if (choiceForCoffee == 3) {
                        c.setMilk(true);
                        c.setSugar(true);
                        orderBook.put(menu.get(index), quantity);
                    } else if (choiceForCoffee == 4) {
                        orderBook.put(menu.get(index), quantity);
                        break;
                    }
                    break;
                case "Tea":
                    System.out.println("1.Sugar? 2.Honey? 3.No");
                    int choiceForTea = in.nextInt();
                    Tea t = (Tea) menu.get(index);
                    if (choiceForTea == 1) {
                        t.setSugar(true);
                        orderBook.put(menu.get(index), quantity);
                    } else if (choiceForTea == 2) {
                        t.setHoney(true);
                        orderBook.put(menu.get(index), quantity);
                    } else if (choiceForTea == 3) {
                        orderBook.put(menu.get(index), quantity);
                        break;
                    }
                    break;
                case "Water":
                    System.out.println("1.Sparkling? 2.Still?");
                    int choiceForWater = in.nextInt();
                    Water w = (Water) menu.get(index);
                    if (choiceForWater == 1) {
                        w.setSparkling(true);
                        orderBook.put(menu.get(index), quantity);
                        break;
                    } else if (choiceForWater == 2) {
                        w.setStill(true);
                        orderBook.put(menu.get(index), quantity);
                        break;
                    }
                    break;
                case "Beer":
                    orderBook.put(menu.get(index), quantity);
                    break;
                case "SoftDrink":
                    orderBook.put(menu.get(index), quantity);
                    break;
                case "Pizza":
                    System.out.println("Sauce?");
                    System.out.println("1.Tomato 2.Hot 3.Sweet 4.Barbecue 5.Garlic 6.No");
                    int sauceChoiceForPizza = in.nextInt();
                    Pizza pizza = (Pizza) menu.get(index);

                    switch (sauceChoiceForPizza) {
                        case 1:
                            pizza.setSauce(Sauce.TOMATO);
                            break;
                        case 2:
                            pizza.setSauce(Sauce.HOT);
                            break;
                        case 3:
                            pizza.setSauce(Sauce.SWEET);
                            break;
                        case 4:
                            pizza.setSauce(Sauce.BARBECUE);
                            break;
                        case 5:
                            pizza.setSauce(Sauce.GARLIC);
                            break;
                        case 6:
                            break;
                    }
                    orderBook.put(menu.get(index), quantity);
                    break;
                case "Tortilla":
                    System.out.println("Sauce?");
                    System.out.println("1.Tomato 2.Hot 3.Sweet 4.Barbecue 5.Garlic 6.No");
                    int sauceChoiceForTortilla = in.nextInt();
                    Tortilla tortilla = (Tortilla) menu.get(index);

                    switch (sauceChoiceForTortilla) {
                        case 1:
                            tortilla.setSauce(Sauce.TOMATO);
                            break;
                        case 2:
                            tortilla.setSauce(Sauce.HOT);
                            break;
                        case 3:
                            tortilla.setSauce(Sauce.SWEET);
                            break;
                        case 4:
                            tortilla.setSauce(Sauce.BARBECUE);
                            break;
                        case 5:
                            tortilla.setSauce(Sauce.GARLIC);
                            break;
                        case 6:
                            break;
                    }
                    orderBook.put(menu.get(index), quantity);
                    break;
                case "Wrap":
                    System.out.println("Sauce?");
                    System.out.println("1.Tomato 2.Hot 3.Sweet 4.Barbecue 5.Garlic 6.No");
                    int sauceChoiceForWrap = in.nextInt();
                    Wrap wrap = (Wrap) menu.get(index);

                    switch (sauceChoiceForWrap) {
                        case 1:
                            wrap.setSauce(Sauce.TOMATO);
                            break;
                        case 2:
                            wrap.setSauce(Sauce.HOT);
                            break;
                        case 3:
                            wrap.setSauce(Sauce.SWEET);
                            break;
                        case 4:
                            wrap.setSauce(Sauce.BARBECUE);
                            break;
                        case 5:
                            wrap.setSauce(Sauce.GARLIC);
                            break;
                        case 6:
                            break;
                    }
                    orderBook.put(menu.get(index), quantity);
                    break;
            }

            System.out.println(orderBook);
            System.out.println("Anything else? y/n");
            String s = in.next();
            switch (s) {
                case "y":
                    System.out.println("What you would like?");
                    break;
                case "n":
                    System.out.println("TODO: printing order, waiting for approve");

                    System.out.println("Your order:");
                    Set<Map.Entry<MenuItem, Integer>> entry = orderBook.entrySet();
                    for (Map.Entry<MenuItem, Integer> e : entry) {

                        System.out.println(e.getKey() + " " + e.getValue());
                    }
                    break;
            }
        }
        System.out.println("Wrong input.");
    }

    private static void getMenu(List<MenuItem> menu) throws IOException {
        String json = new String(Files.readAllBytes(Paths.get("menu.json")));

        JsonParser parser = new JsonParser();

        // JsonObject
        JsonElement element = parser.parse(json);

        // Root
        JsonObject rootObject = element.getAsJsonObject();

        // First array of drinks.
        JsonArray drinks = rootObject.getAsJsonArray("drinks");

        // Second array of foods.
        JsonArray foods = rootObject.getAsJsonArray("foods");

        for (JsonElement e : drinks) {
            String type = e.getAsJsonObject().get("type").getAsString();
            double price = e.getAsJsonObject().get("price").getAsDouble();

            switch (type) {
                case "beer":
                    menu.add(new Beer(price));
                    break;
                case "water":
                    menu.add(new Water(price));
                    break;
                case "tea":
                    menu.add(new Tea(price));
                    break;
                case "softdrink":
                    menu.add(new SoftDrink(price));
                    break;
                case "coffee":
                    menu.add(new Coffee(price));
                    break;
            }
        }

        for (JsonElement e : foods) {
            String type = e.getAsJsonObject().get("type").getAsString();
            double price = e.getAsJsonObject().get("price").getAsDouble();

            switch (type) {
                case "pizza":
                    menu.add(new Pizza(price));
                    break;
                case "tortilla":
                    menu.add(new Tortilla(price));
                    break;
                case "wrap":
                    menu.add(new Wrap(price));
                    break;
            }
        }

    }

    private static void printMenuHeader() {

        System.out.println(
                Texts.WELCOME_TEXT + "\n" + Texts.DIVIDER +
                        "\n" + Texts.MENU_TEXT + "\n" + Texts.DIVIDER
        );
    }
}
