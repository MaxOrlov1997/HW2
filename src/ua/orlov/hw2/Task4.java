package ua.orlov.hw2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();


        print(num1, num2, num3);
    }

    public static void print(int num2, int num1, int num3) {

        int num1Mod = num1 > 0 ? num1 : num1 * -1;
        int num2Mod = num2 > 0 ? num2 : num2 * -1;
        int num3Mod = num3 > 0 ? num3 : num3 * -1;
        int res = num1Mod < num2Mod ? 1 : 0;
        int res1 = num1Mod < num3Mod ? 1 : 0;
        if (res == res1) {
            System.out.println(num1);
        } else {
            System.out.println((num2Mod > num3Mod) ? num3 : num2);
        }
    }
}