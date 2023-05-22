package ua.orlov.hw18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*Реализовать программу которая считывает текст с консоли и строит CSV файл.
● Если пользователь ввел next то происходит переход строки
● Если пользователь вводит end то программа завершается*/
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("NewFileTask1HW18.csv");
        PrintWriter printInFile = new PrintWriter(file);
        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            String textUser = scanner.next();
            if (textUser.equals("next")) {
                printInFile.print(",");
                printInFile.println(" ");
            } else if (textUser.equals("end")) {
                printInFile.close();
                break;
            } else {
                printInFile.print(textUser);
            }
        }
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
