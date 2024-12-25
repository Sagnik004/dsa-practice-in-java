package algomap.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/3sum/description/
public class Ex04ThreeSum {
    public static void main(String[] args) {
        int[] input = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(input));

        input = new int[] {0,1,1};
        System.out.println(threeSum(input));

        input = new int[] {0,0,0};
        System.out.println(threeSum(input));
    }

    /**
     * Using Two Pointers Technique -- First sort the array. Then start traversing the
     * array, fix the first element, then initialize 2 pointers at the beginning and
     * at the end of the array. Now check if the sum becomes 0. Also, check for
     * duplicate elements (since it is sorted just need to look at the adjacent elements),
     * and if duplicates found then ignore those elements.
     *
     * @param nums input array of integers
     * @return res
     */
    // TC = O(n^2), SC = O(1)
    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    List<Integer> curr = List.of(nums[i], nums[l], nums[r]);
                    res.add(curr);
                    l++;
                    r--;

                    while (l < n && nums[l] == nums[l - 1])
                        l++;
                    while (r > l && nums[r] == nums[r + 1])
                        r--;
                } else if (sum > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }

        return res;
    }
}
