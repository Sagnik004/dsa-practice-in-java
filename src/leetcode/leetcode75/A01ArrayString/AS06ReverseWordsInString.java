package leetcode.leetcode75.A01ArrayString;

import java.util.Stack;

// https://leetcode.com/problems/reverse-words-in-a-string/description
public class AS06ReverseWordsInString {

    // Approach 1 with split and regex
    // TC = O(n) where n = length of the string, SC = O(n)
    private String approach1(String s) {
        String[] words = s.trim().split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    // Approach 2 with stack
    // TC = O(n) where n = length of the string, SC = O(n)
    private String approach2(String s) {
        Stack<String> wordStack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            // If not space then build current word
            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            } else if (!sb.isEmpty()) { // If space and current word is not pushed to stack, then push it. Extra spaces will be ignored in this way.
                wordStack.push(sb.toString());
                sb.setLength(0);
            }
        }

        // Last remaining word push to stack
        if (!sb.isEmpty()) {
            wordStack.push(sb.toString());
        }

        // Prepare the result String
        StringBuilder result = new StringBuilder();
        while (!wordStack.isEmpty()) {
            result.append(wordStack.pop());
            if (!wordStack.isEmpty()) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    // Approach 3 with two pointers
    private String approach3(String s) {
        // TODO: need to check if O(1) space complexity solution is feasible
        throw new RuntimeException("Unimplemented method!");
    }

    public String reverseWords(String s) {
        // return approach1(s);
        return approach2(s);
    }

    public static void main(String[] args) {
        AS06ReverseWordsInString thisClass = new AS06ReverseWordsInString();
        System.out.println(thisClass.reverseWords("the sky is blue"));
        System.out.println(thisClass.reverseWords("  hello world  "));
        System.out.println(thisClass.reverseWords("a good   example"));
    }
}
