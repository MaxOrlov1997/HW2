package ua.orlov.hw14;

import java.util.Arrays;

public class Task2MySet<T> {

    public Task2MySet() {

    }

    public static void main(String[] args) {
        addValueAnyType(12);
        addValueAnyType("Name");
        Task2MySet task2MySet = new Task2MySet();
        task2MySet.addArrayAnyType(new String[]{"Surname", "Name"});
    }

    public static <T> void addValueAnyType(T nam) {
        System.out.println(nam);
    }

    public void addArrayAnyType(T[] array) {
        System.out.println(Arrays.toString(array));
    }
}