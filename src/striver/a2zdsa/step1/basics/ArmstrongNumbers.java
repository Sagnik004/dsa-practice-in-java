package striver.a2zdsa.step1.basics;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println(isPalindrome_approach1(153));
        System.out.println(isPalindrome_approach1(170));
        System.out.println(isPalindrome_approach1(0));
        System.out.println(isPalindrome_approach1(1));
    }

    static boolean isPalindrome_approach1(int num) {
        int digits = Integer.toString(num).length();
        int originalNum = num;
        int reverseNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reverseNum += (int) Math.pow(digit, digits);
            num = num / 10;
        }

        return reverseNum == originalNum;
    }
}
