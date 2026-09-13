# LeetCode 42 — Trapping Rain Water

## Problem

Given an array representing bar heights, calculate how much rainwater can be trapped between the bars.

## Approach

Use two pointers with `leftMax` and `rightMax`. Process the side with the smaller height and calculate trapped water using the maximum boundary seen on that side.

## Example

```text
Input:  [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
```

## Complexity

* Time: O(n)
* Space: O(1)

## Pattern

Two Pointers


# LeetCode 11 — Container With Most Water

## Problem

Given an array of heights, find two lines that form a container holding the maximum amount of water.

## Approach

Use two pointers starting from both ends. Calculate the area using the shorter height and the distance between the pointers. Move the pointer with the smaller height.

## Example

```text
Input:  [1,8,6,2,5,4,8,3,7]
Output: 49
```

## Complexity

* Time: O(n)
* Space: O(1)

## Pattern

Two Pointers
