package ua.orlov.hw13;

public class BinarySearch {

    int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    int linearSearch(int[] array, int namber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == namber) {
                return i;
            }
        }
        return -1;
    }
}
