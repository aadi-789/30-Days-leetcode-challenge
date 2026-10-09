# Day 29 — Backtracking & State Exploration

Today’s challenge focuses on **Backtracking**, a technique that explores different choices, builds possible solutions, and undoes choices to explore alternative paths.

## Problems Solved

1. [LeetCode 78 — Subsets](https://leetcode.com/problems/subsets/)
2. [LeetCode 39 — Combination Sum](https://leetcode.com/problems/combination-sum/)
3. [LeetCode 46 — Permutations](https://leetcode.com/problems/permutations/)

---

## 1. Subsets — LeetCode 78

**Difficulty:** Medium

### Problem
Given an array of unique integers, return all possible subsets, including the empty subset and the original array.

### Approach
Use backtracking to explore every possible subset.

1. Add a copy of the current subset to the result.
2. Iterate through the remaining elements, starting from the current index.
3. Add an element to the current subset.
4. Recursively explore the remaining elements using `i + 1`.
5. Remove the last element to backtrack and explore other possibilities.

Each element is considered without repetition or reordering.

### Example

**Input:** `nums = [1,2]`

**Output:** `[[],[1],[1,2],[2]]`

### Complexity
- **Time:** O(n × 2ⁿ)
- **Auxiliary Space:** O(n), excluding the output.

### Pattern
**Backtracking — Choose, Explore, Undo**

Key concept: Each element can be included in or excluded from a subset.

---

## 2. Combination Sum — LeetCode 39

**Difficulty:** Medium

### Problem
Given an array of distinct positive integers and a target, find all unique combinations whose elements sum to the target. Each candidate can be used unlimited times.

### Approach
Use backtracking to build combinations while tracking the remaining target.

1. If the remaining target becomes zero, save a copy of the current combination.
2. Iterate through candidates starting from the current index.
3. Skip candidates greater than the remaining target.
4. Add a candidate and recursively explore with the reduced target.
5. Pass the same index `i` to allow candidate reuse.
6. Remove the last candidate to backtrack.

Starting each recursive call from the current index prevents duplicate combinations in different orders.

### Example

**Input:** `candidates = [2,3,6,7], target = 7`

**Output:** `[[2,2,3],[7]]`

### Complexity
- **Time:** Exponential in the worst case. A loose upper bound is O(n^(T/M + 1)), where T is the target and M is the smallest candidate.
- **Auxiliary Space:** O(T/M), excluding the output.

### Pattern
**Backtracking — Choose, Explore, Undo**

Key concept: Pass `i` instead of `i + 1` in the recursive call to reuse the current candidate.

---

## 3. Permutations — LeetCode 46

**Difficulty:** Medium

### Problem
Given an array of distinct integers, generate all possible permutations. Each permutation must contain every element exactly once.

### Approach
Use backtracking with a boolean array to track which elements have been selected.

1. If the current permutation contains all elements, add a copy to the result.
2. Iterate through every array element.
3. Skip elements already marked as used.
4. Add an unused element to the current permutation and mark it as used.
5. Recursively build the remaining positions.
6. Remove the last element and unmark it to explore other possibilities.

Unlike Subsets, every element must be included. Unlike Combination Sum, elements cannot be reused.

### Example

**Input:** `nums = [1,2,3]`

**Output:** `[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]`

### Complexity
- **Time:** O(n × n!)
- **Auxiliary Space:** O(n), excluding the output.

### Pattern
**Backtracking — Choose, Mark, Explore, Unmark**

Key concept: Use a boolean array to ensure each element appears exactly once in a permutation.

---

## Key Learnings

| Problem | Main Technique | Key Decision |
|---|---|---|
| Subsets | Start index | Use `i + 1` to move forward |
| Combination Sum | Start index + remaining target | Use `i` to allow reuse |
| Permutations | Boolean `used[]` array | Explore every unused element |

### General Backtracking Template

```java
void backtrack(/* state */) {
    if (/* solution is complete */) {
        result.add(new ArrayList<>(current));
        return;
    }

    for (/* each valid choice */) {
        // Choose
        // Explore recursively
        // Undo the choice
    }
}
```

### Interview Takeaways

- Identify the choices available at each step.
- Define the base case that indicates a complete solution.
- Use a start index to avoid duplicate combinations when order does not matter.
- Use a `used[]` array when each element can be selected only once per solution.
- Always undo modifications when returning from a recursive call.
- Store a copy of the current list when adding a solution to the result.

**Day 29 completed — Backtracking & State Exploration.**