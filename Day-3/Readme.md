# LeetCode 125 — Valid Palindrome

## Problem

Given a string `s`, determine if it is a palindrome after converting uppercase letters to lowercase and removing all non-alphanumeric characters.

## Approach

Use two pointers, one from the beginning and one from the end. Skip non-alphanumeric characters and compare the remaining characters case-insensitively.

## Example

**Input:**  
`"A man, a plan, a canal: Panama"`

**Output:**  
`true`

## Complexity

- **Time:** `O(n)`
- **Space:** `O(1)`

## Pattern

Two Pointers


# LeetCode 167 — Two Sum II: Input Array Is Sorted

## Problem

Given a sorted array `numbers` and a target, return the 1-based indices of two numbers that add up to the target.

## Approach

Use two pointers, `left` at the beginning and `right` at the end. If the sum is smaller than the target, move `left` forward. If the sum is larger, move `right` backward.

## Example

**Input:**  
`numbers = [2, 7, 11, 15]`  
`target = 9`

**Output:**  
`[1, 2]`

## Complexity

- **Time:** `O(n)`
- **Space:** `O(1)`

## Pattern

Two Pointers


# LeetCode 15 — 3Sum

## Problem

Given an integer array `nums`, return all unique triplets `[nums[i], nums[j], nums[k]]` such that their sum is `0`.

## Approach

Sort the array. Fix one element and use two pointers on the remaining elements. Move `left` when the sum is smaller than `0` and move `right` when the sum is greater than `0`. Skip duplicates to avoid duplicate triplets.

## Example

**Input:**  
`[-1, 0, 1, 2, -1, -4]`

**Output:**  
`[[-1, -1, 2], [-1, 0, 1]]`

## Complexity

- **Time:** `O(n²)`
- **Space:** `O(1)` excluding the output list.

## Pattern

Two Pointers