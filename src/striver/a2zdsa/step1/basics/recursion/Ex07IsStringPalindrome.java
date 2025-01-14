package striver.a2zdsa.step1.basics.recursion;

// https://takeuforward.org/data-structure/check-if-the-given-string-is-palindrome-or-not/
public class Ex07IsStringPalindrome {

    public static void main(String[] args) {
        String input = "ABCDCBA";
        System.out.println(isPalindrome(input, 0, input.length() - 1));

        input = "TAKE U FORWARD";
        System.out.println(isPalindrome(input, 0, input.length() - 1));
    }

    public static boolean isPalindrome(String str, int left, int right) {
        if (left >= right)
            return true;

        if (str.charAt(left) != str.charAt(right))
            return false;

        return isPalindrome(str, left + 1, right - 1);
    }
}
