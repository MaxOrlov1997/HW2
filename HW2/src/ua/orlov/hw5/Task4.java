package ua.orlov.hw5;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*4. Удаление из массива k-го элемента со сдвигом всех расположенных справа от него
элементов на одну позицию влево.
*Необходимо создать новый массив, в котором удаляется элемент и вернуть его из метода.
Изначальный массив не должен измениться
[1, 2, 3, 4] -> [1, 2, 4]*/
public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        printArray(array);
        int[] removeds = removed(array, k);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(removeds));
    }
    public static int[] printArray(int[] arrays) {
        for (int j = 0; j < arrays.length; j++) {
            arrays[j] = ThreadLocalRandom.current().nextInt(0, 10);
        }
        return arrays;
    }
    public static int[] removed(int[] array, int k) {
        int num = 0;
        int[] rev1 = Arrays.copyOfRange(array, 0, k - 1);
        int[] rev2 = Arrays.copyOfRange(array, k, array.length);
        int[] recSum = new int[rev1.length + rev2.length];
        for (int i = 0; i < rev1.length; i++) {
            recSum[i] = rev1[i];
            num++;
        }
        for (int j = 0; j < rev2.length; j++) {
            recSum[num] = rev2[j];
            num++;
        }
        return recSum;
    }
}