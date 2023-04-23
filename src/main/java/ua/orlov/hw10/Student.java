package ua.orlov.hw10;

import java.util.Objects;

public class Student {
   public String firstName = "Max";
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

    public double getScholarship() {
        if (avaregeMark == 5.0) {
            return 100;
        } else {
            return 80;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.avaregeMark, avaregeMark) == 0 && firstName.equals(student.firstName) && lastName.equals(student.lastName) && group.equals(student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, group, avaregeMark);
    }
}

