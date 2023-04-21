package ua.orlov.orlov.hw3;

import java.util.Scanner;

/*3. Подсчитать количество слов в строке
• Вводится строка, состоящая из слов, разделенных пробелами. Требуется посчитать количество
слов в ней.*/
public class Task3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var line = scan.nextLine();
        System.out.println(countWord(line));
    }

    public static int countWord(String line) {
        int amount = 0;
        int numLenght = line.length();
        for (int i = 1; line.length() > i; i++) {
            if (line.charAt(i) == ' ' && line.charAt(i - 1) != ' ') {
                ++amount;
            } else if (((line.charAt(i - 1) == ' ' && line.charAt(numLenght - 1) != ' ') || (line.charAt(i) != ' ' && line.charAt(numLenght - 1) != ' ')) && numLenght == i + 1) {
                ++amount;
            } else if (line.isBlank()) {
                return amount;
            }
        }
        return amount;
    }

}



