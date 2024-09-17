package algomap.arraysandstrings;

// https://leetcode.com/problems/is-subsequence/
public class AS03IsSubsequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
        System.out.println(isSubsequence("", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        if (s.isEmpty()) return true;

        while (j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                if (i == s.length()) return true;
            }
            j++;
        }

        return false;
    }
}
