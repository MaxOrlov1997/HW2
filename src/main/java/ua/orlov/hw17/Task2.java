package ua.orlov.hw17;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(fillArray().stream()
                .filter(it -> it >= 0)
                .mapToInt(Integer::intValue).
                summaryStatistics());
    }

    public static List<Integer> fillArray() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(ThreadLocalRandom.current().nextInt(-20, 20));
        }
        return list;
    }
}
