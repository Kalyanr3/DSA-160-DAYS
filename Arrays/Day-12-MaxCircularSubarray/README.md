# Day 12 - Maximum Circular Subarray Sum

## Topic
Arrays / Dynamic Programming

## Problem Statement
Given a circular array, find the maximum sum of a non-empty subarray.

Note:
- Subarray can wrap from end to beginning

## Examples

Input: [8, -8, 9, -9, 10, -11, 12]  
Output: 22  

Input: [10, -3, -4, 7, 6, 5, -4, -1]  
Output: 23  

Input: [5, -2, 3, 4]  
Output: 12  

## Constraints
- 1 ≤ arr.size() ≤ 10^5  
- -10^4 ≤ arr[i] ≤ 10^4  

## Approach (Kadane's Algorithm - Circular Case)

### Case 1: Normal Subarray
- Use Kadane’s Algorithm to find maximum subarray sum

### Case 2: Circular Subarray
- Total sum - minimum subarray sum

### Final Answer
max(normalSum, circularSum)

### Edge Case
- If all elements are negative:
  - return normalSum

## Intuition
- Circular subarray = excluding a middle minimum subarray
- So we subtract minimum subarray from total

## Time Complexity
O(n)

## Space Complexity
O(1)

## Key Learning
- Extension of Kadane’s Algorithm
- Handling circular arrays
- Using min subarray logic