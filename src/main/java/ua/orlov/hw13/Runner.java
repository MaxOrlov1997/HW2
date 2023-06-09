package ua.orlov.hw13;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        SortBubble sortBubble = new SortBubble();
        int[] array = {5,3,4,2,1,6};
        long start = System.nanoTime();
        int[] resBubble = sortBubble.sortBubble(array);
        long finish = System.nanoTime();
        long res = finish - start;
        System.out.println(Arrays.toString(resBubble));
        System.out.println("Sort bubble - " + res);

        long startQuick = System.nanoTime();
        int[] resQuickBubble = sortBubble.quickSort(array, 0, array.length - 1);
        long finishQuick = System.nanoTime();
        long resQuick = finishQuick - startQuick;
        System.out.println("Quick sort - " + resQuick);
        System.out.println(Arrays.toString(resQuickBubble));

        BinarySearch ob = new BinarySearch();
        int arr[] = {1,2,3,4,5,6};
        int x = 5;
        long startBinary = System.nanoTime();
        int result = ob.binarySearch(arr, x);
        long finishBinary = System.nanoTime();
        long resBinary = finishBinary - startBinary;
        if (result == -1) {
            System.out.println(
                    "Element is not present in array");
        } else
            System.out.println("Binary Search element - " + result);
        System.out.println("Binary Search - " + resBinary);

        long startLinear = System.nanoTime();
        int resLinear = ob.linearSearch(arr, 4);
        long finishLinear = System.nanoTime();
        long restimeLinear = finishLinear - startLinear;
        System.out.println("Linear Search - " + resLinear);
        System.out.println(restimeLinear);
    }
}
