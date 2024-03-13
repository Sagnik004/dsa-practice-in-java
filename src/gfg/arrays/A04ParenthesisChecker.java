package gfg.arrays;

import java.util.Stack;

// https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1?page=1&sortBy=submissions
public class A04ParenthesisChecker {
    public static void main(String[] args) {
        System.out.println(isMatching("{([])}"));
        System.out.println(isMatching("()"));
        System.out.println(isMatching("([]"));
    }

    public static boolean isMatching(String x) {
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<x.length(); i++) {
            char ch = x.charAt(i);

            // If char is an opening bracket then add to stack
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            }

            // If Stack is empty, then return false. Because we checked for opening bracket
            // already above, so it would be a closing bracket here. Empty stack and closing
            // bracket means out of pair.
            if (stack.empty()) {
                return false;
            }

            // Now check for matching bracket pairs
            char check;
            switch (ch) {
                case '}':
                    check = stack.pop();
                    if (check != '{') {
                        return false;
                    }
                    break;
                case ')':
                    check = stack.pop();
                    if (check != '(') {
                        return false;
                    }
                    break;
                case ']':
                    check = stack.pop();
                    if (check != '[') {
                        return false;
                    }
                    break;
            }
        }

        // If stack is empty then all opening brackets have closing brackets.
        // If stack is not empty then not all opening brackets have closing brackets.
        return stack.isEmpty();
    }
}
