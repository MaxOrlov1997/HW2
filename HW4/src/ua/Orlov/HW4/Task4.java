package ua.Orlov.HW4;

/*• Заполнить одномерный массив случайными целочисленными значениями.
• Все четные значения заменить на нули. Размер массива - 2000 элементов.*/
public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[2000];
        for (int i = 0; i < 2000; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        PrintA(array);

    }

    public static void PrintA(int[] array) {
        for (int i = 0; i < 2000; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
                System.out.println(array[i]);
            } else {
                System.out.println(array[i]);
            }
        }
    }
}
