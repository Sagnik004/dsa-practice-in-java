package educative;

import java.util.Arrays;

public class A10RearrangeSortedArrInMaxMinForm {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        maxMin(arr);
        arr = new int[] {1,2,3,4,5};
        maxMin(arr);
    }

    /*
        https://www.geeksforgeeks.org/rearrange-array-maximum-minimum-form/
        TC = O(n), SC = O(n)
     */
    public static void maxMin(int[] arr) {
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
}
