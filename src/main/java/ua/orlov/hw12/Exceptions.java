package ua.orlov.hw12;

import java.util.concurrent.ThreadLocalRandom;

class Exception {
    static int test = ThreadLocalRandom.current().nextInt(1, 4);

    public static void main(String[] args) {
        try {
           rundom();
        } catch (IllegalAccessError a) {
            System.out.println(a);
        }
    }
    static void rundom(){
        if (test == 1) {
            FirstExtend.firstExtend();
        }
        if (test == 2) {
            LastExtend.lastExtend();
        }
        if (test == 3) {
            SecondExtend.secondExtend();
        }
    }
}