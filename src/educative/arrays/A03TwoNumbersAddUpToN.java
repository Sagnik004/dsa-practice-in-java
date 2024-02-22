package educative.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class A03TwoNumbersAddUpToN {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findSum(new int[] {1,21,3,14,5,60,7,6}, 27)));
    }

    public static int[] findSum(int[] arr, int n) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int el : arr) {
            int rem = (n - el);
            if (hashSet.contains(rem)) {
                return new int[] {el, rem};
            }
            hashSet.add(el);
        }

        return arr;
    }
}
