package ua.orlov.hw10;

public class Student {
    String firstName = "Max";
    String lastName = "Orlov";
    String group = "Onl 6 java";
    double avaregeMark = 5.0;


    public  double getScholarship(double avaregeMark) {

        if (avaregeMark == 5.0) {
            return 100;
        } else {
            return 80;
        }
    }
}

