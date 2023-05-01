package ua.orlov.hw10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStudent {


    @Test
    public void testStudent() {
        Student student = new Student();
        Assertions.assertEquals(100, student.getScholarship());
    }

    @Test
    public void testStudentMynum() {
        Student student = new Student();
        student.avaregeMark = 4.5;
        Assertions.assertEquals(80, student.getScholarship());
    }
}

class TestAspirant {
    @Test
    public void testAspirantMynum() {
        Student student = new Aspirant();
        student.avaregeMark = 4.5;
        Assertions.assertEquals(180, student.getScholarship());
    }

    @Test
    public void testAspirant() {
        Student student = new Aspirant();
        Assertions.assertEquals(200, student.getScholarship());
    }
}
