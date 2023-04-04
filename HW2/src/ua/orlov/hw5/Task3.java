package ua.orlov.hw5;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
/*3. Дан двумерный массив NxN(количество строк = количество столбцов), написать программу
которая поменяет местами столбцы и строки.
*Необходимо создать новый массив, в котором выполняются превращения и вернуть его из метода.
Изначальный массив не должен измениться*/
public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        printArray(array);
        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.deepToString(printrevArray(array)));
    }
    public static int[][] printArray(int[][] arrays) {
        for (int j = 0; j < arrays.length; j++) {
            for (int i = 0; i < arrays[j].length; i++) {
                arrays[j][i] = ThreadLocalRandom.current().nextInt(0, 50);
            }
        }
        return arrays;
    }
    public static int[][] printrevArray(int[][] revArrays) {
        int numNext = 0;
        int[][] revArray = Arrays.copyOf(revArrays, revArrays.length);
        for (int j = 0; j < revArray.length; j++) {
            for (int i = 0; i < revArray[j].length - numNext; i++) {
                int dop = revArray[j][i];
                revArray[j][i] = revArray[j + 1][i];
                revArray[j +1][i] = dop;
                numNext++;
            }
        }
        return revArrays;
    }
}
