package striver.a2zdsa.step1.basics;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        approach1(arr);
        System.out.println(Arrays.toString(arr));
        approach2(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        arr = new int[] {10,20,30,40};
        approach1(arr);
        System.out.println(Arrays.toString(arr));
        approach2(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    /* 2 pointer approach (iterative) */
    static void approach1(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int beginIndx, int endIndx) {
        int temp = arr[beginIndx];
        arr[beginIndx] = arr[endIndx];
        arr[endIndx] = temp;
    }

    /* Recursive approach */
    static void approach2(int[] arr, int startIndx, int endIndx) {
        if (startIndx >= endIndx) {
            return;
        }

        swap(arr, startIndx, endIndx);
        approach2(arr, ++startIndx, --endIndx);
    }
}
