package ua.orlov.hw14;

import java.util.Arrays;

public class MySet<T> {
    Integer size;
    private T[] generic = (T[]) new Integer[]{3, 4, 5};

    public MySet(T[] generic) {
        this.generic = generic;
    }

    public MySet(Integer size) {
        this.size = size;
    }

    public MySet() {

    }

    public void add(T number) {
        for (int i = 0; i < generic.length; i++) {
            if (generic[i]==number){
                return;
            }}
        if (size > generic.length-1) {
            generic[generic.length] = number;
        }
    }

    public T get(int index) {
        return generic[index];
    }
    public String toString() {
        return Arrays.toString(generic);
    }

    public static void main(String[] args) {
        MySet<Integer> mySet = new MySet();
        mySet.size=4;
        mySet.add(2);
        System.out.println(mySet.generic.length);
        System.out.println(mySet.get(0));
        System.out.println(mySet.toString());
    }
}
