package striver.a2zdsa.step2.sortingtechniques;

import java.util.Arrays;

/*
    Algo: Run an outer loop from 0 to n-1. For each outer loop element, run
    an inner loop and find the index of the min element in that range. And
    now swap it to bring the min towards the left.

    Notes:
        #) selection sort is good considering number of swaps
        #) Intermediate results of selection sort are useful since in each
        pass we are finding and placing the smaller elements in its appropriate
        position
        #) However, selection sort is not adaptive (intermediate pass cannot
        predict final result and hence cannot reduce iterations) and not stable
        as well (if duplicate elements are present we cannot guarantee order of
        them will be retained in final result).

    TC = O(n^2); SC = O(1)
*/
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[] {8,6,3,2,5,4};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortArr(int[] arr) {
        for (int i=0; i<(arr.length-1); i++) {
            int minI = i;
            for (int j=(i+1); j<arr.length; j++) {
                if (arr[j] < arr[minI]) {
                    minI = j;
                }
            }
            if (minI != i) {
                swap(arr, i, minI);
            }
        }
    }

    private static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
