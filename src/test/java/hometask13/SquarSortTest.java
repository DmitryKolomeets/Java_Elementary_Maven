package hometask13;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquarSortTest {

    @Test
    public void squarAndSortNonDecreasing() {

        SquarSort squarSort1 = new SquarSort();
        int[] nums = {-4,-1,0,3,10};
        int [] actual = squarSort1.squarAndSortNonDecreasing(nums);
        int [] expected = {0,1,9,16,100};
        assertArrayEquals(expected, actual);

        SquarSort squarSort2 = new SquarSort();
        int[] nums2 = {-7,-3,2,3,11};
        int [] actual2 = squarSort1.squarAndSortNonDecreasing(nums2);
        int [] expected2 = {4,9,9,49,121};
        assertArrayEquals(expected2, actual2);
    }
}