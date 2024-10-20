package algomap.arraysandstrings;

import java.util.Arrays;

// https://leetcode.com/problems/product-of-array-except-self/description/
public class AS08ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        productExceptSelfApproach1(arr);
        productExceptSelfApproach2(arr);

        arr = new int[]{1, 2, 3, 4};
        productExceptSelfApproach1(arr);
        productExceptSelfApproach2(arr);

        arr = new int[]{-1, 1, 0, -3, 3};
        productExceptSelfApproach1(arr);
        productExceptSelfApproach2(arr);
    }

    // Using Prefix and Suffix Array – O(n) Time and O(n) Space
    public static int[] productExceptSelfApproach1(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return new int[]{1};
        }

        int[] left = new int[n];
        int[] right = new int[n];
        int[] prod = new int[n];

        // Construct the left array
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        // Construct the right array
        right[n - 1] = 1;
        for (int j = n - 2; j >= 0; j--) {
            right[j] = right[j + 1] * nums[j + 1];
        }

        for (int i = 0; i < n; i++) {
            prod[i] = left[i] * right[i];
        }

        System.out.println(Arrays.toString(prod));
        return prod;
    }

    // Efficient Approach - O(n) Time and O(1) Space
    public static int[] productExceptSelfApproach2(int[] nums) {
        int n = nums.length;
        int c = 0;
        int prod = 1;
        int[] res = new int[n];

        // Calculate product of all non-zero elements and count zeros
        for (int num : nums) {
            if (num == 0)
                c++;
            else
                prod *= num;
        }

        // Generate the result array
        for (int i = 0; i < n; i++) {
            if (c > 1) // if more than one zeros present all products will be zero always
                res[i] = 0;
            else if (c == 1) {
                if (nums[i] == 0)
                    res[i] = prod;
                else
                    res[i] = 0;
            } else
                res[i] = prod / nums[i];
        }

        System.out.println(Arrays.toString(res));
        return res;
    }
}
