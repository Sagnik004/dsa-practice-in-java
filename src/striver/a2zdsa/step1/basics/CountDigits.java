package striver.a2zdsa.step1.basics;

// https://takeuforward.org/data-structure/count-digits-in-a-number/
public class CountDigits {
    public static void main(String[] args) {
        System.out.println(getNumberOfDigits_approach1(12345));
        System.out.println(getNumberOfDigits_approach1(8394));

        System.out.println(getNumberOfDigits_approach2(12345));
        System.out.println(getNumberOfDigits_approach2(8394));
    }

    public static int getNumberOfDigits_approach1(int n) {
        int num = n;
        int digits = 0;

        while (num > 0) {
            num = num / 10;
            digits++;
        }

        return digits;
    }

    public static int getNumberOfDigits_approach2(int n) {
        String num = Integer.toString(n); /* Convert to string */
        return num.length();              /* Return length */
    }
}
