package ua.orlov.hw15;

import java.util.*;

public class Box {
    private Integer volume;

    public Box(Integer volume) {
        this.volume = volume;
    }

    int getAge() {
        return volume;
    }

    @Override
    public String toString() {
        return "Box{" +
                "volume=" + volume +
                '}';
    }

    public static void main(String[] args) {
        Comparator<Box> comparator = new Boxvolume();
        TreeSet<Box> tr = new TreeSet<>(comparator);
        tr.add(new Box(12));
        tr.add(new Box(15));
        tr.add(new Box(18));
        tr.add(new Box(11));
        tr.add(new Box(0));
        System.out.println(tr);

    }
}

class Boxvolume implements Comparator<Box> {
    public int compare(Box a, Box b) {

        if (a.getAge() == 0)
            return -1;
        if (b.getAge() == 0)
            return -1;
        if (a.getAge() > b.getAge())
            return -1;
        if (a.getAge() < b.getAge())
            return 1;
        else
            return 0;
    }
}

