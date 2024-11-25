package algomap.hashmapandsets;

import java.util.Arrays;
import java.util.HashMap;

// https://leetcode.com/problems/two-sum/description/
public class Ex06TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));

        nums = new int[] {3, 2, 4};
        target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));

        nums = new int[] {3, 3};
        target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    // TC = O(n) where n=len(nums);
    // SC = O(n)
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            } else {
                map.put(nums[i], i);
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
