package ua.orlov.hw4;

/*• Заполнить одномерный массив случайными целочисленными значениями.
• Найти среднее арифметическое и среднее геометрическое элементов массива. Размер массива -
400 элементов.
P.S. значения элементов можно ограничить значениями 1-10 включительно.*/
public class Task1 {
    public static void main(String[] args) {
        double[] array = new double[400];
        for (int i = 0; 400 > i; i++) {
            array[i] = (int) (Math.random() * 200);
        }
        System.out.println(average(array));
        System.out.println(geometricSum(array));
    }

    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        sum = sum / array.length;
        return sum;
    }

    public static double geometricSum(double[] array) {
        double geometric = 0;
        for (int i = 0; i < array.length; i++) {
            geometric += array[i];
        }
        geometric = Math.pow(geometric, 1.0 / array.length);
        return geometric;
    }
}
