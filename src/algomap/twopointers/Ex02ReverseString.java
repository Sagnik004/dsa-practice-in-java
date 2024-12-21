package algomap.twopointers;

// https://leetcode.com/problems/reverse-string/description/
public class Ex02ReverseString {
    public static void main(String[] args) {
        char[] input = {'h','e','l','l','o'};
        reverseString(input);

        input = new char[] {'H','a','n','n','a','h'};
        reverseString(input);
    }

    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;

        while (left < right) {
            swapChars(s, left, right);
            left++;
            right--;
        }

        System.out.println(s);
    }

    private static void swapChars(char[] s, int left, int right) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }
}
