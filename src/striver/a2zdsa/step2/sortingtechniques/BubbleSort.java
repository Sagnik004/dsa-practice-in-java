package striver.a2zdsa.step2.sortingtechniques;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        approach1(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[] {8,5,7,3,2};
        approach2(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[] {2,3,12,19,33,65,90};
        approach2(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*
        Algo: Run an outer loop from n-1 to 1 i.e., from last to first. For each outer
        loop element, run an inner loop from 0 till outer loop index position - 1, and
        swap if bigger element is on the adjacent left. Thus, after each iteration the
        last part of the array will be sorted, and finally after (n-1) iteration the
        complete array will be sorted.

        Notes:
            -> The bigger/heavier elements goes and sit at the bottom, and lighter/
            smaller elements goes up at the top. Hence, the name bubble sort.
            -> Intermediate results of bubble sort are useful since in each
            pass we are finding and placing the bigger elements in its appropriate
            position at the end of the array. This is very useful in scenarios where
            we want to find the largest element only, or first "k" largest elements etc.
            -> Bubble sort is adaptive as well (intermediate pass can predict final
            result and hence can reduce iterations). Approach_1 is not adaptive, however
            approach_2 algo is adaptive (by default it is not adaptive, but we can make
            it adaptive by using a flag as done in approach_2)
            -> Bubble sort is stable as well (if duplicate elements are present we can
            guarantee order of them will be retained in final result).

        TC = O(n^2); SC = O(1)
    */
    private static void approach1(int[] arr) {
        for (int i=(arr.length-1); i>0; i--) {
            for (int j=0; j<i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    /*
        Algo: This is an optimized approach compared to first one. Here we stop the
        loop if there were no swaps done in the inner loop, because no swaps done =
        array already sorted. Though the worst time complexity is still O(n^2) here
        as well, but with best case scenario or even average case scenario the time
        complexity can reduce to just O(n).

        TC = O(n^2) in worst case, and O(n) in best case; SC = O(1)
    */
    private static void approach2(int[] arr) {
        int n = arr.length;
        for (int i=0; i<(n-1); i++) {
            boolean didSwap = false;

            // In each pass i elements are already sorted, hence run
            // reduce inner loop run by i
            for (int j=0; j<(n-1-i); j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                    didSwap = true;
                }
            }

            // If no swaps were done then array is already sorted now, hence return
            if (!didSwap) {
                return;
            }
        }
    }

    private static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
