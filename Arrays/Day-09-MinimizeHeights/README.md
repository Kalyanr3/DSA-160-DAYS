# Day 09 - Minimize the Heights II

## Topic
Arrays / Greedy / Sorting

## Problem Statement
Given an array representing heights of towers and an integer k, modify each tower by either increasing or decreasing its height by k exactly once.

Goal:
Minimize the difference between the tallest and shortest tower after modification.

Note:
- Heights cannot be negative after modification

## Examples

Input: k = 2, arr = [1, 5, 8, 10]  
Output: 5  

Input: k = 3, arr = [3, 9, 12, 16, 20]  
Output: 11  

## Constraints
- 1 ≤ k ≤ 10^7  
- 1 ≤ n ≤ 10^5  
- 1 ≤ arr[i] ≤ 10^7  

## Approach (Sorting + Greedy)
- Sort the array
- Initial difference = max - min
- Try dividing array into two parts:
  - Left part → increase by k
  - Right part → decrease by k
- For each split:
  - Compute new min and max
  - Update result

## Steps
1. Sort array
2. Initialize result = arr[n-1] - arr[0]
3. Loop from i = 1 to n-1:
   - Skip if arr[i] - k < 0
   - minHeight = min(arr[0] + k, arr[i] - k)
   - maxHeight = max(arr[i-1] + k, arr[n-1] - k)
   - Update result

## Time Complexity
O(n log n)

## Space Complexity
O(1)

## Key Learning
- Greedy + sorting combination
- Thinking in terms of modifying boundaries
- Important optimization problem