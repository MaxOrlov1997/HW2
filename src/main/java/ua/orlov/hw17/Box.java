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
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Box {

    static int size = 10;
     static ArrayList box = new ArrayList();

    public static void main(String[] args) {
        Item item = new Item();
        for (int i = 0; i < size; i++) {
            box.add(item);
        }
        System.out.println(box.stream().
            filter(it -> isSuitable().equals(true)).
            flatMap(it->new ArrayList<>()).
            sorted().collect(Collectors.toList()));

    }
    private static Boolean isSuitable(){
       if(box.size()<=size)
       {return !box.isEmpty();}
       else return false;
    }
}
//class BoxComparator implements Comparator{
//    public double compare(Item.cost a, Item.cost b){
//
//    }
//}
class Item{
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
