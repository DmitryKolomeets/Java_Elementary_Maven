package hometask12;

import hometask12.Jewels;
import org.junit.Test;

import static org.junit.Assert.*;

public class JewelsTest {

    @Test
    public void numJewelsInStones() {

        Jewels jewels = new Jewels();
        int actual = jewels.numJewelsInStones("aA", "aAAbbbb");
        int expected = 3;
        assertEquals(expected, actual);

        Jewels jewels2 = new Jewels();
        int actual2 = jewels2.numJewelsInStones("z", "ZZ");
        int expected2 = 0;
        assertEquals(expected2, actual2);

    }
}