# LeetCode 19 — Remove Nth Node From End of List

## Problem

Remove the `nth` node from the end of a singly linked list and return the head.

## Approach

Use two pointers with a dummy node. Move `fast` `n` steps ahead, then move `slow` and `fast` together. When `fast` reaches the end, `slow.next` is the node to remove.

## Example

Input: `1 → 2 → 3 → 4 → 5`, `n = 2`

Output: `1 → 2 → 3 → 5`

## Complexity

Time: O(n)
Space: O(1)

## Pattern

Two Pointers / Fast & Slow Pointer


# LeetCode 234 — Palindrome Linked List

## Problem

Determine whether a singly linked list is a palindrome.

## Approach

Use fast and slow pointers to find the middle. Reverse the second half of the list, then compare it with the first half.

## Example

Input: `1 → 2 → 2 → 1`

Output: `true`

## Complexity

Time: O(n)
Space: O(1)

## Pattern

Fast & Slow Pointer + Reverse Linked List

# LeetCode 328 — Odd Even Linked List

## Problem

Rearrange a linked list so that all nodes at odd positions come first, followed by nodes at even positions.

## Approach

Maintain separate odd and even lists using pointers. Store the head of the even list, rearrange the links, then connect the odd list to the even list.

## Example

Input: `1 → 2 → 3 → 4 → 5`

Output: `1 → 3 → 5 → 2 → 4`

## Complexity

Time: O(n)
Space: O(1)

## Pattern

Linked List Pointer Manipulation
