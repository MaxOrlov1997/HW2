package ua.orlov.hw16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Task3 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> st = new LinkedList<>();
        completionList(list);
        completionList(st);
        checkList(list);
        checkList(st);
    }

    private static void completionList(List<Integer> list) {
        for (int i = 0; i < 999999; i++) {
            list.add(ThreadLocalRandom.current().nextInt(0, 999999));
        }
    }

    private static void checkList(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 999999; i++) {
            list.get(ThreadLocalRandom.current().nextInt(0, list.size()));
        }
        long finishTime = System.currentTimeMillis();
        long duration = finishTime - startTime;
        System.out.println(duration);
    }
}
