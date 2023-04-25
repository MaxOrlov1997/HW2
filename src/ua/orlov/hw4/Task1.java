package ua.orlov.hw4;

/*• Заполнить одномерный массив случайными целочисленными значениями.
• Найти среднее арифметическое и среднее геометрическое элементов массива. Размер массива -
400 элементов.
P.S. значения элементов можно ограничить значениями 1-10 включительно.*/
public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[400];
        for (int i = 0; 400 > i; i++) {
            array[i] = (int) (Math.random() * 200);
        }
        int sum = 0;
        double geometric = 0;
        average(array, sum);
        geometricSum(array, geometric);
        System.out.println(average(array, sum));
        System.out.println(geometricSum(array, geometric));
    }

    public static int average(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            if (i == (array.length - 1)) {
                sum = sum / array.length;
            } else {
                sum += array[i];
            }
        }
        return sum;
    }

    public static double geometricSum(int[] array, double geometric) {
        for (int i = 0; i < array.length; i++)
            if (i == (array.length - 1)) {
                geometric = Math.pow(geometric, 1 / array.length);
            } else {
                geometric += array[i];
            }
        return geometric;
    }
}
