package algomap.hashmapandsets;

import java.util.HashMap;

// https://leetcode.com/problems/majority-element/description/
public class Ex09MajorityElement {
    public static void main(String[] args) {
        int[] input = {3,2,3};
        System.out.println(majorityElement_Sol1(input));
        System.out.println(majorityElement_Sol2(input));

        input = new int[] {2,2,1,1,1,2,2};
        System.out.println(majorityElement_Sol1(input));
        System.out.println(majorityElement_Sol2(input));
    }

    // TC = O(n) where n=len(nums); SC = O(n)
    public static int majorityElement_Sol1(int[] nums) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int el : nums) {
            map.put(el, map.getOrDefault(el, 0) + 1);

            if (map.get(el) > (len / 2)) {
                return el;
            }
        }

        return -1;
    }

    //  Using Moore’s Voting Algorithm
    // TC = O(n) where n=len(nums); SC = O(1)
    public static int majorityElement_Sol2(int[] nums) {
        int len = nums.length;
        int candidate = -1;
        int count = 0;

        for (int el : nums) {
            if (count == 0) {
                candidate = el;
                count = 1;
            } else if (el == candidate) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int el : nums) {
            if (el == candidate) {
                count++;
                if (count > (len / 2)) {
                    return el;
                }
            }
        }

        return -1;
    }
}
