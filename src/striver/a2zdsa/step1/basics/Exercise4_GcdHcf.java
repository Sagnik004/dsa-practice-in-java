package striver.a2zdsa.step1.basics;

public class Exercise4_GcdHcf {
    public static void main(String[] args) {
        System.out.println(approach_1(6, 4));
        System.out.println(approach_1(6, 9));
        System.out.println(approach_1(2, 5));
        System.out.println(approach_1(20, 40));

        System.out.println(approach_2(6, 4));
        System.out.println(approach_2(6, 9));
        System.out.println(approach_2(2, 5));
        System.out.println(approach_2(20, 40));
    }

    /*
    * Brute force approach.
    * TC = O(min(a,b)); SC = 1
    */
    static int approach_1(int a, int b) {
        int result = 1; // All numbers are divisible by 1

        for (int i = 2; i <= Math.min(a, b); i++) {
            if (a%i == 0 && b%i == 0) {
                result = i;
            }
        }

        return result;
    }

    /*
    * Using Euclidean’s theorem (extended version)
    * https://www.youtube.com/watch?v=1xNbjMdbjug&t=3169s
    *
    */
    static int approach_2(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }
}
