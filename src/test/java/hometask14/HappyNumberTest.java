package hometask14;

import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumberTest {

    @Test
    public void isHappy() {

        HappyNumber happyNumber = new HappyNumber();
        boolean actual;
        int number = 19;
        boolean expected = true;
        actual = happyNumber.isHappy(number);
        assertEquals(expected, actual);


        HappyNumber happyNumber2 = new HappyNumber();
        boolean actual2;
        int number2 = 2;
        boolean expected2 = false;
        actual2 = happyNumber2.isHappy(number2);
        assertEquals(expected2, actual2);

    }
}