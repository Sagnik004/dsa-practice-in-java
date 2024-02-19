package educative;

import java.util.Arrays;

public class A09RearrangePositiveNegative {
    public static void main(String[] args) {
        int[] arr = {10, -1, 20, 4, 5, -9, -6};
        reArrange(arr);
    }

    public static void reArrange(int[] arr) {
        // Left side should contain all negative elements, and
        // right side should contain all positive elements.
        // Order is not preserved in below solution.

        int left = -1;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < 0) {
                left++;
                swap(arr, left, i);
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
