# Day 01 - Second Largest Element

## Topic
Arrays

## Problem Statement
Given an array of positive integers, find the second largest element in the array.  
If the second largest element does not exist, return -1.

Note:
- The second largest element must be different from the largest element.

## Examples

Input: [12, 35, 1, 10, 34, 1]  
Output: 34  
Explanation: Largest = 35, Second Largest = 34  

Input: [10, 5, 10]  
Output: 5  
Explanation: Largest = 10, Second Largest = 5  

Input: [10, 10, 10]  
Output: -1  
Explanation: No second largest element exists  

## Constraints
- 2 ≤ arr.size() ≤ 10^5  
- 1 ≤ arr[i] ≤ 10^5  

## Approach
- Initialize two variables:
  - `largest` to store the maximum element
  - `secondLargest` to store the second maximum
- Traverse the array:
  - If current element > largest:
    - Update secondLargest = largest
    - Update largest = current element
  - Else if current element:
    - is less than largest AND greater than secondLargest:
    - update secondLargest
- Return secondLargest

## Time Complexity
O(n) — single pass through the array

## Space Complexity
O(1) — constant extra space

## Key Learning
- Efficient way to track top two elements in one traversal
- Avoided sorting which would increase time complexity
- Important concept for optimization problems