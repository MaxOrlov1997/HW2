package ua.orlov.hw17;

import java.util.concurrent.ThreadLocalRandom;

public class Item {
    String name;
    Double cost;

    public Item(String name, Double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
