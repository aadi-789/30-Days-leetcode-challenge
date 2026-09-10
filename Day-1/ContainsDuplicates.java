//Problem:-Given an integer array `nums`, 
//        return `true` if any value appears at least twice in the array. 
//        Otherwise, return `false`.

//  Complexity
//  Time: O(n) 
//  Space: O(n)

import java.util.HashSet;

public class ContainsDuplicates {
     public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicates containsDuplicates = new ContainsDuplicates();
        int[] nums = {1, 2, 3, 1};
        boolean result = containsDuplicates.containsDuplicate(nums);
        System.out.println("Contains duplicates: " + result);
    }
}
