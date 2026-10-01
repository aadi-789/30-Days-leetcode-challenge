# LeetCode 102 — Binary Tree Level Order Traversal

## Problem

Return the level-order traversal of a binary tree.

## Approach

Use **BFS with a Queue**. At each iteration, store the current queue size and process exactly those nodes to create one level.

## Example

Input:
`[3,9,20,null,null,15,7]`

Output:
`[[3],[9,20],[15,7]]`

## Complexity

* Time: O(n)
* Space: O(n)

## Pattern

**Binary Tree + BFS + Queue + Level Processing**


# LeetCode 103 — Binary Tree Zigzag Level Order Traversal

## Problem

Return the level-order traversal of a binary tree while alternating the direction of each level.

## Approach

Use **BFS with a Queue**. Maintain a boolean `leftToRight`. For alternate levels, insert values at the beginning of the current list.

## Example

Input:
`[3,9,20,null,null,15,7]`

Output:
`[[3],[20,9],[15,7]]`

## Complexity

* Time: O(n²) with front insertion
* Space: O(n)

## Pattern

**Binary Tree + BFS + Queue + Level Processing + Direction Toggle**


# LeetCode 199 — Binary Tree Right Side View

## Problem

Return the values of the nodes visible when looking at a binary tree from the right side.

## Approach

Use **BFS level-order traversal**. For every level, add the **last node processed**, because it is the rightmost visible node.

## Example

Input:
`[1,2,3,null,5,null,4]`

Output:
`[1,3,4]`

## Complexity

* Time: O(n)
* Space: O(n)

## Pattern

**Binary Tree + BFS + Queue + Last Node of Each Level**

