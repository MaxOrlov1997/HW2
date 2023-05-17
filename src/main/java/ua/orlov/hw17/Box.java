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
import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Box {
   static int size = 10;
   static List<Object> box;
    static Map<String, Double> item;
    public static void main(String[] args) {
        box=new ArrayList<>(size);
        item.put("Apple",12.5);
        item.put("Banana",15.5);
        item.put("Chery",17.5);
        item.put("Tomato",19.5);
        item.put("Orange",2.5);

    }
    private static void coll(){
    }
}
