package striver.a2zdsa.step3.arrays.easy;

// https://takeuforward.org/data-structure/find-the-largest-element-in-an-array/
public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,0};
        System.out.println("Largest value is: " + approach1(arr));

        arr = new int[] {8,10,5,7,9};
        System.out.println("Largest value is: " + approach1(arr));
    }

    /*
        Iterate all elements in the array, and make use of a variable
        to keep track of the max value by comparing.
        TC = O(n), SC = O(1)
    */
    private static int approach1(int[] arr) {
        int maxVal = Integer.MIN_VALUE; // Or store arr[0] here and compare from arr[1]

        for (int el : arr) {
            if (el > maxVal) {
                maxVal = el;
            }
        }

        return maxVal;
    }
}
