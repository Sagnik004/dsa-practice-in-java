package leetcode.leetcode75.A01ArrayString;

// https://leetcode.com/problems/merge-strings-alternately/description/
public class AS01MergeStringsAlternatively {

    // TC = O(n+m), SC = O(n+m)
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        StringBuilder sb = new StringBuilder();

        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }

            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }

            i++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        AS01MergeStringsAlternatively thisClass = new AS01MergeStringsAlternatively();
        System.out.println(thisClass.mergeAlternately("abc", "pqr"));
        System.out.println(thisClass.mergeAlternately("ab", "pqrs"));
        System.out.println(thisClass.mergeAlternately("abcd", "pq"));
    }
}
