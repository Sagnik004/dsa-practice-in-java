package striver.a2zdsa.step1.basics.recursion;

import java.util.Arrays;

// https://takeuforward.org/data-structure/reverse-a-given-array/
public class Ex06ReverseArrayUsingRecursion {

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5};
        reverseArr(input, 0, input.length - 1);
        System.out.println(Arrays.toString(input));

        input = new int[]{40,30,20,10,5};
        reverseArr(input, 0, input.length - 1);
        System.out.println(Arrays.toString(input));
    }

    private static void reverseArr(int[] arr, int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArr(arr, start + 1, end - 1);
        }
    }
}
