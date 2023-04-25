package ua.orlov.hw5;

import java.util.concurrent.ThreadLocalRandom;

public class Practice1 {
    public static void main(String[] args) {
        int[] array = new int[12];
        System.out.println(sumGoodsWithPriceOverThousand(array));
    }

    public static int sumGoodsWithPriceOverThousand(int[] how) {
        int sum = 0;
       /* for (int i = 0; i < how.length; i++) {
            how[i] = ThreadLocalRandom.current().nextInt(900, 1200);    для теста сделал
        }*/
        for (int j = 0; j < how.length; j++) {
            if (how[j] > 1000) {
                sum += how[j];
            }
        }
        return sum;
    }
}
