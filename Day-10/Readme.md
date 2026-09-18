# LeetCode 73 — Set Matrix Zeroes

## Problem

Given an `m x n` matrix, if an element is `0`, set its entire row and column to `0`. Modify the matrix in-place.

## Approach

Use the first row and first column as markers.

* If `matrix[i][j] == 0`, mark `matrix[i][0]` and `matrix[0][j]` as `0`.
* Use `firstRow` and `firstCol` to remember whether the first row/column originally contained `0`.
* Traverse the inner matrix and set cells to `0` based on the markers.
* Finally, process the first row and first column.

## Example

```text
Input:
1 1 1
1 0 1
1 1 1

Output:
1 0 1
0 0 0
1 0 1
```

## Complexity

* Time: `O(m × n)`
* Space: `O(1)`

## Pattern

Matrix traversal + In-place marking

# LeetCode 54 — Spiral Matrix

## Problem

Given an `m x n` matrix, return all elements in spiral order.

## Approach

Use four boundaries: `top`, `bottom`, `left`, and `right`.

Traverse the matrix in four directions:

1. Left → Right, then `top++`
2. Top → Bottom, then `right--`
3. Right → Left, then `bottom--`
4. Bottom → Top, then `left++`

Continue while `top <= bottom` and `left <= right`.

## Example

```text
Input:
1 2 3
4 5 6
7 8 9

Output:
[1,2,3,6,9,8,7,4,5]
```

## Complexity

* Time: `O(m × n)`
* Space: `O(1)` excluding the output list

## Pattern

Matrix traversal + Boundary Shrinking


# LeetCode 48 — Rotate Image

## Problem

Given an `n x n` matrix, rotate the image 90 degrees clockwise in-place.

## Approach

Use two steps:

1. **Transpose** the matrix by swapping `matrix[i][j]` with `matrix[j][i]`.
2. **Reverse every row** using two pointers.

Transpose converts rows into columns, and reversing each row produces the 90° clockwise rotation.

## Example

```text
Input:
1 2 3
4 5 6
7 8 9

Output:
7 4 1
8 5 2
9 6 3
```

## Complexity

* Time: `O(n²)`
* Space: `O(1)`

## Pattern

Matrix Rotation → Transpose + Reverse Rows
