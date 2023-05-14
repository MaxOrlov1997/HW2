package ua.orlov.hw17;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(sort());
    }
    private static String sort(){
        String[] vords = {"Ababa", "grds", "rthp", "Vova"};
       return Arrays.stream(vords).sorted().collect(Collectors.joining(" "));
    }
}
