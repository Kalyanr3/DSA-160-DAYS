# Day 03 - Reverse an Array

## Topic
Arrays

## Problem Statement
Given an array of integers, reverse the array in place.

Note:
- The array must be modified without using extra space.

## Examples

Input: [1, 4, 3, 2, 6, 5]  
Output: [5, 6, 2, 3, 4, 1]

Input: [4, 5, 2]  
Output: [2, 5, 4]

Input: [1]  
Output: [1]

## Constraints
- 1 ≤ arr.size() ≤ 10^5  
- 0 ≤ arr[i] ≤ 10^5  

## Approach (Two Pointers)
- Use two pointers:
  - `left` starting from beginning
  - `right` starting from end
- Swap elements at `left` and `right`
- Move:
  - `left++`
  - `right--`
- Continue until `left < right`

## Time Complexity
O(n)

## Space Complexity
O(1)

## Key Learning
- Two-pointer technique for in-place operations
- Efficient way to reverse data without extra memory
- Common pattern used in many array and string problems