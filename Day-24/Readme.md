# LeetCode 105 - Construct Binary Tree from Preorder and Inorder Traversal

## Problem
Given two integer arrays `preorder` and `inorder`, construct the binary tree and return its root.

- Preorder traversal: Root → Left → Right
- Inorder traversal: Left → Root → Right

## Approach

The first element of the preorder array is always the root of the current subtree.

1. Store every inorder value and its index in a HashMap.
2. Take the current preorder element as the root.
3. Find the root's position in the inorder array.
4. Elements before the root belong to the left subtree.
5. Elements after the root belong to the right subtree.
6. Recursively construct both subtrees.

### Example

Input:
preorder = [3,9,20,15,7]
inorder  = [9,3,15,20,7]

Output:
        3
       / \
      9   20
         /  \
        15   7

## Why It Works

Preorder tells us which node comes first (the root),
while inorder tells us which nodes belong to the left and right subtrees.

## Complexity

Time: O(n)
Space: O(n)

## Pattern
Binary Tree + Recursion + HashMap

# LeetCode 236 - Lowest Common Ancestor of a Binary Tree

## Problem
Given the root of a binary tree and two nodes `p` and `q`,
find their Lowest Common Ancestor (LCA).

The LCA is the lowest/deepest node in the tree that has both
`p` and `q` as descendants.

## Approach

Use recursive DFS.

For every node:

1. If the node is null, return null.
2. If the node is `p` or `q`, return the node.
3. Recursively search the left subtree.
4. Recursively search the right subtree.
5. If both sides return non-null values, the current node is the LCA.
6. Otherwise return the non-null side.

### Example

        3
       / \
      5   1
     / \ / \
    6  2 0  8

For p = 5 and q = 1:

LCA = 3

## Key Idea

If one target is found in the left subtree and the other
is found in the right subtree, the current node is their LCA.

## Complexity

Time: O(n)
Space: O(h)

Where:
- n = number of nodes
- h = height of the tree

## Pattern
Binary Tree + DFS + Recursion + Lowest Common Ancestor

# LeetCode 572 - Subtree of Another Tree

## Problem
Given two binary trees `root` and `subRoot`, determine whether
`subRoot` is a subtree of `root`.

A subtree must have the same node values and the same structure.

## Approach

Use two recursive functions:

### 1. isSubtree()
Search every node of the main tree as a possible starting point.

### 2. isSameTree()
Check whether the tree starting from the current node is exactly
the same as `subRoot`.

The trees are considered identical only when:

- Both nodes are null
- Their values are equal
- Their left subtrees are identical
- Their right subtrees are identical

### Example

Root:

        3
       / \
      4   5
     / \
    1   2

SubRoot:

      4
     / \
    1   2

Output: true

## Important Point

Finding the same value is not enough.

The complete structure and corresponding node values must match.

## Complexity

Time: O(n * m) in the worst case
Space: O(h)

Where:
- n = nodes in root
- m = nodes in subRoot
- h = height of root

## Pattern
Binary Tree + DFS + Recursion + Tree Comparison