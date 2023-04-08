package ua.orlov.hw4;

import java.util.Arrays;

/*• Заполнить одномерный массив случайными целочисленными значениями.
• Все четные значения заменить на нули. Размер массива - 2000 элементов.*/
public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[2000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        evenNumbers(array);
        System.out.println(Arrays.toString(array));

    }

    public static int[] evenNumbers(int[] array) {
        int[] arrayCopi = Arrays.copyOf(array, array.length);
        for (int i = 0; i < arrayCopi.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;

            }
        }
        return arrayCopi;
    }
}
