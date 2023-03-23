package ua.Orlov.hw3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int a = (int) (Math.random()*10);

        System.out.println(figure(a) + " Угадал");

    }

    public static int figure(int a) {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        while (a>b || a<b || a==b){
            if (a == b) {

                return a;
            } else if (a > b) {
                System.out.println("Много");
                return scan.nextInt();

            } else {
                System.out.println("Мало");
                return scan.nextInt();
            }
        }
        return b;
    }
}

