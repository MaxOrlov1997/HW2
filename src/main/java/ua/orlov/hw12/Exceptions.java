package ua.orlov.hw12;

import java.util.concurrent.ThreadLocalRandom;

public class Exceptions {
    static int test = ThreadLocalRandom.current().nextInt(0, 4);

    public Exceptions(int test) {
        this.test = test;
    }

    public static void main(String[] args) {
        try {
            if (test == 0) {
                FirstExtend.firstExtend();
            }
            if (test == 2) {
                LastExtend.lastExtend();
            }
            if (test == 3) {
                SecondExtend.secondExtend();
            }
        } catch (Exception a) {
            System.out.println(a);
        }
    }
}

class FirstExtend extends Exceptions {
    public FirstExtend(int test) {
        super(test);
    }

    public static void firstExtend() throws Exception {
        throw new Exception("Тут ноль");
    }
}

class SecondExtend extends Exceptions {
    public SecondExtend(int test) {
        super(test);
    }

    public static void secondExtend() throws Exception {
        throw new Exception("Тут три");
    }
}

class LastExtend extends Exceptions {
    public LastExtend(int test) {
        super(test);
    }

    public static void lastExtend() throws Exception {
        throw new Exception("Тут два");
    }
}
