# Day 13 - Smallest Positive Missing Number

## Topic
Arrays

## Problem Statement
Given an array of integers, find the smallest missing positive number.

Note:
- Array can contain negative numbers and zeros
- Positive numbers start from 1

## Examples

Input: [2, -3, 4, 1, 1, 7]  
Output: 3  

Input: [5, 3, 2, 5, 1]  
Output: 4  

Input: [-8, 0, -1, -4, -3]  
Output: 1  

## Constraints
- 1 ≤ arr.size() ≤ 10^5  
- -10^6 ≤ arr[i] ≤ 10^6  

## Approach (Sorting)
- Sort the array
- Start from expected number = 1
- Traverse:
  - If element == expected → increment expected
  - If element > expected → break
- Return expected

## Time Complexity
O(n log n)

## Space Complexity
O(1)

## Key Learning
- Handling missing elements
- Working with unsorted + negative arrays
- Basic approach before optimization