// Problem:-
// Given an integer array `nums` and an integer `k`, find the contiguous subarray of length `k` with the maximum average.

// Complexity:-
// Time: O(n)
// Space: O(1)

public class MaximumAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        // Sum of first k elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Sliding window
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - k];

            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
    public static void main(String[] args) {
        MaximumAverageSubarray solution = new MaximumAverageSubarray();
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double result = solution.findMaxAverage(nums, k);
        System.out.println("Maximum average of subarray of length " + k + " is: " + result);
    }
}
