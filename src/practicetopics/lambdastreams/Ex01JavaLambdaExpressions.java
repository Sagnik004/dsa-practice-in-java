package practicetopics.lambdastreams;

import java.util.Scanner;
import java.util.function.Predicate;

// https://www.hackerrank.com/challenges/java-lambda-expressions/problem
public class Ex01JavaLambdaExpressions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n"); // Use line break as delimiter to avoid issue with spaces in input

        int count = 1;
        int inputCount = sc.nextInt();
        int[][] inputs = new int[inputCount][2];
        int index = 0;

        while (count <= inputCount) {
            String input = sc.next(); // "1 4"
            String[] parts = input.split("\\s+"); // ["1", "4"]
            inputs[index] = new int[] {Integer.parseInt(parts[0]), Integer.parseInt(parts[1])}; // [[1, 4]]
            index++;
            count++;
        }

        for (int[] el : inputs) {
            switch (el[0]) {
                case 1 -> {
                    boolean isOdd = checkForOdd().test(el[1]);
                    System.out.println(isOdd ? "ODD" : "EVEN");
                }
                case 2 -> {
                    boolean isPrime = checkForPrime().test(el[1]);
                    System.out.println(isPrime ? "PRIME" : "COMPOSITE");
                }
                case 3 -> {
                    boolean isPalindrome = checkForPalindrome().test(el[1]);
                    System.out.println(isPalindrome ? "PALINDROME" : "NOT PALINDROME");
                }
                 default -> throw new IllegalArgumentException("Invalid option provided!");
            }
        }
    }

    private static Predicate<Integer> checkForOdd() {
        return n -> n % 2 != 0;
    }

    private static Predicate<Integer> checkForPrime() {
        return n -> {
            if (n <= 1)
                return false;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }

            return true;
        };
    }

    private static Predicate<Integer> checkForPalindrome() {
        return num -> {
            int origNum = num;
            int newNum = 0;

            while (num > 0) {
                int reminder = num % 10;
                newNum = (newNum * 10) + reminder;
                num = num / 10;
            }

            return origNum == newNum;
        };
    }
}
