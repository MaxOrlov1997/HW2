package ua.orlov.hw12;

import java.util.concurrent.ThreadLocalRandom;

public class Task3 {

    public static void main(String[] args) throws Exception {
        try {
            firstExtend();
        } catch (Exception a) {
            System.out.println(a);
        }
    }

    private static void firstExtend() throws Exception {
        int test = ThreadLocalRandom.current().nextInt(0, 4);
        if (test == 0) {
            throw new Exception("Тут ноль");
        }
        if (test == 3) {
            throw new Exception("Тут три");
        }
        if (test == 2) {
            throw new Exception("Тут два");
        }

    }
}

