package ua.orlov.hw4;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1test {

    @Test
    void testAverageGeometricsum() {
        double[] array = {12, 12, 15};
        Assertions.assertEquals(13, Task1.average(array));
        Assertions.assertEquals(12.9266081401913, Task1.geometricSum(array));
    }
    @Test
    void testInvalidsum() {
        double[] array = {17, 11, 15};
        Assertions.assertEquals(13, Task1.average(array));
        Assertions.assertEquals(12.9266081401913, Task1.geometricSum(array));
    }
}
