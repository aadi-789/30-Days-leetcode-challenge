# LeetCode 206 — Reverse Linked List

## Problem

Reverse a singly linked list and return the new head.

## Approach

Use three pointers: `prev`, `curr`, and `next`.

For every node:

1. Save `curr.next`.
2. Reverse `curr.next` to point to `prev`.
3. Move `prev` and `curr` forward.

## Example

Input:
`1 → 2 → 3 → 4 → null`

Output:
`4 → 3 → 2 → 1 → null`

## Complexity

* Time: O(n)
* Space: O(1)

## Pattern

**Linked List Reversal — Save → Reverse → Move**


# LeetCode 21 — Merge Two Sorted Lists

## Problem

Merge two sorted linked lists into one sorted linked list.

## Approach

Use a `dummy` node and a `curr` pointer.

Compare the current nodes of both lists, attach the smaller node to the result, and move that list forward. When one list ends, attach the remaining list.

## Example

Input:
`list1 = 1 → 2 → 4`
`list2 = 1 → 3 → 4`

Output:
`1 → 1 → 2 → 3 → 4 → 4`

## Complexity

* Time: O(n + m)
* Space: O(1)

## Pattern

**Linked List Merge — Compare → Take Smaller → Move**


# LeetCode 83 — Remove Duplicates from Sorted List

## Problem

Remove duplicate values from a sorted linked list so that each value appears only once.

## Approach

Traverse the list using `curr`. Since the list is sorted, duplicates are adjacent.

If `curr.val == curr.next.val`, skip the duplicate using:
`curr.next = curr.next.next`

Otherwise, move `curr` forward.

## Example

Input:
`1 → 1 → 2 → 3 → 3`

Output:
`1 → 2 → 3`

## Complexity

* Time: O(n)
* Space: O(1)

## Pattern

**Sorted Linked List — Compare Adjacent Nodes → Skip Duplicate**
