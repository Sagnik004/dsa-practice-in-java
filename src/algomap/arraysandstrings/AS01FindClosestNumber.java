package algomap.arraysandstrings;

// https://leetcode.com/problems/find-closest-number-to-zero/description/
public class AS01FindClosestNumber {
    public static void main(String[] args) {
        System.out.println(findClosestNumber(new int[] {-4,-2,1,4,8}));
        System.out.println(findClosestNumber(new int[] {2,-1,1}));
    }

    public static int findClosestNumber(int[] nums) {
        int result = Integer.MAX_VALUE;
        int minDifference = Integer.MAX_VALUE;

        for (int el : nums) {
            int diffWith0 = Math.abs(el);
            if (diffWith0 < minDifference) {
                result = el;
                minDifference = diffWith0;
            } else if (diffWith0 == minDifference) {
                result = Math.max(el, result);
            }
        }

        return result;
    }
}
