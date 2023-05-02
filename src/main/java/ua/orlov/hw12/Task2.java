package ua.orlov.hw12;

public class Task2 {
    static String name = "Max";
    static String nameTwo = "Alex";

    public static void main(String[] args) {
        try {
            f();
        } catch (Exception a) {
            System.out.println(a);
        }
    }

    private static void f() throws Exception {
        try {
            g();
        } catch (Exception e) {
            throw new Exception(nameTwo);
        }
    }

    private static void g() throws Exception {
        throw new Exception(name);
    }
}

