# LeetCode 215 — Kth Largest Element in an Array

## Problem
Given an integer array `nums` and an integer `k`, return the `k`th largest element.

The answer represents the element in sorted order, not necessarily the `k`th distinct element.

## Approach
Use a **Min Heap** of size `k`.

- Add every element to the heap.
- If the heap size becomes greater than `k`, remove the smallest element.
- After processing all elements, the heap contains the `k` largest elements.
- The root of the Min Heap is the `k`th largest element.

## Example

```text
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
```

The two largest elements are `[5, 6]`, so the 2nd largest is `5`.

## Complexity
- Time: `O(n log k)`
- Space: `O(k)`

## Pattern
**Kth Largest → Min Heap of size K**

# LeetCode 973 — K Closest Points to Origin

## Problem
Given an array of points where `points[i] = [x, y]`, return the `k` points closest to the origin `(0, 0)`.

## Approach
Calculate the squared distance:

```text
distance = x² + y²
```

Use a **Max Heap of size `k`**.

- Add each point to the heap.
- The farthest point is kept at the top.
- If the heap size exceeds `k`, remove the farthest point.
- At the end, the heap contains the `k` closest points.

Square root is not required because it does not change the ordering of distances.

## Example

```text
Input:
points = [[1,3],[-2,2],[5,8]]
k = 2

Output:
[[-2,2],[1,3]]
```

## Complexity
- Time: `O(n log k)`
- Space: `O(k)`

## Pattern
**K Closest → Max Heap of size K**

# LeetCode 621 — Task Scheduler

## Problem
Given a list of tasks and a cooldown interval `n`, schedule the tasks so that identical tasks have at least `n` intervals between them.

Return the minimum time required to complete all tasks.

## Approach
1. Count the frequency of each task.
2. Store the frequencies in a **Max Heap**.
3. Always select the task with the highest remaining frequency.
4. Process tasks in cycles of `n + 1`.
5. Decrease the frequency after executing a task.
6. If tasks still remain, unused positions in the cycle become idle time.

## Example

```text
Input:
tasks = [A,A,A,B,B,B]
n = 2

Schedule:
A B idle A B idle A B

Output:
8
```

## Complexity
- Time: `O(N log 26)` → effectively `O(N)`
- Space: `O(26)` → effectively `O(1)`

## Pattern
**Frequency Counting + Max Heap + Simulation**