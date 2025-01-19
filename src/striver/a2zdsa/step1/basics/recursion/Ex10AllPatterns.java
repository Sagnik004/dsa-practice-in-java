package striver.a2zdsa.step1.basics.recursion;

import java.util.ArrayList;
import java.util.List;

// https://youtu.be/eQCS_v3bw0Q?list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9
public class Ex10AllPatterns {
    public static void main(String[] args) {
        printSubsequenceWithSumK(0, new int[] {1,2,1}, new ArrayList<>(), 0, 2);

        printJustOneSubsequenceWithSumK(0, new int[] {1,2,1}, new ArrayList<>(), 0, 2);

        int result = countOfSubsequenceWithSumK(0, new int[] {1,2,1}, 0, 2);
        System.out.printf("Result is %d", result);
    }

    // Technique to print all answers
    public static void printSubsequenceWithSumK(int index, int[] arr, ArrayList<Integer> list, int sum, int k) {
        if (index >= arr.length) {
            if (sum == k)
                System.out.println(list);

            return;
        }

        list.add(arr[index]);
        sum += arr[index];
        printSubsequenceWithSumK(index + 1, arr, list, sum, k);

        list.removeLast();
        sum -= arr[index];
        printSubsequenceWithSumK(index + 1, arr, list, sum, k);
    }

    // Technique to print only one answer
    public static boolean printJustOneSubsequenceWithSumK(int index, int[] arr,
                                                          List<Integer> list, int sum, int k) {
        if (index >= arr.length) {
            if (sum == k) {
                System.out.println(list);
                return true;
            } else
                return false;
        }

        list.add(arr[index]);
        sum += arr[index];
        if (printJustOneSubsequenceWithSumK(index + 1, arr, list, sum, k)) {
            return true;
        }

        list.removeLast();
        sum -= arr[index];
        return printJustOneSubsequenceWithSumK(index + 1, arr, list, sum, k);
    }

    // Technique to return count of subsequences found with sum = k
    public static int countOfSubsequenceWithSumK(int index, int[] arr, int sum, int k) {
        if (index >= arr.length) {
            if (sum == k) {
                return 1;
            }
            return 0;
        }

        sum += arr[index];
        int lCount = countOfSubsequenceWithSumK(index + 1, arr, sum, k);

        sum -= arr[index];
        int rCount = countOfSubsequenceWithSumK(index + 1, arr, sum, k);

        return lCount + rCount;
    }
}
