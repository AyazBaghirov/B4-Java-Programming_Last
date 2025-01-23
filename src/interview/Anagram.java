package interview;

import java.lang.reflect.Array;
import java.util.Arrays;

// Check the String is anagram
public class Anagram {
    public  static void main(String[] args) {
        String word1 = "triangle";
        String word  = "integral";
        System.out.println(AnagramMethod(word1, word));
        System.out.println(AnagramMethod2(word1, word));


    }
    public static boolean AnagramMethod(String word1, String word2) {
        String word3 = "";
        for (int i = 0; i < word1.length(); i++) {
            if (word2.contains(word1.charAt(i)+"")) {
                word3 += word1.charAt(i);
            }
        }
        if (word3.length() == word2.length()) {
            return true;
        }
        System.out.println(word3);

        return  false;

    }

    public static boolean AnagramMethod2(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }else {
            String []  word1Array = word1.split("");
            String []  word2Array = word2.split("");
            Arrays.sort(word1Array);
            Arrays.sort(word2Array);
            return Arrays.toString(word1Array).equals(Arrays.toString(word2Array));


        }

    }
}
