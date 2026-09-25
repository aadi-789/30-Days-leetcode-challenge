

import java.util.*;

public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();

        // Traverse twice because the array is circular
        for (int i = 0; i < 2 * n; i++) {

            int index = i % n;

            while (!stack.isEmpty() &&
                   nums[index] > nums[stack.peek()]) {

                int previousIndex = stack.pop();
                result[previousIndex] = nums[index];
            }

            // Push only during the first traversal
            if (i < n) {
                stack.push(index);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        NextGreaterElementII nge = new NextGreaterElementII();
        int[] nums = {1, 2, 1};
        int[] result = nge.nextGreaterElements(nums);
        System.out.println(Arrays.toString(result));
    }
}
