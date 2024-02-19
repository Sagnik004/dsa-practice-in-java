package striver.a2zdsa.step1.basics;

public class Exercise3_CheckForPalindrome {
    public static void main(String[] args) {
        int n = 121;
        int reverseN = reverseNum(n);
        if (n == reverseN) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    static int reverseNum(int n) {
        int reverse = 0;

        while (n > 0) {
            int remainder = n % 10;
            reverse = (reverse * 10) + remainder;
            n = n / 10;
        }

        return reverse;
    }
}
