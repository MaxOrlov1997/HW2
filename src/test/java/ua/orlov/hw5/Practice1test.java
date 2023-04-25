package ua.orlov.hw5;

import org.junit.Assert;
import org.junit.Test;

public class Practice1test {
    @Test
    public void testSumGoods() {
        int[] array = {990, 1001, 1200, 999};
        Assert.assertEquals(2201, Practice1.sumGoodsWithPriceOverThousand(array));
    }

    @Test
    public void testSum() {
        int[] array = {990, 820, 120, 902};
        Assert.assertEquals(0, Practice1.sumGoodsWithPriceOverThousand(array));
    }

    @Test
    public void testNotSumGoods() {
        int[] array = {};
        Assert.assertEquals(0, Practice1.sumGoodsWithPriceOverThousand(array));
    }
}
