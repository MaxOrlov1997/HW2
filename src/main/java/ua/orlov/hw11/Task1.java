package ua.orlov.hw11;

import ua.orlov.hw10.Aspirant;
import ua.orlov.hw10.Student;

public class Task1 {

    public static void main(String[] args) {
        Student student = new Student();
        Aspirant aspirant = new Aspirant();
        boolean a = student.firstName.equals(aspirant.firstName);
        boolean b = aspirant.firstName.equals(student.firstName);
        int x = student.firstName.hashCode();
        int y = aspirant.firstName.hashCode();
        boolean z = (x==y && y==x);
        System.out.println(a);
        System.out.println(b);
        System.out.println(x + " " + y);
        System.out.println(z);
    }
}
