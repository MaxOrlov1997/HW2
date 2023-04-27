package ua.orlov.hw12;

public class Task1 {
    String name;

    public Task1(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        try {
            throw new Exception("Max");
        } catch (Exception a) {
            System.out.println(a);
        } finally {
            System.out.println("Мы тут были");
        }

    }
}
