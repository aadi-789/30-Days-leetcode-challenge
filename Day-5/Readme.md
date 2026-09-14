# LeetCode 643 — Maximum Average Subarray I

## Problem

Given an integer array `nums` and an integer `k`, find the contiguous subarray of length `k` with the maximum average.

## Approach

Use a fixed-size Sliding Window.

Calculate the sum of the first `k` elements, then slide the window by adding the new element and removing the element that leaves the window.

Keep track of the maximum sum and return `maxSum / k`.

## Example

Input:
nums = [1, 12, -5, -6, 50, 3]
k = 4

Output:
12.75

## Complexity

Time: O(n)
Space: O(1)

## Pattern

Fixed-Size Sliding Window


# LeetCode 3 — Longest Substring Without Repeating Characters

## Problem

Given a string `s`, find the length of the longest substring without repeating characters.

## Approach

Use a variable-size Sliding Window with a `HashSet`.

Expand the window using `right`. If a duplicate character appears, remove characters from the left until the duplicate is removed.

Keep track of the maximum window length.

## Example

Input:
s = "abcabcbb"

Output:
3

## Complexity

Time: O(n)
Space: O(min(n, character set size))

## Pattern

Variable-Size Sliding Window + HashSet

# LeetCode 209 — Minimum Size Subarray Sum

## Problem

Given an array of positive integers `nums` and an integer `target`, find the minimal length of a contiguous subarray whose sum is greater than or equal to `target`.

## Approach

Use a variable-size Sliding Window.

Expand the window using `right` until the sum becomes greater than or equal to `target`. Then shrink the window from the left while the condition remains satisfied.

Track the minimum window length.

## Example

Input:
target = 7
nums = [2, 3, 1, 2, 4, 3]

Output:
2

## Complexity

Time: O(n)
Space: O(1)

## Pattern

Variable-Size Sliding Window