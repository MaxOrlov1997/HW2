package ua.orlov.hw11;

import ua.orlov.hw10.Aspirant;
import ua.orlov.hw10.Student;

public class Task1 {

    public static void main(String[] args) {
        Student student = new Student();
        Aspirant aspirant = new Aspirant();
        boolean a = student.equals(aspirant);
        boolean b = aspirant.equals(student);
        int x = student.hashCode();
        int y = aspirant.hashCode();
        boolean z = (x == y && y == x);
        System.out.println("student equals to aspirant: " + a);
        System.out.println("student equals to aspirant: " + b);
        System.out.println(x + " " + y);
        System.out.println("hashCode student equals hashCode aspirant: " + z);
    }
}
