package algomap.arraysandstrings;

import java.util.Arrays;

// https://leetcode.com/problems/rotate-image/description/
public class AS11RotateImage {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotate_approach1(arr);
        rotate_approach2(arr);

        arr = new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate_approach1(arr);
        rotate_approach2(arr);

        arr = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate_approach1(arr);
        rotate_approach2(arr);
    }

    // Brute force approach (not optimal)
    // TC = O(n^2), SC = O(n^2)
    // https://youtu.be/Z0R2u6gd3GU
    public static void rotate_approach1(int[][] matrix) {
        int n = matrix.length;
        int[][] res = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[j][n - 1 - i] = matrix[i][j];
            }
        }

        // Print the result matrix
        for (int[] a : res) {
            System.out.println(Arrays.toString(a));
        }
    }

    // Optimal approach (not using additional space)
    // TC = O(n^2), SC = O(1)
    // https://youtu.be/Z0R2u6gd3GU
    public static void rotate_approach2(int[][] matrix) {
        int n = matrix.length;

        // Transpose the matrix
        for (int i = 0; i < (n - 1); i++) {
            for (int j = (i + 1); j < n; j++) {
                swap(matrix, i, j);
            }
        }

        // Reverse row elements
        for (int[] arrEl : matrix) {
            reverse(arrEl, 0, arrEl.length - 1);
        }

        // Print the result matrix
        for (int[] a : matrix) {
            System.out.println(Arrays.toString(a));
        }
    }

    private static void swap(int[][] arr, int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
