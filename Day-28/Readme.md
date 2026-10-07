# Day 28 — BFS

## Problems

1. LeetCode 994 — Rotting Oranges
2. LeetCode 286 — Walls and Gates
3. LeetCode 127 — Word Ladder

---

## 1. Rotting Oranges — LeetCode 994

### Problem
Given a grid containing:
- `0` → Empty cell
- `1` → Fresh orange
- `2` → Rotten orange

Every minute, a rotten orange makes its adjacent fresh oranges rotten. Return the minimum number of minutes required to rot all oranges. If impossible, return `-1`.

### Approach
Use **Multi-Source BFS**.

- Add all initially rotten oranges to the queue.
- Count all fresh oranges.
- Process the queue level by level.
- Each BFS level represents one minute.
- When a fresh orange becomes rotten, decrease the fresh count.
- If all fresh oranges become rotten, return the number of minutes.

### Example

```text
Input:
[[2,1,1],
 [1,1,0],
 [0,1,1]]

Output:
4
```

### Complexity
- Time: `O(m × n)`
- Space: `O(m × n)`

### Pattern
**Multi-Source BFS + Grid Traversal**

---

## 2. Walls and Gates — LeetCode 286

### Problem
Given a grid where:
- `0` → Gate
- `-1` → Wall
- `Integer.MAX_VALUE` → Empty room

Fill every empty room with its shortest distance from a gate.

### Approach
Use **Multi-Source BFS**.

- Add all gates to the queue initially.
- Start BFS from all gates simultaneously.
- For every unvisited empty room, set its distance to:
  `current distance + 1`
- Walls and already visited rooms are ignored.

Starting from all gates at once guarantees that the first distance assigned to a room is its shortest distance.

### Example

```text
Input:
[INF, -1, 0, INF]
[INF, INF, INF, -1]
[INF, -1, INF, -1]
[0, -1, INF, INF]

Output:
[3, -1, 0, 1]
[2, 2, 1, -1]
[1, -1, 2, -1]
[0, -1, 3, 4]
```

### Complexity
- Time: `O(m × n)`
- Space: `O(m × n)`

### Pattern
**Multi-Source BFS + Shortest Distance**

---

## 3. Word Ladder — LeetCode 127

### Problem
Given a `beginWord`, an `endWord`, and a dictionary of words, find the shortest transformation sequence from `beginWord` to `endWord`.

Rules:
- Change only one character at a time.
- Every intermediate word must exist in the dictionary.
- Return the number of words in the shortest sequence.
- Return `0` if no transformation is possible.

### Approach
Use **BFS** because we need the shortest transformation.

For every word:
1. Change each character one by one.
2. Try all letters from `a` to `z`.
3. If the generated word exists in the dictionary and has not been visited, add it to the queue.
4. Process level by level until `endWord` is reached.

### Example

```text
beginWord = "hit"
endWord = "cog"

wordList = ["hot","dot","dog","lot","log","cog"]

Transformation:

hit → hot → dot → dog → cog

Output:
5
```

### Complexity

Let:
- `N` = number of words
- `L` = length of each word

- Time: `O(N × L × 26)` ≈ `O(N × L)`
- Space: `O(N)`

### Pattern
**BFS + Shortest Path + String Transformation**

---

# Key Concepts Learned

### 1. Multi-Source BFS

When there are multiple starting points and all of them spread simultaneously, add all starting points to the queue before starting BFS.

Examples:

```text
Rotting Oranges → Rotten oranges
Walls and Gates → Gates
```

### 2. BFS for Shortest Path

In an unweighted graph, BFS finds the shortest path because it explores nodes level by level.

```text
Level 0
   ↓
Level 1
   ↓
Level 2
   ↓
Level 3
```

The first time we reach the target, we have found the shortest path.

### 3. Grid BFS

For grid problems, use four directions:

```java
int[][] directions = {
    {1, 0},
    {-1, 0},
    {0, 1},
    {0, -1}
};
```

This represents:

```text
      Up
       ↑
Left ← Cell → Right
       ↓
     Down
```

---

