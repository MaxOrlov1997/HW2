package ua.orlov.hw16;
/*Реализовать метод, который принимает список строк и возвращает Map с
ключом в виде количества букв в строке и значением - список строк
соответствующей длины.
Покрыть код тестами. Проверка через main не нужна.
Пример:
[“тут”, “там”, “стол”] ->[ {3, [“тут”, “там”]}, {4, [“стол”]}]*/

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {

    public static Map newMap(ArrayList<String> list) {
        Map<Integer, String> map = new LinkedHashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i).length()) == true) {
                map.put(list.get(i).length(), map.get(list.get(i).length()) + " " + list.get(i));
                continue;
            }
            map.put(list.get(i).length(), list.get(i));
        }
        System.out.println(map);
        return map;
    }
}
