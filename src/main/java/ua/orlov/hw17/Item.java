package ua.orlov.hw17;

import java.util.concurrent.ThreadLocalRandom;

public class Item {
    String name = "Apple";
    Double cost = ThreadLocalRandom.current().nextDouble(1,10);

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
