package ua.orlov.hw10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAspirant {
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

