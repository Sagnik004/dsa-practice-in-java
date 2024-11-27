package algomap.hashmapandsets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/group-anagrams/description/
public class Ex08GroupAnagrams {
    public static void main(String[] args) {
        String[] input = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(input));

        input = new String[]{""};
        System.out.println(groupAnagrams(input));

        input = new String[]{"a"};
        System.out.println(groupAnagrams(input));
    }

    // TC = O(m*n) where m = len(strs) and n = len(each str in strs); SC = O(m)
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26];
            for (char ch : str.toCharArray()) {
                count[ch - 'a'] += 1;
            }
            StringBuilder key = new StringBuilder();
            for (int num : count) {
                key.append("#").append(num);
            }
            String keyStr = key.toString();
            anagramsMap.computeIfAbsent(keyStr, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(anagramsMap.values());
    }
}
