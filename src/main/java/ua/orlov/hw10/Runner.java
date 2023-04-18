package ua.orlov.hw10;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Scholarship student = " + student.getScholarship(student.avaregeMark));
        Student aspirant = new Aspirant();
        System.out.println("Scholarship aspirant = " + aspirant.getScholarship(student.avaregeMark));
        Object[] sTudent = {student.getScholarship(student.avaregeMark), aspirant.getScholarship(student.avaregeMark),
                student.firstName, aspirant.lastName, student.group, aspirant.avaregeMark};
        System.out.println(Arrays.deepToString(sTudent));
    }
}
