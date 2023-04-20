package ua.orlov.hw10;

public class Student {
    String firstName = "Max";
    String lastName = "Orlov";
    String group = "Java onl 6";
    double avaregeMark = 5.0;

    public Student(String firstName, String lastName, String group, double avaregeMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.avaregeMark = avaregeMark;
    }

    public Student() {

    }

    public double getScholarship(double avaregeMark) {
        if (avaregeMark == 5.0) {
            return 100;
        } else {
            return 80;
        }
    }
}

