package striver.a2zdsa.step1.basics.recursion;

import java.util.ArrayList;

// https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0
public class Ex05FactorialsUntilN {

    public static void main(String[] args) {
        System.out.println(factorialNumbers(3));
        System.out.println(factorialNumbers(6));
    }

    private static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> res = new ArrayList<>();

        int i = 1;
        while (true) {
            long fact = factorialFn(i);
            if (fact > n) {
                return res;
            }
            res.add(fact);
            i++;
        }
    }

    private static long factorialFn(long n) {
        if (n <= 0) return 1;

        return n * factorialFn(n - 1);
    }
}
