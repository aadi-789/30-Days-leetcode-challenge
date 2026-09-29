# LeetCode 104 — Maximum Depth of Binary Tree

## Problem

Given the root of a binary tree, return its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node to the farthest leaf node.

## Approach

Use recursion:

1. If the node is `null`, return `0`.
2. Recursively find the depth of the left subtree.
3. Recursively find the depth of the right subtree.
4. Return `1 + max(leftDepth, rightDepth)`.

## Example

```text
Input:
    3
   / \
  9  20
     / \
    15  7

Output:
3
```

## Complexity

* Time: `O(n)`
* Space: `O(h)`

## Pattern

**Binary Tree + Recursion + DFS**


# LeetCode 226 — Invert Binary Tree

## Problem

Given the root of a binary tree, invert the tree and return its root.

Inverting means swapping the left and right children of every node.

## Approach

Use recursion:

1. If the root is `null`, return `null`.
2. Swap the left and right children.
3. Recursively invert the left subtree.
4. Recursively invert the right subtree.
5. Return the root.

## Example

```text
Input:
    4
   / \
  2   7
 / \ / \
1  3 6  9

Output:
    4
   / \
  7   2
 / \ / \
9  6 3  1
```

## Complexity

* Time: `O(n)`
* Space: `O(h)`

## Pattern

**Binary Tree + Recursion + DFS**


# LeetCode 100 — Same Tree

## Problem

Given the roots of two binary trees, determine whether the two trees are the same.

Two trees are the same if they have the same structure and the same node values.

## Approach

Use recursion:

1. If both nodes are `null`, return `true`.
2. If one node is `null`, return `false`.
3. If their values are different, return `false`.
4. Recursively compare their left subtrees.
5. Recursively compare their right subtrees.
6. Both subtrees must be identical.

## Example

```text
Tree 1:       1          Tree 2:       1
             / \                     / \
            2   3                   2   3

Output:
true
```

## Complexity

* Time: `O(n)`
* Space: `O(h)`

## Pattern

**Binary Tree + Recursion + DFS + Tree Comparison**
