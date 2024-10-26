package algomap.arraysandstrings;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/spiral-matrix/description/
public class AS10SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));

        matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(matrix));
    }

    // TC = O(m*n), SC = O(m*n)
    // https://youtu.be/3Zv-s9UUrFM
    public static List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0, right = cols - 1;
        int top = 0, bottom = rows - 1;

        List<Integer> res = new ArrayList<>();

        // Iterate until all elements are printed
        while (top <= bottom && left <= right) {
            // Print top row from left to right
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;

            // Print right column from top to bottom
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            // Print bottom row from right to left (if exists)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Print left column from bottom to top (if exists)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }

        return res;
    }
}
