package ua.Orlov.HW4;

/*• Заполнить одномерный массив случайными целочисленными значениями.
• Проверить сколько простых чисел присутствует в массиве. Размер массива 1000 элементов.*/
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[1000];

        for (int i = 0; 1000 > i; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        PrinaA(array);
    }

    public static void PrinaA(int[] array) {
        int num;
        for (int i = 0; i < 1000; i++) {
            num = array[i];
            if (num == 2) {
                System.out.println(num);
            } else {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        break;
                    } else if (num == (j + 1)) {
                        System.out.println(num);
                    }
                }
            }
        }
    }}
