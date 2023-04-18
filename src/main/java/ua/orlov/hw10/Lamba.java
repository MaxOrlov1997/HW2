package ua.orlov.hw10;
/*Создать функциональный интерфейс Pow с методом pow(int number, int pow),
который принимает 2 параметра:
1 - число которое возводится в степень,
2 - степень в которую возводится число.

Реализовать этот интерфейс в методе main через лямбду (без использования
сторонних пакетов типа Math).*/

 public class Lamba {
      public static void main (String[] args) {
          Pow op = (number, pow) ->{int numstep=1;
              for (int i = 1; i <= pow; i++) {
              numstep *= number;
          } return numstep;};
          int result = op.pow(2, 3);
          System.out.println(result);
      }
}
 interface Pow{
        int pow(int number, int pow);
 }

