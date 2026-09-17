# LeetCode 128 — Longest Consecutive Sequence

## Problem

Given an unsorted array of integers, return the length of the longest consecutive elements sequence.

The algorithm must run in `O(n)` time.

## Approach

Store all numbers in a `HashSet` for `O(1)` average lookup.

For each number, start counting only if `num - 1` is not present. This means `num` is the beginning of a consecutive sequence.

Then keep checking `num + 1` and update the maximum length.

## Example

```text
Input:  [100, 4, 200, 1, 3, 2]

Sequence: 1, 2, 3, 4

Output: 4
```

## Complexity

* Time: `O(n)`
* Space: `O(n)`

## Pattern

HashSet + Sequence Detection


# LeetCode 383 — Ransom Note

## Problem

Given two strings `ransomNote` and `magazine`, return `true` if `ransomNote` can be constructed using the letters from `magazine`. Each letter from `magazine` can be used only once.

## Approach

Count the frequency of each character in `magazine` using an `int[26]`.

Then traverse `ransomNote` and decrease the corresponding frequency. If any frequency becomes negative, there are not enough characters available.

## Example

```text
Input:
ransomNote = "aa"
magazine = "aab"

Output:
true
```

## Complexity

* Time: `O(n + m)`
* Space: `O(1)`

## Pattern

Frequency Counting


# LeetCode 567 — Permutation in String

## Problem

Given two strings `s1` and `s2`, return `true` if `s2` contains a permutation of `s1` as a substring.

## Approach

Use frequency arrays to count characters in `s1` and a fixed-size sliding window in `s2`.

The window size is `s1.length()`. Add the new character and remove the character leaving the window. If both frequency arrays match, the window is a permutation of `s1`.

## Example

```text
Input:
s1 = "ab"
s2 = "eidbaooo"

Output:
true

Explanation:
"ba" is a permutation of "ab".
```

## Complexity

* Time: `O(n)`
* Space: `O(1)`

## Pattern

Frequency Counting + Fixed Sliding Window
