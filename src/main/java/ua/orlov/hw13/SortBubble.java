package ua.orlov.hw13;

import java.util.Arrays;

public class SortBubble {

    int[] sortBubble(int[] array) {
        int[] arrays = Arrays.copyOf(array, array.length);
        int flag = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length - i - 1; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    int res = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = res;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        return arrays;
    }

    int[] quickSort(int arrays[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arrays, begin, end);
            quickSort(arrays, begin, partitionIndex - 1);
            quickSort(arrays, partitionIndex + 1, end);
        }
        return arrays;
    }

    private int partition(int arrays[], int begin, int end) {
        int pivot = arrays[end];
        int i = (begin - 1);
        for (int j = begin; j < end; j++) {
            if (arrays[j] <= pivot) {
                i++;
                int swapTemp = arrays[i];
                arrays[i] = arrays[j];
                arrays[j] = swapTemp;
            }
        }
        int swapTemp = arrays[i + 1];
        arrays[i + 1] = arrays[end];
        arrays[end] = swapTemp;
        return i + 1;
    }
}
