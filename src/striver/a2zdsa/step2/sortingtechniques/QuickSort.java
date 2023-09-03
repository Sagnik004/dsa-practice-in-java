package striver.a2zdsa.step2.sortingtechniques;

import java.util.Arrays;

// https://youtu.be/WIrA4YexLRQ
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[] {11,13,7,12,16,9,24,5,10,3};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[] {3,5,6,9,11,16,19,23,41,53};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[] {102,99,98,97,91,88,64,63,57};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[] {4,1,7,9,4,3};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*
        2 other names of QuickSort: Selection Exchange sort, Partition Exchange sort.

        Idea behind QuickSort: pick an element, if all elements on the left of it are smaller
        and all elements on its right are larger, then that element is already sorted and
        sitting in its appropriate position. It's a type of "divide & conquer" algorithm.

        Notes:
            -> QuickSort will take the worst time O(n^2) if the list is already sorted
            either in ascending or descending order i.e., partitioning is done either at
            left most or right most index.
            -> QuickSort will take the best time O(n*log(n)) when the partition is always
            occurring exactly at the middle in each recursive call.
    */

    private static void sortArr(int[] arr) {
        qs(arr, 0, arr.length-1);
    }

    private static void qs(int[] arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex-1);
            qs(arr, pIndex+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            // Find first element from left greater than pivot
            while (arr[i] <= pivot && i < high) {
                i++;
            }
            // Find first element from right less than pivot
            while (arr[j] > pivot && j > low) {
                j--;
            }
            // If j did not cross i already then swap the elements
            if (i < j) {
                swap(arr, i, j);
            }
        }

        swap(arr, low, j);
        return j;
    }

    private static void swap(int[] arr, int fIndex, int sIndex) {
        int temp = arr[fIndex];
        arr[fIndex] = arr[sIndex];
        arr[sIndex] = temp;
    }
}
