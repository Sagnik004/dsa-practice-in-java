package educative.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class A06FirstNonRepeatingInteger {
    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 2, 6, 6};
        System.out.println(findFirstUnique(arr));

        arr = new int[] {4, 5, 1, 2, 0, 4};
        System.out.println(findFirstUnique(arr));
    }

    public static int findFirstUnique(int[] arr) {
        // Since insertion order is to be maintained LinkedHashedMap was used.
        Map<Integer, Integer> m = new LinkedHashMap<>();

        for (int el : arr) {
            if (m.containsKey(el)) {
                int val = m.get(el);
                m.put(el, val + 1);
            } else {
                m.put(el, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
