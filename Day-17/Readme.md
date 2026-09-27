# LeetCode 704 — Binary Search

## Problem

Given a sorted array `nums` and a target value, return the index of the target if it exists. Otherwise, return `-1`.

## Approach

* Use two pointers: `left` and `right`.
* Find the middle element.
* If `nums[mid] == target`, return `mid`.
* If `nums[mid] < target`, search the right half.
* If `nums[mid] > target`, search the left half.
* Continue until `left > right`.

## Example

```text
Input:
nums = [-1,0,3,5,9,12]
target = 9

Output:
4
```

## Complexity

* Time: `O(log n)`
* Space: `O(1)`

## Pattern

Binary Search

# LeetCode 35 — Search Insert Position

## Problem

Given a sorted array `nums` and a target value, return the index if the target exists. Otherwise, return the index where the target should be inserted to maintain sorted order.

## Approach

* Apply Binary Search.
* If the target is found, return `mid`.
* If `nums[mid] < target`, search the right half.
* If `nums[mid] > target`, search the left half.
* When the loop ends, return `left` because it represents the correct insertion position.

## Example

```text
Input:
nums = [1,3,5,6]
target = 2

Output:
1
```

## Complexity

* Time: `O(log n)`
* Space: `O(1)`

## Pattern

Binary Search


# LeetCode 74 — Search a 2D Matrix

## Problem

Given an `m x n` matrix where each row is sorted and the first element of each row is greater than the last element of the previous row, determine whether a target exists in the matrix.

## Approach

* Treat the matrix as a sorted 1D array.
* Apply Binary Search from index `0` to `rows * cols - 1`.
* Convert the 1D `mid` index into a matrix position:

  * `row = mid / cols`
  * `col = mid % cols`
* Compare `matrix[row][col]` with the target.
* Adjust `left` and `right` accordingly.

## Example

```text
Input:
matrix = [
  [1,3,5,7],
  [10,11,16,20],
  [23,30,34,60]
]
target = 16

Output:
true
```

## Complexity

* Time: `O(log(m × n))`
* Space: `O(1)`

## Pattern

Binary Search — 2D Matrix
