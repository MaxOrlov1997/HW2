package ua.orlov.hw5;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[4];
        fillArray(array);
        System.out.println(Arrays.toString(array));
        sortArray(array);
        System.out.println(sortArray(array));
    }

    public static int[] fillArray(int[] arrays) {
        for (int j = 0; j < arrays.length; j++) {
            arrays[j] = ThreadLocalRandom.current().nextInt(0, 10);
        }
        return arrays;
    }

    public static boolean sortArray(int[] array) {
        int[] sorted = Arrays.copyOf(array, array.length);
        Arrays.sort(sorted);
        boolean sort = array.equals(sorted);
        return sort;
    }
}

