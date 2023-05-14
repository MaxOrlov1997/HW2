package ua.orlov.hw17;

import lombok.SneakyThrows;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(date());
    }

    @SneakyThrows
    private static boolean date() {
        List<String> list = new ArrayList<>();
        List<Date> list1 = new ArrayList<>();
        list.add("1997/03/29");
        list.add("2023/01/01");
        list.add("2001/06/09");
        list.add("2022/09/19");
        SimpleDateFormat format = new SimpleDateFormat();
        for (String s : list) {
            format.applyPattern("yyyy/MM/dd");
            Date date = format.parse(s);
            list1.add(date);
        }
        Date year = format.parse("2022/12/31");
        return list1.stream().anyMatch(year::before);
    }
}
