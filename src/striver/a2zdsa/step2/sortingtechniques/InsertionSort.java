package striver.a2zdsa.step2.sortingtechniques;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8,5,7,3,2};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[] {13,46,24,52,20,9};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[] {5,4,3,2,1};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*
        Algo: Run an outer loop from 1 to n-1. The outer loop element need to
        be inserted into its appropriate position. To do so, start an inner loop
        from i-1 until 0 and keep checking and shifting bigger elements to the right
        compared to outer loop element. Once the inner loop is done then j+1 is the
        position where outer loop element should be placed, and hence place it over
        there.

        Notes:
            -> Intermediate results of insertion sort are not useful, it does not
            provide any useful details until the whole array is sorted.
            -> Insertion sort is more useful or more compatible with LinkedList
            as compared to an array. The reason is - with arrays we would need to
            shift elements, whereas in LinkedList there are no shifting required.
            Insertion sort is designed for LinkedList.
            -> Insertion sort is adaptive, and by default it is adaptive.
            -> Insertion sort is stable as well (if duplicate elements are present we can
            guarantee order of them will be retained in final result).

        TC = worst case is O(n^2), best case is O(n); SC = O(1)
    */
    private static void sortArr(int[] arr) {
        int n = arr.length;
        for (int i=1; i<n; i++) {
            int j = i-1, currVal = arr[i];
            while (j>=0 && arr[j]>currVal) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currVal;
        }
    }
}
