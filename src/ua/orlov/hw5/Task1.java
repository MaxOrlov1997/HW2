package ua.orlov.hw5;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
    public static void main(String[] agrs) {
        int[][] array = new int[4][3];
        printArray(array);
        for (int j = 0; j < array.length; j++) {
            System.out.println(" ");
            for (int i = 0; i < array[j].length; i++) {
                System.out.print(array[j][i] + " ");
            }
        }
    }

    public static void printArray(int[][] arrays) {
        for (int j = 0; j < arrays.length; j++) {
            int n = 1;
            if (j % 2 != 0) {
                for (int i = 0; i < arrays[j].length; i++) {
                    arrays[j][i] = n;
                    n++;
                }
            } else {
                for (int i = 0; i < 3; i++) {
                    arrays[j][i] = -n;
                    n++;

                }
            }
        }
    }
}
