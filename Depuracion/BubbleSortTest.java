package Depuracion;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {
    @Test
    void testBubbleSort() {
        BubbleSort sorter = new BubbleSort();
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        int[] expected = { 11, 12, 22, 25, 34, 64, 90 };
        sorter.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }
}