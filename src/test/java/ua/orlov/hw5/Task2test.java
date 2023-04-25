package ua.orlov.hw5;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2test {
    @Test
    void testSortcheck() {
        int[] array = {4, 3, 2};
        Assert.assertTrue(Task2.sortArray(array));
    }

    @Test
    void testNotsortedcheck() {
        int[] array = {2, 5, 1};
        Assert.assertFalse(Task2.sortArray(array));
    }

    @Test
    void testSamevalues() {
        int[] array = {1, 1, 1};
        Assertions.assertTrue(Task2.sortArray(array));
    }

    @Test
    void testEmptyInput() {
        int[] array = {};
        Assertions.assertTrue(Task2.sortArray(array));
    }
}
