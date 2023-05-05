package ua.orlov.hw14;

import java.util.ArrayList;
import java.util.List;

public class MySetNoStat<T> {
    private List<T> list;

    public MySetNoStat(List<T> list) {
        this.list = list;
    }

    public static void main(String[] args) {
        MySetNoStat mySetStat = new MySetNoStat(new ArrayList<>());
        mySetStat.add(12);
        mySetStat.add("Name");
        System.out.println(mySetStat);
    }

    private void add(T nam) {
        list.add(nam);
    }

    @Override
    public String toString() {
        return "MySetStat{" +
                "list=" + list +
                '}';
    }
}