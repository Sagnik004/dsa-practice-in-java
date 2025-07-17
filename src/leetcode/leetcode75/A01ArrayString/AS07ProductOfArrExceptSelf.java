package leetcode.leetcode75.A01ArrayString;

import java.util.Arrays;

// https://leetcode.com/problems/product-of-array-except-self/description
public class AS07ProductOfArrExceptSelf {

    // Simple approach using nested loop, not optimized
    // TC = O(n^2), SC = O(n)
    private int[] approach1(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int prod = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    prod = prod * nums[j];
                }
            }
            result[i] = prod;
        }

        return result;
    }

    /*
        Better approach: prepare a left array which will hold the product of all the elements on the left
        from a particular position. Similarly, prepare a right array which will hold the product of all the
        elements on the right from a particular position. Finally combine the left arr and right array to
        calculate the result array.
     */
    // TC = O(n), SC = O(n) where n = length of nums.
    private int[] approach2(int[] nums) {
        int[] lArr = new int[nums.length];
        int[] rArr = new int[nums.length];

        // Prepare left array
        int prod = 1;
        for (int i = 0; i < nums.length; i++) {
            lArr[i] = prod;
            prod = prod * nums[i];
        }

        // Prepare right array
        prod = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            rArr[i] = prod;
            prod = prod * nums[i];
        }

        // Prepare final result array
        int[] result = new int[nums.length];
        for (int i = 0; i < lArr.length; i++) {
            result[i] = lArr[i] * rArr[i];
        }

        return result;
    }

    /*
        Optimized/Efficient approach using division: if we calculate the product of all the elements in nums array
        and store it, then in result array we can calculate the value by dividing the product by value at that index.
        The only edge case is when nums have zeros in it, specifically 2 edge cases - 1) when there is only 1 zero in
        nums, only that index position in result array will have the product and rest all positions will be 0.
        2) When more than 1 zero is present in nums, then result arr will always have zeros only.
     */
    // TC = O(n) where n = length of nums, SC = O(1)
    private int[] approach3(int[] nums) {
        int numsLength = nums.length;
        int zeros = 0, idx = -1, prod = 1;

        for (int i = 0; i < numsLength; i++) {
            if (nums[i] == 0) {
                zeros++;
                idx = i;
            } else {
                prod *= nums[i];
            }
        }

        int[] result = new int[nums.length];
        Arrays.fill(result, 0);

        if (zeros > 1) {
            return result;
        }

        if (zeros == 0) {
            for (int i = 0; i < numsLength; i++) {
                result[i] = prod / nums[i];
            }
        } else if (zeros == 1) {
            result[idx] = prod;
        }

        return result;
    }

    public int[] productExceptSelf(int[] nums) {
        // return approach1(nums);
        // return approach2(nums);
        return approach3(nums);
    }

    public static void main(String[] args) {
        AS07ProductOfArrExceptSelf thisClass = new AS07ProductOfArrExceptSelf();
        System.out.println(Arrays.toString(thisClass.productExceptSelf(new int[] {1,2,3,4})));
        System.out.println(Arrays.toString(thisClass.productExceptSelf(new int[] {-1,1,0,-3,3})));
    }
}
