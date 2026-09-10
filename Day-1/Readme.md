# LeetCode 1 — Two Sum

## Problem

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`.

## Approach

Use a `HashMap` to store each number and its index while traversing the array.

For the current number `nums[i]`, calculate:

`complement = target - nums[i]`

If the complement already exists in the map, we have found the required pair.

Otherwise, store the current number and its index in the map.

## Example

Input:
nums = [2, 7, 11, 15]
target = 9

Output:
[0, 1]

## Complexity

- Time: O(n)
- Space: O(n)

## Pattern

HashMap — Store value with its index and look for the required complement.


## 2. LeetCode 217 — Contains Duplicate

### Problem

Given an integer array `nums`, return `true` if any value appears at least twice in the array. Otherwise, return `false`.

### Approach

Use a `HashSet` to store the elements that have already been encountered.

While traversing the array:

1. Check if the current element already exists in the `HashSet`.
2. If it exists, a duplicate has been found, so return `true`.
3. Otherwise, add the element to the `HashSet`.
4. If the entire array is traversed without finding a duplicate, return `false`.

### Example

Input:
`nums = [1, 2, 3, 1]`

Output:
`true`

Explanation:

The number `1` appears twice in the array.

### Complexity

- Time: `O(n)`
- Space: `O(n)`

### Pattern

**HashSet — Use when you only need to check whether an element already exists.**


## 3. LeetCode 1929 — Concatenation of Array

### Problem

Given an integer array `nums`, create an array `ans` such that:

`ans = nums + nums`

The resulting array should contain the original array twice.

### Approach

Create a new array with size `2 * nums.length`.

Traverse the original array once:

1. Store `nums[i]` at index `i`.
2. Store the same `nums[i]` at index `i + n`, where `n` is the length of the original array.

This copies the original array into both halves of the result.

### Example

Input:
`nums = [1, 2, 1]`

Output:
`[1, 2, 1, 1, 2, 1]`

### Complexity

- Time: `O(n)`
- Space: `O(n)`

### Pattern

**Array Indexing — Use the original index for the first half and `i + n` for the second half.**