# Day 04 - Left Rotate Array by D Positions

## Topic
Arrays

## Problem Statement
Given an array, rotate the array to the left by `d` positions.

Note:
- Rotation should be done in-place.
- The array is considered circular.

## Examples

Input: [1, 2, 3, 4, 5], d = 2  
Output: [3, 4, 5, 1, 2]

Input: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3  
Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]

Input: [7, 3, 9, 1], d = 9  
Output: [3, 9, 1, 7]

## Constraints
- 1 ≤ arr.size(), d ≤ 10^5  
- 0 ≤ arr[i] ≤ 10^5  

## Approach (Reversal Algorithm)
- Normalize rotations:
  - `d = d % n`
- Reverse first `d` elements
- Reverse remaining `n - d` elements
- Reverse entire array

## Steps
1. Reverse arr[0 → d-1]
2. Reverse arr[d → n-1]
3. Reverse arr[0 → n-1]

## Time Complexity
O(n)

## Space Complexity
O(1)

## Key Learning
- Learned Reversal Algorithm for rotation
- Important pattern for array manipulation
- Avoids extra space compared to brute force approach