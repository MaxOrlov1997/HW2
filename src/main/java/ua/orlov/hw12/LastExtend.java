package ua.orlov.hw12;

public class LastExtend extends Exception {

    public static void lastExtend() throws IllegalAccessError {
        throw new IllegalAccessError("Тут два");
    }
}
