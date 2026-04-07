# Day 10 - Kadane's Algorithm (Maximum Subarray Sum)

## Topic
Arrays / Dynamic Programming

## Problem Statement
Given an integer array, find the maximum sum of a contiguous subarray.

Note:
- A subarray must contain at least one element

## Examples

Input: [2, 3, -8, 7, -1, 2, 3]  
Output: 11  
Explanation: Subarray [7, -1, 2, 3]

Input: [-2, -4]  
Output: -2  

Input: [5, 4, 1, 7, 8]  
Output: 25  

## Constraints
- 1 ≤ arr.size() ≤ 10^5  
- -10^4 ≤ arr[i] ≤ 10^4  

## Approach (Kadane's Algorithm)
- Maintain two variables:
  - current sum (currSum)
  - maximum sum (result)
- Traverse the array:
  - Either extend previous subarray OR start new
  - currSum = max(currSum + arr[i], arr[i])
  - Update result = max(result, currSum)

## Intuition
- If current sum becomes negative → discard it
- Start fresh from next element
- Keep track of best sum so far

## Time Complexity
O(n)

## Space Complexity
O(1)

## Key Learning
- Kadane’s Algorithm for maximum subarray
- Dynamic programming optimization
- Handling negative numbers efficiently
- One of the most important interview patterns