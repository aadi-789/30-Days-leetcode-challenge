// Problem
// Given an integer array nums and an integer k, return the k most frequent elements.
// Complexity:-
// Time: O(n log k) where n is the number of elements in nums
// Space: O(n + k)


import java.util.*;


public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Min Heap: [number, frequency]
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> a[1] - b[1]);

        // Keep only k most frequent elements
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            pq.offer(new int[] { entry.getKey(), entry.getValue() });

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = pq.poll()[0];
        }

        return result;
    }
}
