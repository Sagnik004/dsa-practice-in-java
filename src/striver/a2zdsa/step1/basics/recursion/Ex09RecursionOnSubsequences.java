package striver.a2zdsa.step1.basics.recursion;

import java.util.ArrayList;
import java.util.List;

// https://youtu.be/AxNNVECce8c?list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9
public class Ex09RecursionOnSubsequences {

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        printSubsequences(0, arr, new ArrayList<>());
    }

    /**
     *
     * @param index current index
     * @param arr input array
     * @param list temporary data structure
     *
     * TC = O(2^n * n)
     *    -> 2^n because for each index there are 2 options, take that or ignore it in the subsequence.
     *       And, n for each subsequence time taken to print the list (approx).
     * SC = O(n)
     */
    private static void printSubsequences(int index, int[] arr, List<Integer> list) {
        if (index >= arr.length) {
            System.out.println(list);
            return;
        }

        list.add(arr[index]);
        printSubsequences(index + 1, arr, list);

        list.removeLast();
        printSubsequences(index + 1, arr, list);
    }
}
