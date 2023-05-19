package ua.orlov.hw17;
/*Спроектировать класс Box который содержит коллекцию Item, size.
Item должен содержать поле name и cost
a. Создать коллекцию Box и инициализировать ее 10 коробками
b. Спроектировать метод, который поможет определить подходит ли
коробка по размеру.
Boolean isSuitable(minSizeLimit)
c. Применить фильтр к коллекции коробок по размеру,
d. У оставшихся коробок взять коллекции Item
e. Отсортировать по цене
f. Вывести цены в консоль*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Box {

    static int size = 10;

    public static void main(String[] args) {
        ArrayList box = new ArrayList();
        for (int i = 0; i < size; i++) {
            Item item = new Item();
            box.add(item);
        }
        System.out.println(box.stream().
                filter(it -> isSuitable(box) == true).
                //flatMap(it -> new ArrayList<>()). тут не совсем понимаю зачем нам нужен новый стрим
                        sorted(new ItemComparator()).
                collect(Collectors.toList()));
    }

    private static Boolean isSuitable(ArrayList box) {
        if (box.size() <= size) {
            return !box.isEmpty();
        } else return false;
    }
}

class ItemComparator implements Comparator<Item> {
    public int compare(Item a, Item b) {
        return Double.compare(a.cost, b.cost);
    }
}
