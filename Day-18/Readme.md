# LeetCode 33 — Search in Rotated Sorted Array

## Problem

Given a rotated sorted array with distinct elements, search for a target and return its index. If the target is not present, return `-1`.

## Approach

Use Binary Search.

At every step:

1. Find `mid`.
2. Determine which half is sorted.
3. Check whether the target lies inside the sorted half.
4. Search that half; otherwise search the other half.

## Example

```text
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
```

## Complexity

* Time: O(log n)
* Space: O(1)

## Pattern

Binary Search — Rotated Sorted Array

# LeetCode 153 — Find Minimum in Rotated Sorted Array

## Problem

Given a rotated sorted array of unique elements, find the minimum element.

## Approach

Use Binary Search.

Compare `nums[mid]` with `nums[right]`:

* If `nums[mid] > nums[right]`, the minimum is in the right half.
* Otherwise, the minimum is at `mid` or in the left half.

Continue until `left == right`.

## Example

```text
Input: nums = [4,5,6,7,0,1,2]
Output: 0
```

## Complexity

* Time: O(log n)
* Space: O(1)

## Pattern

Binary Search — Rotated Sorted Array


# LeetCode 34 — Find First and Last Position of Element in Sorted Array

## Problem

Given a sorted array, find the starting and ending position of a given target value. Return `[-1, -1]` if the target is not present.

## Approach

Use Binary Search twice.

* For the first occurrence, continue searching to the left after finding the target.
* For the last occurrence, continue searching to the right after finding the target.

## Example

```text
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
```

## Complexity

* Time: O(log n)
* Space: O(1)

## Pattern

Binary Search — First and Last Occurrence / Boundary Search
