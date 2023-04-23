package ua.orlov.hw10;

import java.util.Objects;

public class Aspirant extends Student {
String work = "Scientific work";

    @Override
    public String toString() {
        return "Aspirant{" +
                "work='" + work + '\'' +
                '}';
    }

    @Override
    public double getScholarship(double avaregeMark) {
        if (avaregeMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }

    public void scientificWork() {
        System.out.println(work);;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Aspirant aspirant = (Aspirant) o;
        return work.equals(aspirant.work);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), work);
    }
}
