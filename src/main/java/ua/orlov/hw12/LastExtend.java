package ua.orlov.hw12;

public class LastExtend extends Exception {

    public static void lastExtend() throws IllegalArgumentException {
        throw new IllegalArgumentException("Тут два");
    }
}
