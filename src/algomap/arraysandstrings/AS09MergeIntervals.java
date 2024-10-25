package algomap.arraysandstrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// https://leetcode.com/problems/merge-intervals/description/
public class AS09MergeIntervals {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 3}, {2, 4}, {6, 8}, {9, 10}};
        int[][] arr2 = new int[][] {{6, 8}, {1, 9}, {2, 4}, {4, 7}};
        int[][] arr3 = new int[][] {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        merge_solution1(arr1);
        merge_solution1(arr2);
        merge_solution1(arr3);

        System.out.println();
        System.out.print("-----------------");

        merge_solution2(arr1);
        merge_solution2(arr2);
        merge_solution2(arr3);
    }

    // TC = O(n^2), SC = O(1)
    public static int[][] merge_solution1(int[][] intervals) {
        int n = intervals.length;

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            // Skipping already merged intervals
            if (!res.isEmpty() && res.getLast()[1] >= end) {
                continue;
            }

            // Find the end of the merged range
            for (int j = i + 1; j < n; j++) {
                if (intervals[j][0] <= end) {
                    end = Math.max(end, intervals[j][1]);
                }
            }

            res.add(new int[]{start, end});
        }

        System.out.println();
        res.forEach(a -> System.out.print(Arrays.toString(a)));
        return res.toArray(new int[][]{});
    }

    // TC = O(nlogn), SC = O(1)
    private static int[][] merge_solution2(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> res = new ArrayList<>();
        res.add(new int[]{intervals[0][0], intervals[0][1]});

        for (int i = 1; i < intervals.length; i++) {
            int[] last = res.getLast();
            int[] cur = intervals[i];

            // If current interval overlaps with the last merged interval, then merge them.
            // If not, then just add the next interval
            if (cur[0] <= last[1]) {
                last[1] = Math.max(last[1], cur[1]);
            } else {
                res.add(new int[]{cur[0], cur[1]});
            }
        }

        System.out.println();
        res.forEach(a -> System.out.print(Arrays.toString(a)));
        return res.toArray(new int[][]{});
    }
}
