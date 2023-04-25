package ua.orlov.hw5;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Practice2test {
    @Test
    void testHeightmenwomen() {
        int[] array = {-168, -192, 157, -187, 162};
        Assertions.assertEquals(182.33333333333334, Practice2.sumMenHeight(array));
        Assertions.assertEquals(159.5, Practice2.sumWomenHeight(array));
    }

    @Test
    void testWomen() {
        int[] array = {168, 168, 168};
        Assertions.assertEquals(168, Practice2.sumWomenHeight(array)); // только для положительных
    }

    @Test
    void testMen() {
        int[] array = {-168, -168, -168};
        Assertions.assertEquals(168, Practice2.sumMenHeight(array)); // только для отрицательных

    }
}
