package ua.orlov.hw13;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        SortBubble sortBubble = new SortBubble();
        long start = System.nanoTime();
        sortBubble.sortBubble(sortBubble.array);
        long finish = System.nanoTime();
        long res = finish-start;
        System.out.println(Arrays.toString(sortBubble.sortBubble(sortBubble.array)));
        System.out.println(res);
        long startQuick = System.nanoTime();
        sortBubble.quickSort(sortBubble.array,1,sortBubble.array.length-1);
        long finishQuick = System.nanoTime();
        long resQuick = finishQuick-startQuick;
        System.out.println(resQuick);
        System.out.println(Arrays.toString(sortBubble.quickSort(sortBubble.array, 1,sortBubble.array.length-1)));
    }
}
