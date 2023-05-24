package ua.orlov.hw14;

import java.util.Arrays;

public class Task2MySet<T> {

    public Task2MySet() {

    }

    public static void main(String[] args) {
        printValueAnyType(12);
        printValueAnyType("Name");
        Task2MySet task2MySet = new Task2MySet();
        task2MySet.printArrayAnyType(new String[]{"Surname", "Name"});
    }

    public static <T> void printValueAnyType(T nam) {
        System.out.println(nam);
    }

    public void printArrayAnyType(T[] array) {
        System.out.println(Arrays.toString(array));
    }
}