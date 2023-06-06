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
import java.util.List;

public class Box {

   private int size;
   private List<Item> listItem;

    public Box(int size) {
        this.size = size;
        this.listItem = new ArrayList<>();
    }

    public void addItem(Item item) {
        listItem.add(item);
    }

    public List<Item> getListItem() {
        return listItem;
    }

    public Boolean isSuitable(int boxSize) {
        return boxSize <= size;
    }
}

