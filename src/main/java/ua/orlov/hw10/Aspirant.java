package ua.orlov.hw10;

public class Aspirant extends Student {
    String work = "Work IT";

    public Aspirant(String firstName, String lastName, String group, double avaregeMark, String work) {
        super(firstName, lastName, group, avaregeMark);
        this.work = work;
    }

    public Aspirant() {

    }

    @Override
    public double getScholarship() {
        if (avaregeMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }

    public String getScientificWork() {
        return work;
    }
}
