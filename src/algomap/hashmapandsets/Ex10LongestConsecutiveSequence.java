package algomap.hashmapandsets;

import java.util.Arrays;
import java.util.HashSet;

public class Ex10LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] input = {100,4,200,1,3,2};
        System.out.println(longestConsecutive_Soln1(input));
        System.out.println(longestConsecutive_Soln2(input));

        input = new int[] {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive_Soln1(input));
        System.out.println(longestConsecutive_Soln2(input));

        input = new int[] {1,9,3,10,4,20,2};
        System.out.println(longestConsecutive_Soln1(input));
        System.out.println(longestConsecutive_Soln2(input));
    }

    /**
     * Sort the array first to bring a sequence to the array.
     * Now loop through each element and when the element is part of the sequence,
     * then increment the counter. If not reset the counter.
     */
    // TC = O(n*logn) where n=len(nums); SC = O(1)
    public static int longestConsecutive_Soln1(int[] nums) {
        Arrays.sort(nums);

        int longestSeq = 1;
        int currentCount = 0;
        int lastSmall = Integer.MIN_VALUE;
        for (int el : nums) {
            if ((el - 1) == lastSmall) {
                currentCount++;
                lastSmall = el;
            } else if (el != lastSmall) {
                lastSmall = el;
                currentCount = 1;
            }
            longestSeq = Math.max(longestSeq, currentCount);
        }

        return longestSeq;
    }

    /**
     * Place the elements into a HashSet first to remove all duplicates.
     * Loop through each element of the HashSet and check if the element can
     * be a starting sequence (el = starting sequence when el-1 is not there).
     * If element cannot be a starting sequence then ignore it. If element can
     * be a starting sequence then find how many consecutive elements are present
     * and if the sequence is longer than the previously found sequence (if any).
     */
    // TC = O(n) where n=len(nums); SC = O(1)
    public static int longestConsecutive_Soln2(int[] nums) {
        HashSet<Integer> uniqueElementSet = new HashSet<>();

        for (int num : nums) {
            uniqueElementSet.add(num);
        }

        int result = 0;
        for (int el : uniqueElementSet) {
            if (!uniqueElementSet.contains(el - 1)) {
                int start = el;
                int count = 1;
                while (uniqueElementSet.contains(start + 1)) {
                    start++;
                    count++;
                }
                result = Math.max(result, count);
            }
        }

        return result;
    }
}
