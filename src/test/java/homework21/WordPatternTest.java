package homework21;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordPatternTest {

    @Test
    public void testWordPatternFollows() {
        WordPattern wordPattern = new WordPattern();
        boolean actual = wordPattern.wordPattern("abba", "dog cat cat dog");
        assertTrue(actual);
    }

    @Test
    public void testWordPatternDontFollows() {
        WordPattern wordPattern2 = new WordPattern();
        boolean actual2 = wordPattern2.wordPattern("abba", "dog cat cat fish");
        assertFalse(actual2);
    }

    @Test
    public void testWordPatternDontFollowsAllSamePattern() {
        WordPattern wordPattern3 = new WordPattern();
        boolean actual3 = wordPattern3.wordPattern("aaaa", "dog cat cat dog");
        assertFalse(actual3);
    }

}