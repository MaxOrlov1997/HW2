package ua.orlov.hw14;

import java.util.Arrays;

public class MySet<T> {
    private T[] generic;

    public MySet(T[] generic) {
        this.generic = generic;
    }

    public MySet() {

    }

    public String toString() {
        System.out.println(Arrays.toString(generic));
        return null;
    }

    public <T> T[] add(T number) {
        T[] gener = Arrays.copyOf((T[]) generic, generic.length + 1);
        gener[generic.length] = number;
        int size = generic.length;
        boolean a = Arrays.asList(gener).contains(number);
        System.out.println("Длина - " + size);
        System.out.println("Наличие элемента - " + a);
        System.out.println(Arrays.toString(gener));
        return gener;
    }

    public T get(int index) {
        return generic[index];
    }

    public static void main(String[] args) {
        MySet<Integer> mySet = new MySet();
        mySet.generic = new Integer[]{3, 5, 8};
        mySet.add(2);
        System.out.println(mySet.get(0));
        mySet.toString();
    }
}
