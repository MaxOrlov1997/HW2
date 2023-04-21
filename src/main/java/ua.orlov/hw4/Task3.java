package ua.orlov.hw4;

/*• Заполнить одномерный массив случайными целочисленными значениями.
• Проверить сколько составных чисел присутствует в массиве. Размер массива 1000 элементов.*/
public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[1000];

        for (int i = 0; array.length > i; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        int compNum = 0;
        compositeNumber(array, compNum);
        System.out.println(compositeNumber(array, compNum));
    }

    public static int compositeNumber(int[] array, int compNum) {
        int num;
        for (int i = 0; i < array.length; i++) {
            num = array[i];
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    ++compNum;
                    break;
                }
            }
        }
        return compNum;
    }
}




