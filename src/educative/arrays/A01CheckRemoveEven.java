package educative.arrays;

import java.util.Arrays;

public class A01CheckRemoveEven {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeEven(new int[] {1,2,4,5,10,6,3})));
        System.out.println(Arrays.toString(removeEven(new int[] {32,37,10,40,11,5})));
        System.out.println(Arrays.toString(removeEven(new int[] {1,2,4,5,10,6,3})));
    }

    public static int[] removeEven(int[] arr) {
        int countOfOdd = 0;
        for (int el : arr) {
            if (el % 2 != 0) {
                countOfOdd++;
            }
        }
        int[] res = new int[countOfOdd];
        int j = 0;
        for (int el : arr) {
            if (el % 2 != 0) {
                res[j] = el;
                j++;
            }
        }
        return res;
    }
}
