## 1. LeetCode 121 — Best Time to Buy and Sell Stock

### Problem

Given an integer array `prices`, where `prices[i]` represents the stock price on day `i`, find the maximum profit that can be achieved by buying on one day and selling on a later day.

If no profit can be made, return `0`.

### Approach

Maintain the minimum price seen so far and the maximum profit.

Traverse the array once:

1. Update `minPrice` if the current price is smaller.
2. Calculate the profit by selling at the current price.
3. Update `maxProfit` if the current profit is larger.

This ensures that the buying day always comes before the selling day.

### Example

Input:
`prices = [7, 1, 5, 3, 6, 4]`

Output:
`5`

Explanation:
Buy at `1` and sell at `6`.

Profit:
`6 - 1 = 5`

### Complexity

- Time: `O(n)`
- Space: `O(1)`

### Pattern

**Running Minimum — Track the minimum value seen so far and calculate the maximum difference with the current value.**


## 2. LeetCode 238 — Product of Array Except Self

### Problem

Given an integer array `nums`, return an array `answer` such that:

`answer[i]` is equal to the product of all elements of `nums` except `nums[i]`.

The solution should not use division.

### Approach

Use the **Prefix and Suffix Product** approach.

Traverse the array from left to right:

1. Store the product of all elements before index `i` in `answer[i]`.

Then traverse from right to left:

2. Maintain a `suffix` product of all elements after index `i`.
3. Multiply `answer[i]` by the current `suffix`.
4. Update `suffix` using the current element.

This gives the product of all elements except the current element without using division.

### Example

Input:
`nums = [1, 2, 3, 4]`

Output:
`[24, 12, 8, 6]`

Explanation:

- For `1`: `2 × 3 × 4 = 24`
- For `2`: `1 × 3 × 4 = 12`
- For `3`: `1 × 2 × 4 = 8`
- For `4`: `1 × 2 × 3 = 6`

### Complexity

- Time: `O(n)`
- Space: `O(1)` extra space *(excluding the output array)*

### Pattern

**Prefix & Suffix — Store the product of elements before each index, then multiply it by the product of elements after that index.**


## 3. LeetCode 560 — Subarray Sum Equals K

### Problem

Given an integer array `nums` and an integer `k`, return the total number of continuous subarrays whose sum equals `k`.

### Approach

Use **Prefix Sum + HashMap**.

Maintain a running `prefixSum` and store the frequency of each prefix sum in a HashMap.

For every element:

1. Add the current element to `prefixSum`.
2. Check if `prefixSum - k` exists in the HashMap.
3. If it exists, add its frequency to the answer.
4. Store the current `prefixSum` in the HashMap.

Initialize the HashMap with:

`map.put(0, 1)`

This handles subarrays that start from index `0`.

### Example

Input:
`nums = [1, 1, 1]`

`k = 2`

Output:
`2`

Explanation:

The subarrays whose sum is `2` are:

`[1, 1]` → indices `0–1`

`[1, 1]` → indices `1–2`

So the answer is `2`.

### Complexity

- Time: `O(n)`
- Space: `O(n)`

### Pattern

**Prefix Sum + HashMap — Store the frequency of previous prefix sums and check for `prefixSum - k` to find subarrays with sum `k`.**