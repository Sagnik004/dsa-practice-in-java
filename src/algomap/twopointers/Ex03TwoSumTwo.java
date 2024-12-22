package algomap.twopointers;

import java.util.Arrays;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class Ex03TwoSumTwo {
    public static void main(String[] args) {
        int[] input = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(input, target)));

        input = new int[] {2,3,4};
        target = 6;
        System.out.println(Arrays.toString(twoSum(input, target)));

        input = new int[] {-1,0};
        target = -1;
        System.out.println(Arrays.toString(twoSum(input, target)));
    }

    // TC = O(n), SC = O(1)
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] {left + 1, right + 1};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        return new int[] {-1, -1};
    }
}
