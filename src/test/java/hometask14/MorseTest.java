package hometask14;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MorseTest {

    @Test
    public void uniqueMorseRepresentations() {

       Morse morse = new Morse();
        String [] words= {"gin","zen","gig","msg"};
        int actual = morse.uniqueMorseRepresentations(words);
        int expected = 2;
        assertEquals(actual, expected);

        Morse morse2 = new Morse();
        String [] words2= {"a"};
        int actual2 = morse.uniqueMorseRepresentations(words2);
        int expected2 = 1;
        assertEquals(actual2, expected2);

    }
}