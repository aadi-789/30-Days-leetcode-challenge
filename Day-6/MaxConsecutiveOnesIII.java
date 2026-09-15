// Problem:-
// Given a binary array nums and an integer k, 
// return the maximum number of consecutive 1s that can be obtained by flipping at most k zeros.
// Complexity:-
// Time: O(n)  
// Space: O(1)

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int zeros = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                zeros++;
            }

            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
    public static void main(String[] args) {
        MaxConsecutiveOnesIII solution = new MaxConsecutiveOnesIII();
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0, 1};
        int k = 2;
        int result = solution.longestOnes(nums, k);
        System.out.println("The length of the longest subarray after flipping is: " + result);
    }
}
