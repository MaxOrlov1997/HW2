package ua.orlov.hw5;

import java.util.concurrent.ThreadLocalRandom;

public class Practice2 {
    public static void main(String[] args) {
        int[] array = new int[25];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(-180, 150);
        }
        double sumMen = 0;
        double sumWomen = 0;
        sumMen = sumMenHeight(array, sumMen);
        sumWomen = sumWomenHeight(array, sumWomen);

        System.out.println(sumMenHeight(array, sumMen));
        System.out.println(sumWomenHeight(array, sumWomen));
    }

    public static double sumMenHeight(int[] array, double sumMen) {
        double heightMen = 0;
        int howMen = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < 0) {
                heightMen += Math.abs(array[j]);
                howMen++;
            }
        }
        sumMen = heightMen / howMen;
        return sumMen;
    }

    public static double sumWomenHeight(int[] array, double sumWomen) {
        double heightWomen = 0;
        int howWomen = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > 0) {
                heightWomen += array[j];
                howWomen++;
            }
        }
        sumWomen = heightWomen / howWomen;
        return sumWomen;
    }
}
