package gfg.arrays;

import java.util.ArrayList;
import java.util.List;

// https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&sortBy=submissions
public class A01FindIndexesOfSubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,7,5};
        System.out.println(subArraySum(arr1, arr1.length, 12));
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(subArraySum(arr2, arr2.length, 97));
    }

    // Sliding window approach
    public static ArrayList<Integer> subArraySum(int[] arr, int n, int s) {
        ArrayList<Integer> res = new ArrayList<>(2);

        int start = 0, currentSum = arr[0];
        for (int i=1; i<=n; i++) {
            // If currentSum is greater than the expected sum, then
            // remove elements from the left.
            while (currentSum > s && start < (i - 1)) {
                currentSum = currentSum - arr[start];
                start++;
            }

            // If currentSum is equal to expected sum, return the indexes (1 based)
            if (currentSum == s) {
                res.add(start + 1);
                res.add(i);
                return res;
            }

            // Keep adding current element to currentSum
            if (i < n) {
                currentSum += arr[i];
            }
        }

        return new ArrayList<Integer>(List.of(-1));
    }
}
