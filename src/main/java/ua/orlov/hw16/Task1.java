package ua.orlov.hw16;
/*Реализовать метод, принимающий список строк и возвращающий Map,
где ключ - строка, значение - количество букв в строке.
Покрыть код тестами. Проверка через main не нужна.
Пример:
[“тут”, “там”, “стол”] ->[ {“тут”, 3}, {“там”, 3}, {“стол”, 4}]*/

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {
    public static Map newMap(List<String> list) {
        Map<String, Integer> result = new HashMap<>();
        for (String s : list) {
            result.put(s, s.length());
        }
        return result;
    }
}


