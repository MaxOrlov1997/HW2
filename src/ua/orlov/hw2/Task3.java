package ua.orlov.hw2;

public class Task3 {

    public static void main(String[] args) {
        int num = 10;
evenNum(num);
        System.out.println(num);
    }
    public static int evenNum(int even){
      if (even%2==0){
          System.out.println("Четное");
          return even;
      }
      else
          System.out.println("Не четное");
return even;
    }
}