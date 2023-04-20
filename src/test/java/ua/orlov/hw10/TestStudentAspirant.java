package ua.orlov.hw10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStudentAspirant {


    @Test
    public void testStudent(){
        Student student = new Student();
        Assertions.assertEquals(100, student.getScholarship(student.avaregeMark) );
    }
    @Test
    public void testStudentinvalid(){
        Student student = new Student();
        Assertions.assertEquals(70, student.getScholarship(student.avaregeMark) );
    }
    @Test
    public void testStudentMynum(){
        Student student = new Student();
        double num= 4.5;
        Assertions.assertEquals(70, student.getScholarship(num) );
    }
    @Test
    public void testAspirantMynum(){
        Student student = new Aspirant();
        double num= 4.5;
        Assertions.assertEquals(180, student.getScholarship(num) );
    }
}
