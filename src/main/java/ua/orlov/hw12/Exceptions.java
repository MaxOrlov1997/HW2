package ua.orlov.hw12;

import java.util.concurrent.ThreadLocalRandom;

class Exception extends Throwable {

    public static void main(String[] args) {
        try {
            exceptionAll();
        } catch (FirstException | LastException | SecondException exceptionMetod) {
            System.out.println(exceptionMetod);
        }
    }

    public static void exceptionAll() throws FirstException, LastException, SecondException {
        int random = ThreadLocalRandom.current().nextInt(1, 4);
        if (random == 1) {
            throw new FirstException();
        }
        if (random == 2) {
            throw new SecondException();
        }
        if (random == 3) {
            throw new LastException();
        }
    }
}