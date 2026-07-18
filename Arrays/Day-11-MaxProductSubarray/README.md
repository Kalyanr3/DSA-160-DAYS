# Day 11 - Maximum Product Subarray

## Topic
Arrays / Dynamic Programming

## Problem Statement
Given an array containing positive, negative numbers and zeros, find the maximum product of a contiguous subarray.

## Examples

Input: [-2, 6, -3, -10, 0, 2]  
Output: 180  

Input: [-1, -3, -10, 0, 6]  
Output: 30  

Input: [2, 3, 4]  
Output: 24  

## Constraints
- 1 ≤ arr.size() ≤ 10^6  
- -100 ≤ arr[i] ≤ 100  

## Approach (Two Direction Traversal)
- Traverse from left → right and right → left
- Maintain running product
- Reset product to 1 when it becomes 0
- Track maximum product

## Intuition
- Negative numbers can flip sign of product
- Odd negatives → remove one negative
- Traversing both directions ensures all cases are covered

## Time Complexity
O(n)

## Space Complexity
O(1)

## Key Learning
- Handling negative numbers in product problems
- Difference between sum (Kadane) vs product problems
- Two-pass traversal technique