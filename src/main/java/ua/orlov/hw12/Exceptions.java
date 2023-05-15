package ua.orlov.hw12;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;
import java.util.concurrent.ThreadLocalRandom;

class Exception extends Throwable {
    static int test = ThreadLocalRandom.current().nextInt(1, 4);

    public static void main(String[] args) {
        try {
            throwRandomException();
        } catch (RuntimeException a) {
            System.out.println(a);
        }
    }

    static void throwRandomException() {
        if (test == 1) {
            throw new NumberFormatException("Тут один");
        }
        if (test == 2) {
            throw new IllegalArgumentException("Тут два");
        }
        if (test == 3) {
            throw new IndexOutOfBoundsException("Тут три");
        }
    }
}