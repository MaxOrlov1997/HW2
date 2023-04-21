package ua.orlov.orlov.hw5;

import java.util.concurrent.ThreadLocalRandom;

public class Practice1 {
    public static void main(String[] args) {
        int[] array = new int[12];
        int sum = 0;
        System.out.println(sumGoodsWithPriceOverThousand(array, sum));
    }

    public static int sumGoodsWithPriceOverThousand(int[] how, int sum) {
        for (int i = 0; i < how.length; i++) {
            how[i] = ThreadLocalRandom.current().nextInt(900, 1200);
        }
        for (int j = 0; j < how.length; j++) {
            if (how[j] > 1000) {
                sum += how[j];
            }
        }
        return sum;
    }
}
