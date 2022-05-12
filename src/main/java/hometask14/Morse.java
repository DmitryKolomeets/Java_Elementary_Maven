package hometask14;

import java.util.HashSet;

public class Morse {

    public static int uniqueMorseRepresentations(String[] words) {


        String [] morseAlphabet = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashSet<String> uniqMorseStrings = new HashSet<>();
        String morse;
        int index;

        for( int i = 0; i < words.length; i++ )
        {
            morse = "";
            for( int j = 0; j < words[i].length(); j++ )
            {
                index = ((int)words[i].charAt(j)) - 97;
                morse += morseAlphabet[index];
            }
            uniqMorseStrings.add(morse);
        }

        return uniqMorseStrings.size();

    }


}
