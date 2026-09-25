# LeetCode 739 — Daily Temperatures

## Problem

Given an array of daily temperatures, return an array where `answer[i]` tells how many days you have to wait until a warmer temperature.

If there is no future warmer day, return `0`.

## Approach

Use a **Monotonic Stack**.

Store the **indices** of temperatures that are waiting for a warmer temperature.

For every current temperature:

* If it is greater than the temperature at the stack's top index, we found the warmer day.
* Pop that index.
* Calculate the waiting days using `currentIndex - previousIndex`.
* Push the current index into the stack.

## Example

Input:
`[73,74,75,71,69,72,76,73]`

Output:
`[1,1,4,2,1,1,0,0]`

## Complexity

* Time: `O(n)`
* Space: `O(n)`

## Pattern

Monotonic Stack


# LeetCode 496 — Next Greater Element I

## Problem
For each element in `nums1`, find the next greater element of that element in `nums2`.

If no greater element exists, return `-1`.

## Approach
Use a decreasing monotonic stack while traversing `nums2`.

- If the current number is greater than the stack top, it is the next greater element.
- Store the result in a HashMap.
- Use the HashMap to construct the answer for `nums1`.

## Example

Input:
nums1 = [4,1,2]
nums2 = [1,3,4,2]

Output:
[-1,3,-1]

## Complexity
Time: O(n + m)
Space: O(n)

## Pattern
Monotonic Stack

# LeetCode 503 — Next Greater Element II

## Problem

Given a circular integer array, find the next greater element for every element.

If no greater element exists, return `-1`.

## Approach

Use a **Monotonic Stack**.

Because the array is circular, traverse it twice using:

`index = i % n`

The first traversal pushes indices into the stack. During the second traversal, we use the wrapped-around elements to find greater elements for the remaining indices.

## Example

Input:
`[1,2,1]`

Output:
`[2,-1,2]`

## Complexity

* Time: `O(n)`
* Space: `O(n)`

## Pattern

Monotonic Stack + Circular Array
