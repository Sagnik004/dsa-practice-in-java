package algomap.arraysandstrings;

import java.util.Arrays;

// https://leetcode.com/problems/longest-common-prefix/description/
public class AS06LongestCommonPrefix {

    public static void main(String[] args) {
        String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println(longestCommonPrefix(arr));
        System.out.println(longestCommonPrefix2(arr));

        arr = new String[]{"apple", "ape", "zebra"};
        System.out.println(longestCommonPrefix(arr));
        System.out.println(longestCommonPrefix2(arr));

        arr = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(arr));
        System.out.println(longestCommonPrefix2(arr));

        arr = new String[]{"dog","racecar","car"};
        System.out.println(longestCommonPrefix(arr));
        System.out.println(longestCommonPrefix2(arr));
    }

    // https://www.geeksforgeeks.org/longest-common-prefix-using-word-by-word-matching/?ref=asr3
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            prefix = commonPrefixUtil(prefix, strs[i]);
        }

        return prefix;
    }

    private static String commonPrefixUtil(String prefix, String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0, j = 0; i < prefix.length() && j < str.length(); i++, j++) {
            if (prefix.charAt(i) != str.charAt(j)) {
                break;
            }

            sb.append(prefix.charAt(i));
        }

        return sb.toString();
    }

    // https://www.geeksforgeeks.org/longest-common-prefix-using-sorting/
    public static String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length < 1) return "";

        // Sort the Array
        Arrays.sort(strs);

        // Get first and last Strings after sorting
        String first = strs[0];
        String last = strs[strs.length - 1];
        int minLength = Math.min(first.length(), last.length());
        int i = 0;

        // Find the common prefix between the first and last strings
        while (i < minLength &&
                first.charAt(i) == last.charAt(i)) {
            i++;
        }

        // If there's no common prefix
        if (i == 0)
            return "";

        return first.substring(0, i);
    }
}
