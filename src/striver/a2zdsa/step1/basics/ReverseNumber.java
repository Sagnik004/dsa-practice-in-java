package striver.a2zdsa.step1.basics;

// https://takeuforward.org/c-programs/reverse-a-number-in-c/
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(getReverse_approach1(123));
        System.out.println(getReverse_approach1(234));
    }

    public static int getReverse_approach1(int n) {
        int origNum = n;
        int reverseNum = 0;

        while (origNum > 0) {
            int remainder = origNum % 10;
            reverseNum = (reverseNum * 10) + remainder;
            origNum = origNum / 10;
        }

        return reverseNum;
    }
}
