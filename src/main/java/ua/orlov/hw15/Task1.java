package ua.orlov.hw15;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    private Task1() {

    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Max");
        list.add("Orlov");
        printUsingForCycle(list);
        printUsingForeachCycle(list);
        printUsingWhileCycle(list);
        printUsingIteratorCycle(list);
    }

    public static void printUsingForCycle(ArrayList<String> list) {
        for (Integer i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void printUsingForeachCycle(ArrayList<String> list) {
        for (String i : list) {
            System.out.println(i);
        }
    }

    public static void printUsingWhileCycle(ArrayList<String> list) {
        int n = 0;
        while (list.size() > n) {
            System.out.println(list.get(n));
            n++;
        }
    }

    public static void printUsingIteratorCycle(ArrayList<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
