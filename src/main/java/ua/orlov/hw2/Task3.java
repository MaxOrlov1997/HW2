package ua.orlov.hw2;

public class Task3 {

    public static void main(String[] args) {
        int num = 10;
evenNum(num);
        System.out.println(num);
    }

    public static void evenNum(int even) {
        if (even % 2 == 0) {
            System.out.println("Четное");
        } else
            System.out.println("Не четное");
    }
}