# Day 02 - Move All Zeroes to End

## Topic
Arrays

## Problem Statement
Given an array of non-negative integers, move all zeros to the end while maintaining the relative order of non-zero elements.

## Examples

Input: [1, 2, 0, 4, 3, 0, 5, 0]  
Output: [1, 2, 4, 3, 5, 0, 0, 0]

Input: [10, 20, 30]  
Output: [10, 20, 30]

Input: [0, 0]  
Output: [0, 0]

## Approach
- Use a pointer `count` to track position for non-zero elements
- Traverse array:
  - If element is non-zero → swap with index `count`
  - Increment `count`
- This ensures:
  - Non-zero elements stay in order
  - Zeroes automatically shift to end

## Time Complexity
O(n)

## Space Complexity
O(1)

## Key Learning
- Two-pointer technique
- In-place array modification
- Maintaining relative order