package ua.orlov.hw5;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/*3. Дан двумерный массив NxN(количество строк = количество столбцов), написать программу
которая поменяет местами столбцы и строки.
*Необходимо создать новый массив, в котором выполняются превращения и вернуть его из метода.
Изначальный массив не должен измениться*/
public class Task3 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4},
                {3, 4, 5, 6},
                {5, 6, 7, 8},
                {7, 9, 9, 9}};
        // printArray(array);
        System.out.println(Arrays.deepToString(array));
        printrevArray(array);
        System.out.println(Arrays.deepToString(printrevArray(array)));
    }

    /*  public static int[][] printArray(int[][] arrays) {
          for (int j = 0; j < arrays.length; j++) {
              for (int i = 0; i < arrays[j].length; i++) {
                  arrays[j][i] = ThreadLocalRandom.current().nextInt(0, 10);
              }
          }
          return arrays;
      }*/
// оставлю на случай если нужно елементы задавать рандомные
    public static int[][] printrevArray(int[][] revArrays) {
        int[][] revArray = Arrays.copyOf(revArrays, revArrays.length);
        int[][] originalArray = new int[revArray.length][revArray.length];
        for (int j = 0; j < revArray.length; j++) {
            for (int i = 0; i < revArray[j].length; i++) {

                originalArray[j][i] = revArray[i][j];
            }
        }
        return originalArray;
    }
}
