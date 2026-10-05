# Day 26 — Grid DFS / Graph Traversal

## Problems

1. [LeetCode 200 — Number of Islands]
2. [LeetCode 695 — Max Area of Island]
3. [LeetCode 733 — Flood Fill]

---

## Core Pattern

Today's problems introduce **Grid DFS (Depth First Search)**.

Whenever a problem contains a 2D grid and asks us to work with **connected cells**, we can think about:

- DFS / BFS
- Four-directional movement
- Boundary checking
- Marking cells as visited
- Connected components

Standard four directions:

```text
        Up
        ↑
Left ← Cell → Right
        ↓
       Down
```

---

# 1. LeetCode 200 — Number of Islands

### Problem

Given a 2D grid containing `'1'` for land and `'0'` for water, find the number of distinct islands.

An island is formed by horizontally or vertically connected land cells.

### Approach

Use **DFS** to explore each island completely.

1. Traverse every cell in the grid.
2. When a `'1'` is found, it represents a new island.
3. Increment the island count.
4. Run DFS to visit all connected land cells.
5. Mark visited land cells as `'0'` so they are not counted again.

### Example

```text
Input:

1 1 0 0
1 0 0 1
0 0 1 1

Output:

3
```

There are three separate connected groups of land.

### Complexity

- **Time:** `O(m × n)`
- **Space:** `O(m × n)` worst case due to DFS recursion.

### Pattern

**Grid Traversal + DFS + Connected Components**

### Key Point

The important idea is:

> Find an unvisited land cell → count one island → DFS through the entire connected component.

---

# 2. LeetCode 695 — Max Area of Island

### Problem

Given a binary grid, find the maximum area of an island.

The area of an island is the number of connected land cells.

### Approach

This uses the same DFS pattern as Number of Islands, but instead of simply counting islands, DFS **returns the area**.

For every land cell:

1. Start DFS.
2. Mark the cell as visited.
3. Count the current cell as `1`.
4. Recursively calculate the area in four directions.
5. Keep track of the maximum area.

### Example

```text
Input:

1 1 0
1 0 0
1 1 1

Output:

5
```

The largest connected island contains 5 cells.

### Complexity

- **Time:** `O(m × n)`
- **Space:** `O(m × n)` worst case.

### Pattern

**Grid DFS + Connected Component Size**

### Key Point

Compared with Number of Islands:

```text
Number of Islands → Count components

Max Area of Island → Calculate component size
```

The DFS return value is the main difference.

---

# 3. LeetCode 733 — Flood Fill

### Problem

Given an image and a starting pixel `(sr, sc)`, change the color of that pixel and all connected pixels having the same original color.

### Approach

Use DFS starting from `(sr, sc)`.

1. Store the original color.
2. If the original color is already equal to the new color, return immediately.
3. Change the current pixel to the new color.
4. Visit its four neighboring cells.
5. Continue only when the neighboring cell has the original color.

### Example

```text
Input:

1 1 1
1 1 0
1 0 1

Starting cell = (1, 1)
New color = 2

Output:

2 2 2
2 2 0
2 0 1
```

Only connected cells having the original color are changed.

### Complexity

- **Time:** `O(m × n)`
- **Space:** `O(m × n)` worst case.

### Pattern

**DFS + Same-Color Connected Cells**

### Key Point

The important condition is:

```text
Only visit cells having the original color.
```

---

# Comparison of Today's Problems

| Problem | Main Goal | DFS Result |
|---|---|---|
| 200 — Number of Islands | Count islands | Number of components |
| 695 — Max Area of Island | Find largest island | Component size |
| 733 — Flood Fill | Change connected cells | Modify grid |

---

# Important Grid DFS Template

```java
private void dfs(int[][] grid, int row, int col) {

    if (row < 0 || row >= grid.length ||
        col < 0 || col >= grid[0].length) {
        return;
    }

    // Process current cell

    dfs(grid, row + 1, col);
    dfs(grid, row - 1, col);
    dfs(grid, row, col + 1);
    dfs(grid, row, col - 1);
}
```

The main thing that changes between problems is **what we do inside DFS**.

---

# What I Learned

- How to perform DFS on a 2D grid.
- How to move in four directions.
- How to mark cells as visited.
- How to find connected components.
- How to calculate the size of a connected component.
- How to modify connected cells using DFS.
- Recognized **Grid DFS** as a reusable interview pattern.

## Pattern to Remember

```text
2D Grid
   ↓
Find relevant cell
   ↓
DFS / BFS
   ↓
Visit 4 directions
   ↓
Mark / Count / Calculate / Modify
```

### Interview Tip

If you see a question involving:

- Islands
- Connected cells
- Flood fill
- Regions
- Groups in a matrix
- Four-direction movement

Think:

> **DFS/BFS on a Grid**