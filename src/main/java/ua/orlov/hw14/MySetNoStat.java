package ua.orlov.hw14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MySetNoStat<T> {
    private static List list;

    public MySetNoStat(List<T> list) {
        this.list = list;
    }

    public static void main(String[] args) {
        MySetNoStat mySetStat = new MySetNoStat(new ArrayList<>());
        mySetStat.add(12);
        mySetStat.add("Name");
        System.out.println(mySetStat.list);
        System.out.println(Arrays.asList(mySetStat.addMas(new Object[]{"5", "Max", 7})));
        System.out.println(Arrays.asList(list));

    }

    private static <T> void add(T nam) {
        list.add(nam);
    }

    private T[] addMas(T[] array) {
        list.add((T) array);
        return array;
    }

    @Override
    public String toString() {
        return "MySetNoStat{" +
                "list=" + list +
                '}';
    }
}