# LeetCode 424 — Longest Repeating Character Replacement

## Problem

Given a string `s` and an integer `k`, return the length of the longest substring that can be made to contain only the same character by replacing at most `k` characters.

## Approach

Use a **sliding window** with a frequency array.

For each window:

```text
replacements = windowLength - maxFreq
```

If `replacements > k`, shrink the window from the left.

Track the maximum valid window length.

## Example

```text
Input:
s = "AABABBA"
k = 1

Output:
4
```

The substring `"AABA"` can become `"AAAA"` by replacing one character.

## Complexity

* Time: `O(n)`
* Space: `O(1)`

## Pattern

**Sliding Window — Variable Size**

# LeetCode 1004 — Max Consecutive Ones III

## Problem

Given a binary array `nums` and an integer `k`, return the maximum number of consecutive `1`s that can be obtained by flipping at most `k` zeros.

## Approach

Use a **sliding window**.

Maintain the number of zeros inside the current window.

If:

```text
zeros > k
```

shrink the window from the left until it becomes valid again.

Track the maximum window length.

## Example

```text
Input:
nums = [1,1,1,0,0,0,1,1,1,1,0]
k = 2

Output:
6
```

We can flip two zeros to obtain a longest sequence of `6` ones.

## Complexity

* Time: `O(n)`
* Space: `O(1)`

## Pattern

**Sliding Window — Variable Size**


# LeetCode 76 — Minimum Window Substring

## Problem

Given strings `s` and `t`, return the minimum window substring of `s` that contains all characters of `t`, including duplicates. If no such substring exists, return `""`.

## Approach

Use a **sliding window** with a frequency array.

Store the required character frequencies from `t`.

Expand the window using `right`. When the window contains all required characters, shrink it from the left while it remains valid.

Track the smallest valid window.

## Example

```text
Input:
s = "ADOBECODEBANC"
t = "ABC"

Output:
"BANC"
```

## Complexity

* Time: `O(n + m)`
* Space: `O(1)`

## Pattern

**Sliding Window — Minimum Valid Window**
