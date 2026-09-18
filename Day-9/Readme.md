# LeetCode 228 — Summary Ranges

## Problem

Given a sorted, unique integer array, summarize consecutive numbers into ranges.

Example:

```text
Input:  [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
```

## Approach

* Keep `start` as the beginning of the current range.
* Scan the array.
* If the next number is not consecutive, close the current range.
* If `start == i - 1`, add a single number.
* Otherwise, add `start->end`.
* Start a new range.

## Example

```text
[0,1,2,4,5,7]

0,1,2 → "0->2"
4,5   → "4->5"
7     → "7"

Result: ["0->2","4->5","7"]
```

## Complexity

* Time: `O(n)`
* Space: `O(n)` for the output

## Pattern

Consecutive Sequence / Range Compression


# LeetCode 56 — Merge Intervals

## Problem

Given an array of intervals, merge all overlapping intervals.

Example:

```text
Input:  [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
```

## Approach

* Sort intervals by their starting point.
* Maintain the current `[start, end]`.
* If `nextStart <= end`, the intervals overlap.
* Merge using `end = Math.max(end, nextEnd)`.
* Otherwise, add the current interval and start a new one.
* Add the final interval after the loop.

## Example

```text
[1,3] + [2,6] → [1,6]
[1,6] and [8,10] → no overlap
[8,10] and [15,18] → no overlap

Result: [[1,6],[8,10],[15,18]]
```

## Complexity

* Time: `O(n log n)`
* Space: `O(n)`

## Pattern

Intervals + Sorting + Greedy Merge


# LeetCode 57 — Insert Interval

## Problem

Given a sorted, non-overlapping list of intervals and a new interval, insert the new interval while maintaining sorted order and merging overlaps.

Example:

```text
Input:
intervals = [[1,3],[6,9]]
newInterval = [2,5]

Output:
[[1,5],[6,9]]
```

## Approach

* Add intervals completely before `newInterval`.
* Merge all overlapping intervals using `min(start)` and `max(end)`.
* Add the merged `newInterval`.
* Add all remaining intervals.

## Example

```text
[1,3] overlaps [2,5] → [1,5]

[6,9] comes after → add as it is.

Result: [[1,5],[6,9]]
```

## Complexity

* Time: `O(n)`
* Space: `O(n)`

## Pattern

Intervals + Before / Overlap / After
