package ua.orlov.hw12;

import java.util.concurrent.ThreadLocalRandom;

class Exception {
    static int test = ThreadLocalRandom.current().nextInt(1, 4);

    public static void main(String[] args) {
        try {
            throwRandomException();
        } catch (IllegalAccessError a) {
            System.out.println(a);
        }
    }

    static void throwRandomException() {
        if (test == 1) {
            throw new NumberFormatException("Тут один");
        }
        if (test == 2) {
            throw new NumberFormatException("Тут два");
        }
        if (test == 3) {
            throw new NumberFormatException("Тут три");
        }
    }
}