// Problem:-
// Given an integer array `nums`, return an array `answer` such that:
// `answer[i]` is equal to the product of all elements of `nums` except `nums[i]`.
// The solution should not use division.

// Time Complexity: O(n)
// Space Complexity: O(1) (excluding the output array)

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];

        // Store prefix products
        answer[0] = 1;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Store suffix products and multiply with prefix
        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {

            answer[i] = answer[i] * suffix;

            suffix = suffix * nums[i];
        }

        return answer;
    }
}
