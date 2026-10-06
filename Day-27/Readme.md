# 🚀 Day 27 — Graphs

## Problems Solved

1. **LeetCode 133 — Clone Graph**
2. **LeetCode 207 — Course Schedule**
3. **LeetCode 210 — Course Schedule II**

---

## 1. Clone Graph

**LeetCode:** 133  
**Difficulty:** Medium  
**Pattern:** Graph Traversal + DFS + HashMap

### 📝 Problem

Given a reference to a node in a connected graph, create and return a **deep copy** of the entire graph.

The graph may contain cycles, so the same node should not be cloned multiple times.

### 💡 Approach

Use a `HashMap` to store the relationship:

```text
Original Node → Cloned Node
```

1. If the node is `null`, return `null`.
2. If the node is already present in the map, return its clone.
3. Create a new clone of the current node.
4. Store it in the map.
5. Recursively clone all neighboring nodes.
6. Add the cloned neighbors to the cloned node.

The `HashMap` prevents infinite recursion when the graph contains cycles.

### 🔍 Example

```text
Input:
1 -- 2
|    |
4 -- 3

Output:
Deep copy of the same graph
```

### ⏱️ Complexity

- **Time:** `O(V + E)`
- **Space:** `O(V)`

### 🎯 Pattern

**DFS + HashMap for Graph Copy**

---

## 2. Course Schedule

**LeetCode:** 207  
**Difficulty:** Medium  
**Pattern:** Topological Sort + BFS + Indegree

### 📝 Problem

There are `numCourses` courses and prerequisite relationships.

Determine whether it is possible to finish **all courses**.

If a cycle exists in the prerequisite graph, completing all courses is impossible.

### 💡 Approach

Use **Kahn's Algorithm** for Topological Sorting.

1. Build a directed graph from prerequisites.
2. Calculate the `indegree` of every course.
3. Add all courses with `indegree = 0` to a queue.
4. Remove courses from the queue one by one.
5. Decrease the indegree of their neighboring courses.
6. Add a neighbor to the queue when its indegree becomes `0`.
7. Count how many courses were processed.
8. If all courses are processed, return `true`.

If some courses cannot be processed, a **cycle exists**.

### 🔍 Example

```text
numCourses = 2
prerequisites = [[1,0]]

Graph:

0 → 1

Valid order:
0 → 1

Output:
true
```

For:

```text
[[1,0], [0,1]]
```

we get:

```text
0 → 1
↑   ↓
└───┘
```

There is a cycle, so the answer is `false`.

### ⏱️ Complexity

- **Time:** `O(V + E)`
- **Space:** `O(V + E)`

### 🎯 Pattern

**Topological Sort + Indegree + BFS**

---

## 3. Course Schedule II

**LeetCode:** 210  
**Difficulty:** Medium  
**Pattern:** Topological Sort + BFS + Indegree

### 📝 Problem

Return a valid order in which all courses can be completed.

If it is impossible because of a cycle, return an empty array.

### 💡 Approach

This problem uses the same **Kahn's Algorithm** as Course Schedule I.

The main difference is that instead of only checking whether all courses can be completed, we store the processed courses in a result array.

1. Build the directed graph.
2. Calculate the indegree of every course.
3. Add all courses with `indegree = 0` to the queue.
4. Process the queue using BFS.
5. Store every processed course in the result array.
6. Decrease the indegree of neighboring courses.
7. Add neighbors whose indegree becomes `0`.
8. If all courses are processed, return the result.
9. Otherwise, a cycle exists, so return an empty array.

### 🔍 Example

```text
Input:
numCourses = 4
prerequisites = [[1,0], [2,0], [3,1], [3,2]]

Possible order:

0 → 1 → 3
  ↘ 2 ↗

Output:
[0,1,2,3]
```

Other valid orders may also exist.

### ⏱️ Complexity

- **Time:** `O(V + E)`
- **Space:** `O(V + E)`

### 🎯 Pattern

**Topological Sort + Indegree + BFS**

---

# 🧠 Key Concepts Learned

### 1. Graph Representation

A graph can be represented using an adjacency list:

```java
List<List<Integer>> graph = new ArrayList<>();
```

Each index represents a node and its list contains its neighbors.

### 2. Indegree

`indegree[node]` represents the number of incoming edges to that node.

Example:

```text
0 → 1
0 → 2
```

Then:

```text
indegree[0] = 0
indegree[1] = 1
indegree[2] = 1
```

### 3. Topological Sort

Topological sorting produces an ordering of nodes such that:

```text
A → B
```

means `A` comes before `B`.

It works only on a **Directed Acyclic Graph (DAG)**.

### 4. Cycle Detection

In Kahn's Algorithm:

```text
processed courses == total courses
        ↓
     No cycle
```

```text
processed courses < total courses
        ↓
       Cycle
```

---

# 🔗 Pattern Connection

```text
Clone Graph
     ↓
DFS + HashMap
     
Course Schedule
     ↓
Topological Sort
     ↓
Course Schedule II
     ↓
Topological Sort + Store Order
```

The biggest takeaway from Day 27 is recognizing **Topological Sort problems from prerequisite/dependency relationships**.

---

## 📊 Complexity Summary

| Problem | Time | Space | Pattern |
|---|---:|---:|---|
| Clone Graph | `O(V + E)` | `O(V)` | DFS + HashMap |
| Course Schedule | `O(V + E)` | `O(V + E)` | Topological Sort |
| Course Schedule II | `O(V + E)` | `O(V + E)` | Topological Sort |

---

## 🎯 Interview Takeaway

When you see:

- **Graph + copy/clone** → Think `DFS/BFS + HashMap`
- **Prerequisites/dependencies** → Think `Topological Sort`
- **Need to detect a cycle in dependencies** → Think `Indegree + Kahn's Algorithm`
- **Need the actual valid order** → Topological Sort + store the result

**Day 27 completed ✅**