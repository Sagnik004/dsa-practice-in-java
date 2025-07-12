package leetcode.leetcode75.A01ArrayString;

// https://leetcode.com/problems/greatest-common-divisor-of-strings/description
public class AS02GreatestCommonDivisorOfStrings {

    /* =================== Recursion approach =================== */

    // TC = O(log(n)) where n=max length of any string; SC = O(1)
    private String gcd(String str1, String str2) {
        if (str1.length() < str2.length()) { // str1 length should be more than str2
            return gcd(str2, str1);
        } else if (!str1.startsWith(str2)) { // str1 should be concatenation of str2
            return "";
        } else if (str2.isEmpty()) {         // GCD found
            return str1;
        } else {                             // Cut off common prefix part of str1 and recur
            return gcd(str1.substring(str2.length()), str2);
        }
    }

    private String approach1WithRecursion(String str1, String str2) {
        return gcd(str1, str2);
    }

    private String gcdOfStrings(String str1, String str2) {
        return approach1WithRecursion(str1, str2);
    }

    public static void main(String[] args) {
        AS02GreatestCommonDivisorOfStrings thisClass = new AS02GreatestCommonDivisorOfStrings();
        System.out.println(thisClass.gcdOfStrings("ABCABC", "ABC"));
        System.out.println(thisClass.gcdOfStrings("ABABAB", "ABAB"));
        System.out.println(thisClass.gcdOfStrings("LEET", "CODE"));
        System.out.println(thisClass.gcdOfStrings("ABCDEF", "ABC"));
    }
}
