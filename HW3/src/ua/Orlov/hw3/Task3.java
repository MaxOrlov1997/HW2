package ua.Orlov.hw3;


import java.util.Scanner;

/*3. Подсчитать количество слов в строке
• Вводится строка, состоящая из слов, разделенных пробелами. Требуется посчитать количество
слов в ней.*/
public class Task3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int amount = 0;
        System.out.println(word(line, amount));
    }

    public static int word(String line, int amount) {

        for (int i = 1; line.length() > i; i++) {
            if (line.charAt(i) == ' ' && line.charAt(i - 1) != ' ') {
                ++amount;
            } else if (line.isBlank()) {
                return amount;

            }
        }
        return ++amount;
    }
}
