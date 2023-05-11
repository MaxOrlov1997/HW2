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
        Assertions.assertNotNull(task1.newMap(list));
    }

    @Test
    public void newMapTestSecond() {
        Task1 task1 = new Task1();
        ArrayList<String> list = new ArrayList<>();
        list.add("Тут");
        list.add("Там");
        list.add("Стол");
        Assertions.assertNotNull(task1.newMap(list));
    }
}
