package gfg.arrays;

import java.util.*;

// https://www.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1
// https://leetcode.com/problems/intersection-of-two-arrays/description/?envType=daily-question&envId=2024-03-10
public class A03IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        System.out.println(Arrays.toString(intersection1(arr1, arr2)));
        System.out.println(intersection2(arr1, arr2));
        int[] arr3 = {4,9,5};
        int[] arr4 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection1(arr3, arr4)));
        System.out.println(intersection2(arr3, arr4));
    }

    public static int[] intersection1(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int el : nums1) {
            if (!hashMap.containsKey(el)) {
                hashMap.put(el, 1);
            }
        }

        int foundNumbers = 0;
        for (int el : nums2) {
            if (hashMap.containsKey(el) && hashMap.get(el) != 2) {
                hashMap.replace(el, 2);
                foundNumbers++;
            }
        }

        int[] res = new int[foundNumbers];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();
            if (val == 2) {
                res[i] = key;
                i++;
            }
        }

        return res;
    }

    public static int intersection2(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int el : nums1) {
            if (!hashMap.containsKey(el)) {
                hashMap.put(el, 1);
            }
        }

        int foundNumbers = 0;
        for (int el : nums2) {
            if (hashMap.containsKey(el) && hashMap.get(el) != 2) {
                hashMap.replace(el, 2);
                foundNumbers++;
            }
        }

        return foundNumbers;
    }
}
