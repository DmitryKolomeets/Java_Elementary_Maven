package homework21;

import java.util.HashMap;

public class WordPattern {

    public boolean wordPattern(String pattern, String str) {
        String[] arrayWords = str.split(" ");


        if(arrayWords.length != pattern.length())
            return false;

        HashMap<Character, String> map = new HashMap<Character, String>();
        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            if(map.containsKey(c)){
                String value = map.get(c);
                if(!value.equals(arrayWords[i])){
                    return false;
                }
            }else if (map.containsValue(arrayWords[i])){
                return false;
            }
            map.put(c, arrayWords[i]);
        }

        return true;
    }

}
