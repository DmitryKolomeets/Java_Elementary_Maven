import org.junit.Test;

import static org.junit.Assert.*;

public class PairsTest {

    @Test
    public void numIdenticalPairs() {

        Pairs pair1 = new Pairs();
        int [] nums = {1,2,3,1,1,3};
        int actual = pair1.numIdenticalPairs(nums);
        int expected = 4;
        assertEquals(expected, actual);

        Pairs pair2 = new Pairs();
        int [] nums2 = {1,1,1,1};
        int actual2 = pair1.numIdenticalPairs(nums2);
        int expected2 = 6;
        assertEquals(expected2, actual2);

        Pairs pair3 = new Pairs();
        int [] nums3 = {1,2,3};
        int actual3 = pair1.numIdenticalPairs(nums3);
        int expected3 = 0;
        assertEquals(expected3, actual3);

    }
}