package ua.orlov.hw10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestStudentAspirant {
    double num = 4.5;

    @Test
    public void testStudent() {
        Student student = new Student();
        Assertions.assertEquals(100, student.getScholarship(student.avaregeMark));
    }

    @Test
    public void testStudentinvalid() {
        Student student = new Student();
        Assertions.assertEquals(100, student.getScholarship(student.avaregeMark));
    }

    @Test
    public void testStudentMynum() {
        Student student = new Student();
        Assertions.assertEquals(80, student.getScholarship(num));
    }

    @Test
    public void testAspirantMynum() {
        Student student = new Aspirant();
        Assertions.assertEquals(180, student.getScholarship(num));
    }
}
