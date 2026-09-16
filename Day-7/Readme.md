# LeetCode 242 — Valid Anagram

## Problem

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, otherwise return `false`.

## Approach

Use an integer array of size `26` to count character frequencies.

* Increment the count for each character in `s`.
* Decrement the count for each character in `t`.
* If all counts are `0`, the strings are anagrams.

First check whether both strings have the same length.

## Example

```text
Input:
s = "anagram"
t = "nagaram"

Output:
true
```

## Complexity

* Time: `O(n)`
* Space: `O(1)`

## Pattern

**Hashing / Frequency Counting**


# LeetCode 49 — Group Anagrams

## Problem

Given an array of strings, group the anagrams together.

## Approach

Sort the characters of every string and use the sorted string as a `HashMap` key.

Anagrams produce the same sorted key, so they are stored in the same list.

## Example

```text
Input:
["eat","tea","tan","ate","nat","bat"]

Output:
[["eat","tea","ate"],["tan","nat"],["bat"]]
```

## Complexity

* Time: `O(n * k log k)`
* Space: `O(n * k)`

## Pattern

**HashMap + Sorting / Canonical Representation**


# LeetCode 347 — Top K Frequent Elements

## Problem

Given an integer array `nums` and an integer `k`, return the `k` most frequent elements.

## Approach

Use a `HashMap` to count the frequency of every number.

Then use a **Min Heap (`PriorityQueue`)** to keep only the `k` elements with the highest frequencies.

If the heap size becomes greater than `k`, remove the element with the smallest frequency.

## Example

```text
Input:
nums = [1,1,1,2,2,3]
k = 2

Output:
[1,2]
```

## Complexity

* Time: `O(n + m log k)`
* Space: `O(m + k)`

## Pattern

**HashMap + Frequency Counting + Min Heap**

