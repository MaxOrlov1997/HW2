package ua.orlov.hw12;

import java.util.concurrent.ThreadLocalRandom;

public class Task3 {
    static int test = ThreadLocalRandom.current().nextInt(0, 4);

    public Task3(int test) {
        this.test = test;
    }

    public static void main(String[] args) {
        otherExtend();
        if (otherExtend() == null) {
            System.out.println(test);
        } else {
            System.out.println(otherExtend());
        }
    }

    private static Exception otherExtend() {
        try {
            FirstExtend.firstExtend();
            SecondExtend.secondExtend();
            LastExtend.lastExtend();
        } catch (Exception a) {
            return a;
        }
        return null;
    }
}

class FirstExtend extends Task3 {
    public FirstExtend(int test) {
        super(test);
    }

    public static void firstExtend() throws Exception {
        if (test == 0) {
            throw new Exception("Тут ноль");
        }
    }
}

class SecondExtend extends Task3 {
    public SecondExtend(int test) {
        super(test);
    }

    public static void secondExtend() throws Exception {
        if (test == 3) {
            throw new Exception("Тут три");
        }
    }
}

class LastExtend extends Task3 {
    public LastExtend(int test) {
        super(test);
    }

    public static void lastExtend() throws Exception {
        if (test == 2) {
            throw new Exception("Тут два");
        }
    }
}
