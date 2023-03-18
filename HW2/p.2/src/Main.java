import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Ax = sc.nextInt();
        int Ay = sc.nextInt();
        int Bx = sc.nextInt();
        int By = sc.nextInt();
        int Cx = sc.nextInt();
        int Cy = sc.nextInt();
        int h = Math.abs(Ax - Bx);
        int a = Math.abs(Cy - By);
        int S = h * a;
    print (S);
    }
    public static void print (int S ) {

        System.out.println(S);
    }
}