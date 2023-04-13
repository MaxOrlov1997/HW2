package ua.orlov.hw5;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
    public static void main(String[] agrs) {
        int[][] array = new int[4][3];
        fillArray(array);
        for (int j = 0; j < array.length; j++) {
            System.out.println(" ");
            for (int i = 0; i < array[j].length; i++) {
                System.out.print(array[j][i] + " ");
            }
        }
    }

    public static void fillArray(int[][] arrays) {
        for (int j = 0; j < arrays.length; j++) {
            int n = 1;
            for (int i = 0; i < arrays[j].length; i++) {
            if (j % 2 != 0) {
                    arrays[j][i] = n++;
            } else {
                    arrays[j][i] -= n++;
                }
            }
        }
    }
}
