package ua.orlov.hw17;

import lombok.SneakyThrows;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(processDates());
    }

    @SneakyThrows
    private static boolean processDates() {
        List<String> stringDate = new ArrayList<>();
        stringDate.add("1997/03/29");
        stringDate.add("2023/01/01");
        stringDate.add("2001/06/09");
        stringDate.add("2022/09/19");
        SimpleDateFormat format = new SimpleDateFormat();
        List<Date> resultDate = new ArrayList<>();
        for (String dateString : stringDate) {
            format.applyPattern("yyyy/MM/dd");
            Date date = format.parse(dateString);
            resultDate.add(date);
        }
        Date year = format.parse("2022/12/31");
        return resultDate.stream().anyMatch(year::before);
    }
}
