package gfg.other;

import java.util.HashSet;
import java.util.Set;

// https://www.geeksforgeeks.org/happy-number/
// https://leetcode.com/problems/happy-number/description/
public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(happyNumber_approach1(19));
        System.out.println(happyNumber_approach1(20));

        System.out.println(happyNumber_approach2(19));
        System.out.println(happyNumber_approach2(20));

        System.out.println(happyNumber_approach3(19));
        System.out.println(happyNumber_approach3(20));
    }

    private static boolean happyNumber_approach1(int num) {
        Set<Integer> set = new HashSet<>();

        while (true) {
            num = sumOfDigitSquares(num);
            if (num == 1)
                return true;
            if (set.contains(num))
                return false;
            set.add(num);
        }
    }

    private static boolean happyNumber_approach2(int num) {
        int slow, fast;

        slow = fast = num;

        do {
            slow = sumOfDigitSquares(slow);
            fast = sumOfDigitSquares(sumOfDigitSquares(fast));
        } while (slow != fast);

        return slow == 1;
    }

    /**
     * From 1 to 9 the only 2 happy numbers are 1 and 7. So, we can make use of this fact and
     * continue doing the sum of digits square until sum reach less than 10. And then just
     * verify if the sum is 1 or 7 to decide if happy number or not.
     *
     * @param num input number
     * @return true if sum = 1 or 7, else false
     */
    private static boolean happyNumber_approach3(int num) {
        int sum = num, newNum = num;

        while (sum > 9) {
            sum = 0;

            while (newNum > 0) {
                int digit = newNum % 10;
                sum += (int) Math.pow(digit, 2);
                newNum /= 10;
            }
            newNum = sum;
        }

        return (sum == 1 || sum == 7);
    }

    private static int sumOfDigitSquares(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += (int) Math.pow(digit, 2);
            n = n / 10;
        }

        return sum;
    }
}
