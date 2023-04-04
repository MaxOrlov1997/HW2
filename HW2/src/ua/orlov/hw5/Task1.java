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
    public static int printArray(int[][] arrays) {
        for (int j = 0; j < arrays.length; j++) {
            if (j % 2 != 0) {
                for (int i = 0; i < arrays[j].length; i++) {
                    arrays[j][i] = ThreadLocalRandom.current().nextInt(-10, 0);
                }
            } else {
                for (int i = 0; i < 3; i++) {
                    arrays[j][i] = ThreadLocalRandom.current().nextInt(0, 10);
                }
            }
        }
        return 0;
    }
}
