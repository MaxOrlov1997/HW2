package ua.orlov.hw16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestTask1 {
    @Test
    public void newMapTest() {
        Task1 task1 = new Task1();
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Onl");
        list.add("Six");
        Assertions.assertEquals("{Java=4, Six=3, Onl=3}",task1.newMap(list).toString());
    }

    @Test
    public void newMapTestSecond() {
        Task1 task1 = new Task1();
        ArrayList<String> list = new ArrayList<>();
        list.add("Тут");
        list.add("Там");
        list.add("Стол");
        Assertions.assertEquals("{Тут=3, Там=3, Стол=4}",task1.newMap(list).toString());
    }
}
