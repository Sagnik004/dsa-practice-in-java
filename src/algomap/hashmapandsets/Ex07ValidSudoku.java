package algomap.hashmapandsets;

import java.util.HashSet;

// https://leetcode.com/problems/valid-sudoku/description/
public class Ex07ValidSudoku {
    public static void main(String[] args) {
        char[][] input1 = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(input1));

        char[][] input2 = {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(input2));
    }

    // https://www.geeksforgeeks.org/check-if-given-sudoku-board-configuration-is-valid-or-not/
    // TC = O(n^2) for n*n cells; SC = O(n^2) for 3 arrays
    public static boolean isValidSudoku(char[][] board) {
        // Arrays of sets to track seen numbers in rows, cols and sub-boxes
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        // Initialize the sets
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char val = board[i][j];

                // Skip empty cell
                if (val == '.') continue;

                // Check for duplicates in the row
                if (rows[i].contains(val)) return false;
                rows[i].add(val);

                // Check for duplicates in the col
                if (cols[j].contains(val)) return false;
                cols[j].add(val);

                // Check for duplicates in the sub-boxes
                // Calculate the sub-matrix index
                int idx = (i / 3) * 3 + (j / 3);
                if (boxes[idx].contains(val)) return false;
                boxes[idx].add(val);
            }
        }

        return true;
    }
}
