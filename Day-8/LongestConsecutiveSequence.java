// Problem
// Given an unsorted array of integers, return the length of the longest consecutive elements sequence.
// The algorithm must run in O(n) time.
//complexity: O(n)
//space complexity: O(n)

import java.util.HashSet;


class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {

            // Start counting only if num is the beginning
            // of a consecutive sequence
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
    public static void main(String[] args) {
        LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest consecutive sequence length: " + lcs.longestConsecutive(nums)); // Output: 4
    }
}
