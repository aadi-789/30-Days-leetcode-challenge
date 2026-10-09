# Day 30: Dynamic Programming

## Problems Solved
1. **LeetCode 70 – Climbing Stairs**
2. **LeetCode 198 – House Robber**
3. **LeetCode 322 – Coin Change**

---

## 1. Climbing Stairs (LeetCode 70)

**Problem:** Find the number of distinct ways to climb `n` stairs when you can take either 1 or 2 steps at a time.

**Approach:**
- To reach step `n`, come from either step `n-1` or step `n-2`.
- Use the recurrence `dp[n] = dp[n-1] + dp[n-2]`.
- Optimize space by maintaining only the previous two results.

**Example:**
- Input: `n = 5`
- Output: `8`

**Complexity:**
- Time: `O(n)`
- Space: `O(1)`

**Pattern:** 1D Dynamic Programming / Fibonacci

---

## 2. House Robber (LeetCode 198)

**Problem:** Find the maximum amount of money that can be robbed without robbing two adjacent houses.

**Approach:**
- At each house, choose between robbing it or skipping it.
- If robbed, add its money to the best result from two houses back.
- If skipped, retain the best result from the previous house.
- Use two variables to optimize space.

**Example:**
- Input: `nums = [2,7,9,3,1]`
- Output: `12`

**Complexity:**
- Time: `O(n)`
- Space: `O(1)`

**Pattern:** 1D Dynamic Programming / Take or Skip

---

## 3. Coin Change (LeetCode 322)

**Problem:** Find the minimum number of coins required to make a given amount. Return `-1` if the amount cannot be formed.

**Approach:**
- Create a DP array where `dp[x]` stores the minimum coins needed to make amount `x`.
- Initialize `dp[0] = 0` and all other states to a value larger than the target amount.
- For each amount, try every coin denomination that does not exceed it.
- Update the minimum using `dp[x] = min(dp[x], dp[x - coin] + 1)`.
- Return `-1` if the target amount is unreachable.

**Example:**
- Input: `coins = [1,2,5], amount = 11`
- Output: `3`
- Explanation: `5 + 5 + 1 = 11`

**Complexity:**
- Time: `O(amount × number of coins)`
- Space: `O(amount)`

**Pattern:** Dynamic Programming / Unbounded Knapsack / Minimum Optimization

---

## Key Learnings

- Understand how to define DP states and recurrence relations.
- Use previous states to avoid repeated calculations.
- Apply take-or-skip decisions to maximize a result.
- Use bottom-up DP to find minimum values across smaller subproblems.
- Optimize space when only a few previous states are required.

**Day 30 Complete!**