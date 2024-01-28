package educative;

import java.util.Arrays;

public class A02MergeTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                mergeArrays(new int[] {1,3,4,5}, new int[] {2,6,7,8})));
        System.out.println(Arrays.toString(
                mergeArrays(new int[] {5,8,9}, new int[] {1,4,7,8,11})));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int i=0, j=0, k=0;
        int arr1Len = arr1.length, arr2Len = arr2.length;
        int[] resArr = new int[arr1Len + arr2Len];

        while (i<arr1Len && j<arr2Len) {
            if (arr1[i] < arr2[j]) {
                resArr[k] = arr1[i];
                i++;
            } else {
                resArr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1Len) {
            resArr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2Len) {
            resArr[k] = arr2[j];
            j++;
            k++;
        }

        return resArr;
    }
}
