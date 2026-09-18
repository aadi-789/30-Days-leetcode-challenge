// Problem
// Given a sorted, unique integer array, summarize consecutive numbers into ranges.
// Complexity
// Time: O(n)
// Space: O(n) for the output

import java.util.*;
class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        if (nums.length == 0) {
            return result;
        }

        int start = 0;

        for (int i = 1; i <= nums.length; i++) {

            // End of current range
            if (i == nums.length || nums[i] != nums[i - 1] + 1) {

                if (start == i - 1) {
                    // Single number
                    result.add(String.valueOf(nums[start]));
                } else {
                    // Range
                    result.add(nums[start] + "->" + nums[i - 1]);
                }

                // Start new range
                start = i;
            }
        }

        return result;
    }    
    public static void main(String[] args) {
        SummaryRanges sr = new SummaryRanges();
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> ranges = sr.summaryRanges(nums);
        System.out.println(ranges); // Output: [0->2, 4->5, 7]
    }
}