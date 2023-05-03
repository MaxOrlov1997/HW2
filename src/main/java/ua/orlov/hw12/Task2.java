package ua.orlov.hw12;

public class Task2 {
    static String name = "Max";
    static String nameTwo = "Alex";

    public static void main(String[] args) {
        try {
            f();
        } catch (IllegalAccessError a) {
            System.out.println(a);
        }
    }

    private static void f() throws IllegalAccessError {
        try {
            g();
        } catch (IllegalAccessError e) {
            throw new IllegalAccessError(nameTwo);
        }
    }

    private static void g() throws IllegalAccessError {
        throw new IllegalAccessError(name);
    }
}

