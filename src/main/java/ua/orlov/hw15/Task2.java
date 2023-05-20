package ua.orlov.hw15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(55);
        numbers.add(22);
        numbers.add(77);
        numbers.add(99);
        System.out.println("Сумма элементов " + getSum(numbers));
        System.out.println("Список нечетных чисел " + getOddNumber(numbers));
        System.out.println("Новый список строк " + convertToStringList(numbers));
        System.out.println("Дублирует строки " + doubling(numbers));
    }

    public static Integer getSum(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        int sumElementNumbers = 0;
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            sumElementNumbers += it.next();
        }
        return sumElementNumbers;
    }

    public static List<Integer> getOddNumber(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return Collections.emptyList();
        }
        List<Integer> num = new ArrayList<>();
        Integer listOddNumbers = 0;
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            listOddNumbers = it.next();
            if (listOddNumbers % 2 != 0) {
                num.add(listOddNumbers);
            }
        }
        return num;
    }

    public static List<String> convertToStringList(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return Collections.emptyList();
        }
        List<String> strings = new ArrayList<>();
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            strings.add(String.valueOf(it.next()));
        }
        return strings;
    }

    public static List<String> doubling(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return Collections.emptyList();
        }
        List<String> doubl = new ArrayList<>();
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            String copyOfNumbers = String.valueOf(it.next());
            doubl.add(copyOfNumbers + copyOfNumbers);
        }
        return doubl;
    }
}
