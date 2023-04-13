package ua.orlov.hw5;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Practice2test {
    @Test
    void testHeightmenwomen(){
        int[] array = {-168,-192,157,-187,162};
        Assertions.assertEquals(182.33333333333334, Practice2.sumMenHeight(array));
        Assertions.assertEquals(159.5, Practice2.sumWomenHeight(array));
    }
    @Test
    void testInvalidHeightmenwomen(){
        int[] array = {168,192,-157,187,162};
        Assertions.assertEquals(182.33333333333334, Practice2.sumMenHeight(array));
        Assertions.assertEquals(159.5, Practice2.sumWomenHeight(array));
    }
    @Test
    void testEmptymenwomen(){
        int[] array = {};
        Assertions.assertEquals(182.33333333333334, Practice2.sumMenHeight(array));
        Assertions.assertEquals(159.5, Practice2.sumWomenHeight(array));
    }
}
