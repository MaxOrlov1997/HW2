package ua.orlov.hw17;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        String[] vords = {"Ababa", "grds", "rthp", "Vova"};
        System.out.println(sort(vords));
    }
    private static String sort(String[] vords){
       return Arrays.stream(vords).sorted().collect(Collectors.joining(" "));
    }
}
