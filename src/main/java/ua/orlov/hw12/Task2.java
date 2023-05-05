package ua.orlov.hw12;

public class Task2 {
    static String name = "Max";
    static String nameTwo = "Alex";

    public static void main(String[] args) {
        try {
            f();
        } catch (IllegalArgumentException a) {
            System.out.println(a);
        }
    }

    private static void f() throws IllegalArgumentException {
        try {
            g();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(nameTwo);
        }
    }

    private static void g() {
        throw new IllegalArgumentException(name);
    }
}

