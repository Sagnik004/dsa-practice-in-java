package algomap.arraysandstrings;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/summary-ranges/description/
public class AS07SummaryRanges {

    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        summaryRanges(nums);

        nums = new int[] {0,2,3,4,6,8,9};
        summaryRanges(nums);
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < nums.length) {
            int start = nums[i];

            while (i < nums.length - 1 && nums[i + 1] == nums[i] + 1) {
                i++;
            }

            if (nums[i] != start) {
                result.add(start + "->" + nums[i]);
            } else {
                result.add(String.valueOf(nums[i]));
            }

            i++;
        }

        System.out.println(result);
        return result;
    }
}
