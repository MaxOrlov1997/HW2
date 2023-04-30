package ua.orlov.hw13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchtest {
    @Test
    public void testBinary() {
        BinarySearch binarySearch = new BinarySearch();
        Assertions.assertEquals(3, binarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 7));
        Assertions.assertEquals(2, binarySearch.linearSearch(new int[]{1, 3, 5, 7, 8}, 5));
    }

    @Test
    public void testBinarynotsort() {
        BinarySearch binarySearch = new BinarySearch();
        Assertions.assertEquals(3, binarySearch.binarySearch(new int[]{3, 8, 2, 7, 1}, 7));
        Assertions.assertEquals(1, binarySearch.linearSearch(new int[]{3, 8, 2, 7, 1}, 8));
    }

    @Test
    public void testBinaryempy() {
        BinarySearch binarySearch = new BinarySearch();
        Assertions.assertEquals(-1, binarySearch.binarySearch(new int[]{}, 7));
        Assertions.assertEquals(-1, binarySearch.linearSearch(new int[]{}, 8));
    }

    @Test
    public void testBinarynoelement() {
        BinarySearch binarySearch = new BinarySearch();
        Assertions.assertEquals(-1, binarySearch.binarySearch(new int[]{3, 8, 2, 7, 1}, 5));
        Assertions.assertEquals(-1, binarySearch.linearSearch(new int[]{3, 8, 2, 7, 1}, 5));
    }
}
