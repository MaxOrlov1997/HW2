package ua.orlov.hw15;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    private static ArrayList<String> list = new ArrayList<>();

    public Task1() {

    }

    public static void main(String[] args) {
        list.add("Max");
        list.add("Orlov");
        Task1 task1 = new Task1();
        task1.cycleFor();
        task1.cycleForeach();
        task1.cycleWhile();
        task1.cycleIterator();
    }

    private void cycleFor() {
        for (Integer i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private void cycleForeach() {
        for (String i : list) {
            System.out.println(i);
        }
    }

    private void cycleWhile() {
        int n = 0;
        while (list.size() > n) {
            System.out.println(list.get(n));
            n++;
        }
    }

    private void cycleIterator() {
        Iterator<String> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
