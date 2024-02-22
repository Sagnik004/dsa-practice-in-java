package educative.arrays;

import java.util.Arrays;

public class A08RotateArrByOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotateArray(arr);
    }

    public static void rotateArray(int[] arr) {
        int len = arr.length;

        if (len <= 1) return;

        int start = 0, end = len - 1;
        while (start != end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
