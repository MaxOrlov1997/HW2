package ua.orlov.hw17;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Task2 {

    public static void main(String[] args) {
        IntSummaryStatistics stat = numbers().stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println(stat);
    }

    private static List<Integer> numbers() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(ThreadLocalRandom.current().nextInt(-20, 20));
            System.out.println(list.get(i));
        }
        return list.stream().filter(it -> it >= 0).toList();
    }
}
