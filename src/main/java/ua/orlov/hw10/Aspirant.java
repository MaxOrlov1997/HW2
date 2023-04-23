package ua.orlov.hw10;

public class Aspirant extends Student {
    String work = "Scientific work";

    @Override
    public String toString() {
        return "Aspirant{" +
                "work='" + work + '\'' +
                '}';
    }

    @Override
    public double getScholarship() {
        if (avaregeMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }

    public void getScientificWork() {
        System.out.println(work);
    }
}
