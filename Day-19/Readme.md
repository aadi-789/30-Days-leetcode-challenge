# LeetCode 875 - Koko Eating Bananas

## Problem
Find the minimum eating speed `k` such that Koko can eat all banana piles within `h` hours.

## Approach
Use Binary Search on Answer.

- Minimum speed = 1
- Maximum speed = maximum pile
- For each speed, calculate the total hours required.
- If the speed works, search for a smaller speed.
- Otherwise, search for a larger speed.

## Example

Input:
piles = [3,6,7,11], h = 8

Output:
4

At speed 4:
3 -> 1 hour
6 -> 2 hours
7 -> 2 hours
11 -> 3 hours

Total = 8 hours

## Complexity
Time: O(n log(max(piles)))
Space: O(1)

## Pattern
Binary Search on Answer


# LeetCode 1011 - Capacity To Ship Packages Within D Days

## Problem
Find the minimum ship capacity needed to ship all packages within `days` days while maintaining their given order.

## Approach
Use Binary Search on Answer.

- Minimum capacity = maximum package weight.
- Maximum capacity = sum of all package weights.
- For each capacity, simulate shipping.
- If the required days are within `days`, try a smaller capacity.
- Otherwise, increase the capacity.

## Example

Input:
weights = [3,2,2,4,1,4]
days = 3

Output:
6

Possible shipping:

Day 1: 3 + 2 = 5
Day 2: 2 + 4 = 6
Day 3: 1 + 4 = 5

## Complexity
Time: O(n log(sum(weights)))
Space: O(1)

## Pattern
Binary Search on Answer

# LeetCode 410 - Split Array Largest Sum

## Problem
Split an array into `k` non-empty contiguous subarrays such that the largest subarray sum is minimized.

## Approach
Use Binary Search on Answer.

- Minimum answer = maximum element.
- Maximum answer = sum of all elements.
- For each possible maximum sum, greedily create subarrays.
- If more than `k` subarrays are required, the value is too small.
- If `k` or fewer subarrays are enough, try a smaller value.

## Example

Input:
nums = [7,2,5,10,8]
k = 2

Output:
18

Split:
[7,2,5] | [10,8]

Sums:
14 | 18

Largest sum = 18

## Complexity
Time: O(n log(sum(nums)))
Space: O(1)

## Pattern
Binary Search on Answer