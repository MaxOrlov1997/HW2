package ua.orlov.hw17;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Task4 {
    public static void main(String[] args) {

        System.out.println(fillArrayList().stream().reduce(Integer::min).get());
    }

    private static List<Integer> fillArrayList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(ThreadLocalRandom.current().nextInt(0, 10));
        }
        return list;
    }
}
