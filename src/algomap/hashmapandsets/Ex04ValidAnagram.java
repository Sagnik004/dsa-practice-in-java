package algomap.hashmapandsets;

import java.util.HashMap;

// https://leetcode.com/problems/valid-anagram/description/
public class Ex04ValidAnagram {

    private static final int MAX_CHAR = 26;

    public static void main(String[] args) {
        System.out.println(isAnagram_Approach1("anagram", "nagaram"));
        System.out.println(isAnagram_Approach2("anagram", "nagaram"));

        System.out.println(isAnagram_Approach1("rat", "car"));
        System.out.println(isAnagram_Approach2("rat", "car"));
    }

    /**
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
     * using all the original letters exactly once.
     */
    // TC = O(m+n) where m=len(s), n=len(t);
    // SC = O(26) since s and t will have only lowercase English letters, hence O(1)
    public static boolean isAnagram_Approach1(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }

        return sMap.equals(tMap);
    }

    /**
     * Using Frequency Array:
     * Create a frequency array of size 26 by using characters as index in this array. The frequency
     * of ‘a’ is going to be stored at index 0, ‘b’ at 1, and so on. To find the index of a character,
     * we subtract character a’s ASCII value from the ASCII value of the character.
     */
    // TC = O(m+n) where m=len(s), n=len(t);
    // SC = O(MAX_CHAR) i.e. O(26), hence O(1)
    public static boolean isAnagram_Approach2(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] freq = new int[MAX_CHAR];

        // Count frequency of each character in string s
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Count frequency of each character in string t
        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 'a']--;
        }

        // Check if all frequencies are zero
        for (int count : freq) {
            if (count != 0)
                return false;
        }

        return true;
    }
}
