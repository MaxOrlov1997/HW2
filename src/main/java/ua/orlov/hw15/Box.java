package ua.orlov.hw15;

import java.util.*;

public class Box {
    private static List<Integer> volume = new ArrayList<>();

    public static void main(String[] args) {
        volume.add(12);
        volume.add(18);
        volume.add(15);
        volume.add(17);
        volume.add(0);
        TreeSet<Integer> tr = new TreeSet<>();
        ListIterator<Integer> it = volume.listIterator();
        while (it.hasNext()){
            tr.add(it.next());
        }
        if(tr.first()==0){
        Integer first = tr.pollFirst();}
        TreeSet<Integer> t = (TreeSet<Integer>) tr.descendingSet();

        System.out.println(t);
    }
}
