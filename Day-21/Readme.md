# LeetCode 543 - Diameter of Binary Tree

## Problem
Find the length of the longest path between any two nodes in a binary tree.

## Approach
Calculate the height of each subtree using DFS.
For every node:

diameter = leftHeight + rightHeight

Keep track of the maximum diameter.

## Example
Input: [1,2,3,4,5]
Output: 3

## Complexity
- Time: O(n)
- Space: O(h)

## Pattern
Binary Tree + DFS + Height

# LeetCode 110 - Balanced Binary Tree

## Problem
Determine whether a binary tree is height-balanced.

For every node, the difference between the heights of its left
and right subtrees must not exceed 1.

## Approach
Use DFS to calculate height.

Return -1 if a subtree is unbalanced.
Otherwise return its height.

## Example
Input: [3,9,20,null,null,15,7]
Output: true

## Complexity
- Time: O(n)
- Space: O(h)

## Pattern
Binary Tree + DFS + Height Checking

# LeetCode 112 - Path Sum

## Problem
Determine whether the tree has a root-to-leaf path
whose node values add up to targetSum.

## Approach
Subtract the current node's value from targetSum.
Recursively check the left and right subtrees.

At a leaf node, check whether targetSum equals the node value.

## Example
Input: [5,4,8,11,null,13,4,7,2,null,null,null,1]
Target: 22
Output: true

## Complexity
- Time: O(n)
- Space: O(h)

## Pattern
Binary Tree + DFS + Root-to-Leaf Path