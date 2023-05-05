package ua.orlov.hw14;

import java.util.ArrayList;
import java.util.List;

public class MySetStat {
    private static List list = new ArrayList<>();

    public static void main(String[] args) {
        add(12);
        add("Name");
        add(2.5);
        System.out.println(list);
    }

    private static <T> void add(T nam) {
        list.add(nam);
    }

    @Override
    public String toString() {
        return "MySetStat{" +
                "list=" + list +
                '}';
    }
}
