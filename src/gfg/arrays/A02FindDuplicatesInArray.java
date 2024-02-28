package gfg.arrays;

import java.util.ArrayList;

// https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&sortBy=submissions
public class A02FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr1 = {0,3,1,2};
        findDuplicates(arr1, arr1.length);

        int[] arr2 = {2,3,1,2,3};
        findDuplicates(arr2, arr2.length);

        int[] arr3 = {1,6,3,1,3,6,6};
        findDuplicates(arr3, arr3.length);
    }

    public static ArrayList<Integer> findDuplicates(int[] arr, int n) {
        ArrayList<Integer> res = new ArrayList<>();

        // Since arr elements are within 0 to (n-1) range of values,
        // performing modulo of the element with n will give one of
        // the index position in that range. Once index is retrieved we add
        // n to that element. By doing that if any element/index is repeating
        // then n will get added more than 2 times which we are checking below.
        for (int i=0; i<n; i++) {
            int index = arr[i] % n;
            arr[index] += n;
        }

        for (int i=0; i<n; i++) {
            if (arr[i] / n >= 2) {
                res.add(i);
            }
        }

        if (res.isEmpty()) {
            res.add(-1);
        }
        System.out.println(res);
        return res;
    }
}
