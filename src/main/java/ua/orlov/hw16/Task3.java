package ua.orlov.hw16;
/*Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
Напишите еще один метод, который выбирает из заполненного списка элемент
наугад 1000000 раз. Замерьте время, которое потрачено на это.*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class Task3 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> st = new LinkedList<>();
        completionList(list, st);
        checkList(list, st);
    }

    private static void completionList(ArrayList list, LinkedList st) {
        for (int i = 0; i < 999999; i++) {
            int x = ThreadLocalRandom.current().nextInt(0, 999999);
            list.add(x);
            st.add(x);
        }
    }

    private static void checkList(ArrayList list, LinkedList st) {
        long startList = System.currentTimeMillis();
        for (int i = 0; i < 999999; i++) {
            list.get(ThreadLocalRandom.current().nextInt(0, list.size()));
        }
        long finishList = System.currentTimeMillis();
        long allList = finishList - startList;
        System.out.println(allList);
        long startSt = System.currentTimeMillis();
        for (int i = 0; i < 999999; i++) {
            st.get(ThreadLocalRandom.current().nextInt(0, st.size()));
        }
        long finishSt = System.currentTimeMillis();
        long allSt = finishSt - startSt;
        System.out.println(allSt);
    }
}
