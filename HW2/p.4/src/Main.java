import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        boolean res = Math.abs(num1)>Math.abs(num2) ? true : false;
        boolean res1 = Math.abs(num1)>Math.abs(num3) ? true : false;
        if (res==res1) {
            System.out.println(num1);
        }
         else { System.out.println((Math.abs(num2)> Math.abs(num3))? num2:num3);}

        print(num2);

    }

    public static void print(int num2) {
        System.out.println(num2);
    }
}