package ua.orlov.orlov.hw2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax = sc.nextInt();
        int ay = sc.nextInt();
        int bx = sc.nextInt();
        int by = sc.nextInt();
        int cx = sc.nextInt();
        int cy = sc.nextInt();


        printS(ax, ay, bx, by, cx, cy);
    }

    public static int printS(int ax, int ay, int bx, int by, int cx, int cy) {
        int h = Math.abs(ax - bx);
        int a = Math.abs(cy - ay);
        int s = h * a;
        System.out.println(s);
        return s;
    }
}

