package ua.orlov.hw5;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ThreadLocalRandom;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[4];
        fillArray(array);
        System.out.println(Arrays.toString(array));
        sortArray(array);
        System.out.println(sortArray(array));
    }

    public static int[] fillArray(int[] array) {
        for (int j = 0; j < array.length; j++) {
            array[j] = ThreadLocalRandom.current().nextInt(0, 10);
        }
        return array;
    }

    public static boolean sortArray(int[] array) {
        int[] sorted = Arrays.copyOf(array, array.length);
        int[] sor = new int [array.length];
        int n=0;
        Arrays.sort(sorted);
        for (int i = sorted.length - 1; i >= 0; i--) {
           sor[n] = sorted[i];
            n++;
        }
        System.out.println(Arrays.toString(sor));
        boolean sort = Arrays.toString(array).equals(Arrays.toString(sor));
        return sort;
    }
}

