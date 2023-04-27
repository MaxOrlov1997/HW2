package ua.orlov.hw12;

public class Task2 {

    public static void main(String[] args){
        try {
            f();
        } catch (Exception a) {
            System.out.println(a);
        }
        try {
            g();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void f() throws Exception {
        try {
            g();
        } catch (Exception e) {

            throw new Exception("2");
        }
    }

    private static void g() throws Exception {
        throw new Exception("1");
    }
}

