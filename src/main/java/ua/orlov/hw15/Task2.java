package ua.orlov.hw15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2 {
    private static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        numbers.add(12);
        numbers.add(55);
        numbers.add(22);
        numbers.add(77);
        numbers.add(99);
        System.out.println("Сумма элементов " + getSum());
        System.out.println("Список нечетных чисел " + getOddNumber());
        System.out.println("Новый список строк " + convertToStringList());
        System.out.println("Дублирует строки " + doubling());
    }

    private static Integer getSum() {
        if (numbers.isEmpty()) {
            return null;
        }
        Integer m = 0;
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            m += it.next();
        }
        return m;
    }

    private static List<Integer> getOddNumber() {
        if (numbers.isEmpty()) {
            return null;
        }
        List<Integer> num = new ArrayList<>();
        Integer m = 0;
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            m = it.next();
            if (m % 2 != 0) {
                num.add(m);
            }
        }
        return num;
    }

    private static List<String> convertToStringList() {
        if (numbers.isEmpty()) {
            return null;
        }
        List<String> strings = new ArrayList<>();
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            strings.add(String.valueOf(it.next()));
        }
        return strings;
    }

    private static List<String> doubling() {
        if (numbers.isEmpty()) {
            return null;
        }
        List<String> doubl = new ArrayList<>();
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            String now = String.valueOf(it.next());
            doubl.add(now + now);
        }
        return doubl;
    }
}
