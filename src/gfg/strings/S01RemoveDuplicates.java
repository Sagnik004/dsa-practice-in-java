package gfg.strings;

import java.util.HashSet;

// https://www.geeksforgeeks.org/problems/remove-all-duplicates-from-a-given-string4321/1
public class S01RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("geEksforGEeks"));
        System.out.println(removeDuplicates("HaPpyNewYear"));
    }

    // TC = O(n), SC = O(n)
    public static String removeDuplicates(String str) {
        HashSet<Character> theHash = new HashSet<>();
        StringBuilder sb = new StringBuilder(str.length());

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (!theHash.contains(ch)) {
                sb.append(ch);
                theHash.add(ch);
            }
        }

        return sb.toString();
    }
}
