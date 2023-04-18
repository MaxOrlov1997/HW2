package ua.orlov.hw10;

public class Aspirant extends Student {

   @Override
    public  double getScholarship(double avaregeMark) {

        if (avaregeMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}
