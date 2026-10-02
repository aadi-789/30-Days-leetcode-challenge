# LeetCode 98 - Validate Binary Search Tree

## Problem
Determine whether a binary tree is a valid Binary Search Tree.

## Approach
Use recursion with a valid range `(min, max)` for every node.
- Left subtree must contain values smaller than the current node.
- Right subtree must contain values greater than the current node.
- Update the range while moving down the tree.

## Example
Input: [5,1,4,null,null,3,6]
Output: false

## Complexity
Time: O(n)
Space: O(h)

## Pattern
BST + Range Validation

# LeetCode 235 - Lowest Common Ancestor of a BST

## Problem
Find the lowest common ancestor of two nodes in a Binary Search Tree.

## Approach
Use the BST property:
- If both nodes are smaller than root, move left.
- If both nodes are greater than root, move right.
- Otherwise, the current root is the LCA.

## Example
Input: root = [6,2,8,0,4,7,9], p = 2, q = 8
Output: 6

## Complexity
Time: O(h)
Space: O(h)

## Pattern
BST + Lowest Common Ancestor

# LeetCode 230 - Kth Smallest Element in a BST

## Problem
Find the kth smallest element in a Binary Search Tree.

## Approach
Perform inorder traversal.
Inorder traversal of a BST visits nodes in ascending sorted order.
Maintain a counter and return the node when count becomes k.

## Example
Input: root = [3,1,4,null,2], k = 1
Output: 1

## Complexity
Time: O(h + k)
Space: O(h)

## Pattern
BST + Inorder Traversal