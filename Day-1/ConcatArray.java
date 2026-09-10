// Problem:-
// Given an integer array `nums`, create an array `ans` such that:
// ans = nums + nums
// The resulting array should contain the original array twice.

//  Complexity:-
//  Time: O(n)
//  Space: O(n)


public class ConcatArray {
     public int[] getConcatenation(int[] nums) {

        int n = nums.length;

        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {

            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        ConcatArray concatArray = new ConcatArray();
        int[] nums = {1, 2, 3};
        int[] result = concatArray.getConcatenation(nums);
        System.out.print("Concatenated array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
