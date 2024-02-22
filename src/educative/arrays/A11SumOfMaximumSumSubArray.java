package educative.arrays;

public class A11SumOfMaximumSumSubArray {
    public static void main(String[] args) {
        int[] a = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(findMaxSumSubArray(a));
    }

    public static int findMaxSumSubArray(int[] arr) {
        // Kadane's algorithm
        // https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
        int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;

        for (int el : arr) {
            maxEndingHere = maxEndingHere + el;
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }

        return maxSoFar;
    }
}
