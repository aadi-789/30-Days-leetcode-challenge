

public class FindFirstandLastPositionofElementinArray {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    private int findFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result = mid;
                right = mid - 1;  // Search further left
            } 
            else if (nums[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return result;
    }

    private int findLast(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result = mid;
                left = mid + 1;   // Search further right
            } 
            else if (nums[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        FindFirstandLastPositionofElementinArray finder = new FindFirstandLastPositionofElementinArray();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = finder.searchRange(nums, target);
        System.out.println("First and last position of target " + target + ": [" + result[0] + ", " + result[1] + "]");
    }
}
