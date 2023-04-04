package ua.orlov.hw5;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
public class Task2 {
    public static void main(String[] args) {
        int[][] array = new int[4][3];
        boolean isChanget = false;
        printArray(array);
        System.out.println(Arrays.deepToString(array));
        int[][] sorted = arrayCopy(array);
        sortArray(sorted, isChanget);
        System.out.println(Arrays.deepToString(sorted));
        System.out.println(sortArray(sorted, isChanget));
    }
    public static int[][] arrayCopy(int[][] arrayes) {
        return Arrays.copyOf(arrayes, arrayes.length);
    }
    public static int[][] printArray(int[][] arrays) {
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
        return arrays;
    }
    public static boolean sortArray(int[][] sorted, boolean isChanget) {
        int nextNum = 0;
        int dop;
        do {
            isChanget = false;
            for (int j = 0; j < sorted.length; j++) {
                for (int i = 0; i < sorted[j].length - 1 - nextNum; i++) {
                    if (sorted[j][i] < sorted[j][i + 1]) {
                        dop = sorted[j][i];
                        sorted[j][i] = sorted[j][i + 1];
                        sorted[j][i + 1] = dop;
                        isChanget = true;
                    }
                }
            }
            nextNum++;
        }
        while (isChanget);
        return isChanget;
    }
}

