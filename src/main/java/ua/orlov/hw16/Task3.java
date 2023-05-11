package ua.orlov.hw16;
/*Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
Напишите еще один метод, который выбирает из заполненного списка элемент
наугад 1000000 раз. Замерьте время, которое потрачено на это.*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class Task3 {
    static ArrayList<Integer> list = new ArrayList<>();
    static LinkedList<Integer> st = new LinkedList<>();

    public static void main(String[] args) {
        addArray();
        takeNumonlist();
    }

    private static void addArray() {
        for (int i = 0; i < 999999; i++) {
            int x = ThreadLocalRandom.current().nextInt(0, 999999);
            list.add(x);
            st.add(x);
        }
    }

    private static void takeNumonlist() {
        Integer num = ThreadLocalRandom.current().nextInt(0, 10);
        long startList = System.currentTimeMillis();
        for (int i = 0; i < 999999; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(num)) {
                    break;
                }
            }
        }
        long finishList = System.currentTimeMillis();
        long allList = finishList - startList;
        System.out.println(allList);
        long startSt = System.currentTimeMillis();
        for (int i = 0; i < 999999; i++) {
            for (int j = 0; j < st.size(); j++) {
                if (st.get(j).equals(num)) {
                    break;
                }
            }
        }
        long finishSt = System.currentTimeMillis();
        long allSt = finishSt - startSt;
        System.out.println(allSt);
    }
}
