package ua.orlov.hw16;
/*Реализовать метод, который принимает список строк и возвращает Map с
ключом в виде количества букв в строке и значением - список строк
соответствующей длины.
Покрыть код тестами. Проверка через main не нужна.
Пример:
[“тут”, “там”, “стол”] ->[ {3, [“тут”, “там”]}, {4, [“стол”]}]*/

import java.util.*;

public class Task2 {

    public static Map newMap(ArrayList<String> list) {
        Map<Integer, List<String>> map = new HashMap<>();
        for (String s : list) {
             if (map.containsKey(s.length())) {
            map.put(s.length(), map.get(s.length())).add(s);}
             else {
  //               map.put(s.length(),list.);
             }
            System.out.println(map);
        }
        return map;
    }
}

