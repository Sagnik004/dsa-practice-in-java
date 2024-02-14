package educative;

import java.util.Arrays;

public class A04ArrayOfProductsOfAllElementsExceptItself {
    public static void main(String[] args) {
        int[] res = findProduct(new int[] {1,2,3,4});
        res = findProduct(new int[] {4,2,1,5,0});
        System.out.println(Arrays.toString(res));
    }

    public static int[] findProduct(int[] arr) {
        int len = arr.length;
        if (len < 2) {
            return arr;
        }
        int[] prod = new int[len];
        Arrays.fill(prod, 1);
        int temp = 1;

        for (int i=0; i<len; i++) {
            prod[i] = temp;
            temp = temp * arr[i];
        }

        temp = 1;

        for (int i=(len-1); i>=0; i--) {
            prod[i] = prod[i] * temp;
            temp = temp * arr[i];
        }

        return prod;
    }
}
