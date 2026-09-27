

public class FindMinimuminRotatedSortedArray {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Minimum is in the right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } 
            // Minimum is at mid or in the left half
            else {
                right = mid;
            }
        }

        return nums[left];
    }
    public static void main(String[] args) {
        FindMinimuminRotatedSortedArray finder = new FindMinimuminRotatedSortedArray();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int result = finder.findMin(nums);
        System.out.println("Minimum element in the rotated sorted array: " + result);
    }
}
