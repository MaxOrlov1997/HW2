package ua.Orlov.HW4;

/*• Заполнить одномерный массив случайными целочисленными значениями.
• Проверить сколько составных чисел присутствует в массиве. Размер массива 1000 элементов.*/
public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[1000];

        for (int i = 0; 1000 > i; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        PrinaA(array);
    }

    public static void PrinaA(int[] array) {
        int num;
        for (int i = 0; i < 1000; i++) {
            num = array[i];
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    System.out.println(num);
                    break;
                }
            }
        }
    }
}




