package ua.orlov.orlov.hw3;

import java.util.Scanner;

/*2. Удалить из строки пробелы и определить, является ли она перевертышем (палиндромом)*/
public class Task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        text = text.replaceAll("\\s", "");
        System.out.println(isPalindrome(text));
    }

    public static boolean isPalindrome(String text) {
        String word = "";
        for (int i = text.length(); i > 0; --i) {
            word += text.charAt(i - 1);
        }
        boolean isPalindrome = text.equals(word);
        return isPalindrome;
    }
}