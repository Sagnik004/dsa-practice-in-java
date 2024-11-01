package algomap.hashmapandsets;

import java.util.HashSet;

// https://leetcode.com/problems/contains-duplicate/description/
public class Ex02ContainsDuplicate {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,1};
        int[] arr2 = {1,2,3,4};
        int[] arr3 = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(containsDuplicate(arr1));
        System.out.println(containsDuplicate(arr2));
        System.out.println(containsDuplicate(arr3));
    }

    // TC = O(n), SC = O(n)
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int el : nums) {
            if (set.contains(el))
                return true;
            else
                set.add(el);
        }

        return false;
    }
}
