package educative;

public class A05FindMinValueInArray {
    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 6};
        System.out.println(findMinimum(arr));
        arr = new int[] {4, 2, 1, 5, 0};
        System.out.println(findMinimum(arr));
    }

    public static int findMinimum(int[] arr) {
        // if arr len < 1 then return 0
        if (arr.length < 1) return 0;

        // Consider first element is the minimum
        int min = arr[0];

        // Traverse the array and find min
        for (int i=1; i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}
