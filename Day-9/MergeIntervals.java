// Problem
// Given an array of intervals, merge all overlapping intervals.
// Complexity
// Time: O(n log n)
// Space: O(n)

import java.util.*;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {

        if (intervals.length <= 1) {
            return intervals;
        }

        // Sort by starting point
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            // Overlapping
            if (nextStart <= end) {
                end = Math.max(end, nextEnd);
            }

            // Not overlapping
            else {
                result.add(new int[] { start, end });

                start = nextStart;
                end = nextEnd;
            }
        }

        // Add the final interval
        result.add(new int[] { start, end });

        return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args) {
        MergeIntervals mi = new MergeIntervals();
        int[][] intervals = { {1, 3}, {2, 6}, {8, 10}, {15, 18} };
        int[][] merged = mi.merge(intervals);
        System.out.println(Arrays.deepToString(merged)); // Output: [[1, 6], [8, 10], [15, 18]]
    }
}
