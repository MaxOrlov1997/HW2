package ua.orlov.hw16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestTask2 {

    @Test
    public void newMapTest() {
        Task2 task2 = new Task2();
        ArrayList<String> list = new ArrayList<>();
        list.add("Тут");
        list.add("Там");
        list.add("Стол");
        list.add("Сто");
        Assertions.assertNotNull(task2.newMap(list));
    }

    @Test
    public void newMapTestSecond() {
        Task2 task2 = new Task2();
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Onl");
        list.add("Six");
        Assertions.assertNotNull(task2.newMap(list));
    }
}
