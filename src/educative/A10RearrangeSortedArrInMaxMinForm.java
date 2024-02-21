package educative;

import java.util.Arrays;

public class A10RearrangeSortedArrInMaxMinForm {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
//        maxMin_1(arr);
        maxMin_2(arr);
        arr = new int[] {1,2,3,4,5};
//        maxMin_1(arr);
        maxMin_2(arr);
    }

    /*
        https://www.geeksforgeeks.org/rearrange-array-maximum-minimum-form/
        TC = O(n), SC = O(n)
     */
    public static void maxMin_1(int[] arr) {
        int arrLen = arr.length;
        int[] temp = arr.clone();
        int small = 0, large = arrLen - 1;
        boolean flag = true;

        for (int i=0; i<arrLen; i++) {
            if (flag) {
                arr[i] = temp[large];
                large--;
            } else {
                arr[i] = temp[small];
                small++;
            }
            flag = !flag;
        }

        System.out.println(Arrays.toString(arr));
    }

    /*
        https://www.geeksforgeeks.org/rearrange-array-maximum-minimum-form-set-2-o1-extra-space/
        https://youtu.be/oK0FKG5kigo
        TC = O(n), SC = O(1)
     */
    public static void maxMin_2(int[] arr) {
        int maxIdx = arr.length - 1;
        int minIdx = 0;
        int maxEl = arr[maxIdx] + 1; // Any element greater than the max element in arr

        // Transforming arr elements to hold both the original value + the
        // corresponding max/min values.
        for (int i=0; i<arr.length; i++) {
            // Even indexes will store max values and odd indexes min values
            if (i%2 == 0) {
                arr[i] = arr[i] + (arr[maxIdx] % maxEl) * maxEl;
                maxIdx--;
            } else {
                arr[i] = arr[i] + (arr[minIdx] % maxEl) * maxEl;
                minIdx++;
            }
        }

        // Dividing each element by maxEl to get and store the expected values
        for (int i=0; i<arr.length; i++) {
            arr[i] = arr[i] / maxEl;
        }

        System.out.println(Arrays.toString(arr));
    }
}
