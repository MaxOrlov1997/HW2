package ua.orlov.hw12;

import java.net.SocketException;

public class Task2 {
    static String name = "Max";
    static String nameTwo = "Alex";

    public static void main(String[] args) {
        try {
            f();
        } catch (RuntimeException a) {
            System.out.println(a);
        }
    }

    private static void f() throws RuntimeException {
        try {
            g();
        } catch (SocketException e) {
            throw new RuntimeException(nameTwo);
        }
    }

    private static void g() throws SocketException {
        throw new SocketException(name);
    }
}

