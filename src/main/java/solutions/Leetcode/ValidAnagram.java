// LeetCode 242. Valid Anagram

import java.util.*;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        // to make sure both strings are same length
        if (s.length() != t.length()) {
            return false;
        }

        // two hashmap to keep track
        HashMap<Character, Integer> hashMapS = new HashMap<>();
        HashMap<Character, Integer> hashMapT = new HashMap<>();

        // for loop to iterate each characters
        for (int i = 0; i < s.length(); i++) {
            // add into hashmap if key doesn't exist, default to 0
            hashMapS.put(s.charAt(i), hashMapS.getOrDefault(s.charAt(i), 0) + 1);
            hashMapT.put(t.charAt(i), hashMapT.getOrDefault(t.charAt(i), 0) + 1);
        }
        // use equals() to compare the keys and values of each entry
        return hashMapS.equals(hashMapT);
    }
}