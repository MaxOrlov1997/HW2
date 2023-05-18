package ua.orlov.hw14;

import java.util.Arrays;

public class Task2MySet<T> {

    public Task2MySet() {

    }

    public static void main(String[] args) {
        add(12);
        add("Name");
        Task2MySet task2MySet = new Task2MySet();
        task2MySet.addMas(new Object[]{2, "Name", 4.5});
    }

    private static <T> void add(T nam) {
        System.out.println(nam);
    }

    private T[] addMas(T[] array) {
        System.out.println(Arrays.toString(array));
        return null;
    }
}