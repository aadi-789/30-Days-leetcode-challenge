# LeetCode 143 — Reorder List

## Problem
Reorder a linked list from:

L0 → L1 → L2 → ... → Ln

to:

L0 → Ln → L1 → Ln-1 → L2 → ...

## Approach
1. Find the middle using slow and fast pointers.
2. Reverse the second half.
3. Merge the first half and reversed second half alternately.

## Example

Input:
1 → 2 → 3 → 4 → 5

Output:
1 → 5 → 2 → 4 → 3

## Complexity
- Time: O(n)
- Space: O(1)

## Pattern
Fast & Slow Pointers + Linked List Reversal + Merge

# LeetCode 2 — Add Two Numbers

## Problem
Two linked lists represent two non-negative integers.
Digits are stored in reverse order.

Add the two numbers and return the result as a linked list.

## Approach
1. Traverse both linked lists simultaneously.
2. Add the current digits along with carry.
3. Store `sum % 10` as the current digit.
4. Store `sum / 10` as the carry.
5. Continue until both lists and carry are exhausted.
6. Use a dummy node to simplify result construction.

## Example

Input:
l1 = 2 → 4 → 3
l2 = 5 → 6 → 4

342 + 465 = 807

Output:
7 → 0 → 8

## Complexity
- Time: O(max(n, m))
- Space: O(max(n, m))

## Pattern
Linked List + Carry + Dummy Node

# LeetCode 138 — Copy List with Random Pointer

## Problem
Each node contains:
- `val`
- `next`
- `random`

The random pointer can point to any node or `null`.

Create a deep copy of the linked list.

## Approach
1. Create a HashMap to map each original node to its copied node.
2. Traverse the original list and create all copied nodes.
3. Traverse again and connect the `next` and `random` pointers.
4. Return the copy of the original head.

## Example

Original:
1 → 2 → 3

Each node may have a random pointer to any node.

The result must contain completely new nodes with the same values and pointer relationships.

## Complexity
- Time: O(n)
- Space: O(n)

## Pattern
Linked List + HashMap + Deep Copy