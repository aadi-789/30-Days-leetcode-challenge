// Problem:-
// Given an array of positive integers `nums` and an integer `target`, 
// find the minimal length of a contiguous subarray whose sum is greater than or equal to `target`.

// Complexity:-
// Time: O(n)
// Space: O(1)

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            // Shrink the window while the sum is >= target
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);

                sum -= nums[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
    public static void main(String[] args) {
        MinimumSizeSubarraySum solution = new MinimumSizeSubarraySum();
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int result = solution.minSubArrayLen(target, nums);
        System.out.println("Minimum size of subarray with sum >= " + target + " is: " + result);
    }
}
