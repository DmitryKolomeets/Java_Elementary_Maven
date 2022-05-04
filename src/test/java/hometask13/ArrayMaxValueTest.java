package hometask13;

import hometask12.Jewels;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayMaxValueTest {

    @Test
    public void sortAscendingThenMax() {

        ArrayMaxValue arrayMaxValue = new ArrayMaxValue();
        int[] nums = {3,4,5,2};
        int actual = arrayMaxValue.sortAscendingThenMax(nums);
        int expected = 12;
        assertEquals(expected, actual);

        ArrayMaxValue arrayMaxValue2 = new ArrayMaxValue();
        int[] nums2 = {1,5,4,5};
        int actual2 = arrayMaxValue2.sortAscendingThenMax(nums2);
        int expected2 = 16;
        assertEquals(expected, actual);

        ArrayMaxValue arrayMaxValue3 = new ArrayMaxValue();
        int[] nums3 = {3,7};
        int actual3 = arrayMaxValue2.sortAscendingThenMax(nums3);
        int expected3 = 12;
        assertEquals(expected, actual);

    }
}