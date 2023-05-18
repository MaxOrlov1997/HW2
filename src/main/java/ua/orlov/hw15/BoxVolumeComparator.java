package ua.orlov.hw15;

import java.util.*;

public class BoxVolumeComparator {
    private double volume;

    public BoxVolumeComparator(Integer volume) {
        this.volume = volume;
    }

    double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Box{" +
                "volume=" + volume +
                '}';
    }

    public static void main(String[] args) {
        Comparator<BoxVolumeComparator> comparator = new BoxVolume();
        TreeSet<BoxVolumeComparator> tr = new TreeSet<>(comparator);
        tr.add(new BoxVolumeComparator(12));
        tr.add(new BoxVolumeComparator(15));
        tr.add(new BoxVolumeComparator(18));
        tr.add(new BoxVolumeComparator(11));
        tr.add(new BoxVolumeComparator(0));
        System.out.println(tr);
    }
}

class BoxVolume implements Comparator<BoxVolumeComparator> {
    public int compare(BoxVolumeComparator a, BoxVolumeComparator b) {
        if (a.getVolume() == 0)
            return -1;
        return Integer.compare((int) b.getVolume(), (int) a.getVolume());
    }
}
