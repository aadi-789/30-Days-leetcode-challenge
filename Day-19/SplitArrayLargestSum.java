

public class SplitArrayLargestSum {
    public int splitArray(int[] nums, int k) {

        int low = 0;
        int high = 0;

        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        int answer = high;

        while (low <= high) {

            int maxSum = low + (high - low) / 2;

            if (canSplit(nums, k, maxSum)) {
                answer = maxSum;
                high = maxSum - 1;
            } else {
                low = maxSum + 1;
            }
        }

        return answer;
    }

    private boolean canSplit(int[] nums, int k, int maxSum) {

        int subarrays = 1;
        int currentSum = 0;

        for (int num : nums) {

            if (currentSum + num > maxSum) {
                subarrays++;
                currentSum = 0;
            }

            currentSum += num;

            if (subarrays > k) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        SplitArrayLargestSum splitter = new SplitArrayLargestSum();
        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;
        int result = splitter.splitArray(nums, k);
        System.out.println("Minimum largest sum after splitting: " + result); // Output: Minimum largest sum after splitting: 18
    }
}
