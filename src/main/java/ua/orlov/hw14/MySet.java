package ua.orlov.hw14;

import java.util.Arrays;

public class MySet<T> {
    private T[] generic;

    public MySet(int size) {
        this.generic = (T[]) new Object[size];
    }


    public void add(T number) {
        for (int i = 0; i < generic.length; i++) {
            if (generic[i] == number) {
                System.out.println("Есть такой елемент " + number);
                return;
            }
            if (generic[i] == null) {
                generic[i] = number;
                return;
            }
        }
    }

    public T get(int index) {
        return generic[index];
    }

    public static void main(String[] args) {
        MySet<Object> mySet = new MySet(3);
        mySet.add(5);
        mySet.add(3);
        mySet.add(2);
        mySet.add(2);
        System.out.println(mySet.generic.length);
        System.out.println(mySet.get(0));
        System.out.println(mySet.toString());
    }

    @Override
    public String toString() {
        return "MySet{" +
                "generic=" + Arrays.toString(generic) +
                '}';
    }
}
