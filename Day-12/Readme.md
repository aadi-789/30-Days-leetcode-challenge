# LeetCode 141 — Linked List Cycle

## Problem
Determine whether a linked list contains a cycle.

## Approach
Use two pointers:
- Slow moves one step.
- Fast moves two steps.
- If they meet, a cycle exists.
- If fast reaches null, no cycle exists.

## Example
Input: 3 → 2 → 0 → -4 → back to 2
Output: true

## Complexity
Time: O(n)
Space: O(1)

## Pattern
Fast & Slow Pointers

# LeetCode 142 — Linked List Cycle II

## Problem
Find the node where the cycle begins in a linked list.
Return null if there is no cycle.

## Approach
Use Floyd's Fast & Slow Pointer algorithm.
First, move slow by 1 step and fast by 2 steps until they meet.
If they meet, a cycle exists.
Then move slow back to head and move both one step at a time.
Their next meeting point is the cycle's starting node.

## Example
Input: 3 → 2 → 0 → -4 → back to 2
Output: Node 2

## Complexity
Time: O(n)
Space: O(1)

## Pattern
Fast & Slow Pointers

# LeetCode 876 — Middle of the Linked List

## Problem
Find the middle node of a linked list.
If there are two middle nodes, return the second one.

## Approach
Use two pointers:
- Slow moves one step.
- Fast moves two steps.
- When fast reaches the end, slow is at the middle.

## Example
Input: 1 → 2 → 3 → 4 → 5
Output: 3 → 4 → 5

## Complexity
Time: O(n)
Space: O(1)

## Pattern
Fast & Slow Pointers