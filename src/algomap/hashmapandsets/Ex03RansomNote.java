package algomap.hashmapandsets;

import java.util.HashMap;

// https://leetcode.com/problems/ransom-note/description/
public class Ex03RansomNote {

    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
    }

    // TC = O(m+n) where m = len(ransomNote), n = len(magazine); SC = O(n) for hashmap
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : magazine.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : ransomNote.toCharArray()) {
            if (map.getOrDefault(ch, 0) > 0) {
                map.put(ch, map.get(ch) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}
