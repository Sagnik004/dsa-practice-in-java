package algomap.twopointers;

import java.util.Arrays;

// https://leetcode.com/problems/squares-of-a-sorted-array/description/
public class Ex01SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));

        nums = new int[] {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    /**
     * Since the array is already sorted we can use the 2 pointer approach, only the
     * negative values are the interesting portion here since squares of the negative's
     * will turn to positive values and need to be placed in sorted order.
     *
     * We will start filling up the sorted result array from the right. First compare if
     * abs|left| > abs|right|, then fill up result array with square of left element and
     * increment left pointer, else fill up result array with square of right element and
     * decrement the right pointer.
     */
    // TC = O(n) where n=len(nums); SC = O(n)
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length, left = 0, right = n - 1;
        int[] result = new int[n];

        for (int i = (n - 1); i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
        }

        return result;
    }
}
