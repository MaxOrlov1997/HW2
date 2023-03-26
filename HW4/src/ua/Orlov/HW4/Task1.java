package ua.Orlov.HW4;

/*• Заполнить одномерный массив случайными целочисленными значениями.
• Найти среднее арифметическое и среднее геометрическое элементов массива. Размер массива -
400 элементов.
P.S. значения элементов можно ограничить значениями 1-10 включительно.*/
public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[400];
        for (int i = 0; 400 > i; i++) {
            array[i] = (int) (Math.random() * (22 + 1)) - 11;
        }

        PrintA (array);}
    public static void PrintA (int[] array) {
        int sum = 0;
        double geometric = 0;
        for (int i = 0; i < 400; i++) {
            if (i == 399) {
                sum = sum / 400;
                geometric = Math.sqrt(geometric);
            } else {
                sum += array[i];
                geometric += array[i];
            }
        }
        System.out.println(sum);
        System.out.println(geometric);


    }
}
