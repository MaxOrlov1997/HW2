package ua.orlov.hw17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Runner {
    static int minSizeLimit = 15;

    @Override
    public String toString() {
        return "Runner{}";
    }

    public static void main(String[] args) {
        List<Box> boxlist = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Box box = new Box(ThreadLocalRandom.current().nextInt(0, 20));
            box.addItem(new Item("First", 10));
            box.addItem(new Item("Second", 5));
            box.addItem(new Item("Last", 13));
            boxlist.add(box);
        }
        List<Box> boxSize = boxlist.stream().filter(it -> it.isSuitable(minSizeLimit)).toList();
        List<Item> allItem = new ArrayList<>(boxSize.stream().flatMap(it -> it.getListItem().stream()).toList());
        allItem.sort(Comparator.comparingInt(Item::getCost));

        allItem.forEach(it -> System.out.println(it.getCost()));
    }
}

