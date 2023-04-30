package ua.orlov.hw13;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SortBubbletest {
    @Test
    public void sortBubbletest() {
        SortBubble sortBubble = new SortBubble();
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, sortBubble.sortBubble(new int[]{2, 5, 1, 6, 4, 3}));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, sortBubble.sortBubble(new int[]{2, 5, 1, 6, 4, 3}));
    }

    @Test
    public void sortBubbletestempy() {
        SortBubble sortBubble = new SortBubble();
        Assert.assertArrayEquals(new int[]{}, sortBubble.sortBubble(new int[]{}));
        Assert.assertArrayEquals(new int[]{}, sortBubble.sortBubble(new int[]{}));
    }
}
