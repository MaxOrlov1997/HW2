package ua.orlov.hw4;

/*• Заполнить одномерный массив случайными целочисленными значениями.
• Проверить сколько простых чисел присутствует в массиве. Размер массива 1000 элементов.*/
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; array.length > i; i++) {
            array[i] = (int) (Math.random() * 11);
        }

        System.out.println(primeNumber(array));
    }

    public static int primeNumber(int[] array) {
        int primeNum = 0;
        int num;
        for (int i = 0; i < array.length; i++) {
            num = array[i];
            if (num == 2) {
                ++primeNum;
            } else {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        break;
                    } else if (num == (j + 1)) {
                        ++primeNum;
                    }
                }
            }
        }
        return primeNum;
    }
}