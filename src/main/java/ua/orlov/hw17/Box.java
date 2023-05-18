package ua.orlov.hw17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Box {
    static List list = new ArrayList<>();
    int size = 2;
    static Collection[] box = new ArrayList[]{new ArrayList<>()};

    public Box(int size) {
        this.box = new Collection[]{box[size]};
    }

    public static void main(String[] args) {
        Item item = new Item();
        list.add(item);
//        box.(item);
//        box.(item);
//        box.(item);
//        box.(item);
        
    }
}
class Item{
    String name = "Apple";
    Double cost = 4.5;

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
