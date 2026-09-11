// Problem:-
// Given an integer array `nums` and an integer `k`, 
// return the total number of continuous subarrays whose sum equals `k`.

// Complexity:-
//  Time: O(n)
//  Space: O(n)



import java.util.HashMap;
public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 has occurred once
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {

            prefixSum += num;

            // Check if a previous prefix sum exists
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            // Store/update frequency of current prefix sum
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
    public static void main(String[] args) {
        SubarraySumEqualsK solution = new SubarraySumEqualsK();
        int[] nums = {1, 2, 3};
        int k = 3;
        int result = solution.subarraySum(nums, k);
        System.out.println("Number of subarrays with sum " + k + ": " + result);
    }
}
