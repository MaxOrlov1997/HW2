package ua.orlov.hw12;

public class Task1 {
    static String name = "Max";

    public static void main(String[] args) {
        try {
            throw new IllegalAccessError(name);
        } catch (IllegalAccessError a) {
            System.out.println(a);
        } finally {
            System.out.println("Мы тут были");
        }

    }
}
