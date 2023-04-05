package ua.orlov.hw4;

/*• Заполнить одномерный массив случайными целочисленными значениями.
• Проверить сколько составных чисел присутствует в массиве. Размер массива 1000 элементов.*/
public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[1000];

        for (int i = 0; array.length > i; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        compositeNumber(array);
    }

    public static void compositeNumber(int[] array) {
        int num;
        int compNum = 0;
        for (int i = 0; i < array.length; i++) {
            num = array[i];
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    ++compNum;
                    break;
                }
            }
        }
        System.out.println(compNum);
    }
}




