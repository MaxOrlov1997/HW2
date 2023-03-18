import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        print(num);
    }

    public static void print(int num) {
        System.out.println(num);
        System.out.println((num % 2 == 0) ? "четное" : "нечетное");
    }


}

