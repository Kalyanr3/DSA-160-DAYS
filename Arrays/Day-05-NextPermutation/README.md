# Day 05 - Next Permutation

## Topic
Arrays

## Problem Statement
Given an array representing a permutation, rearrange it into the next lexicographically greater permutation.

If such permutation is not possible, rearrange it into the lowest possible order (sorted in ascending order).

## Examples

Input: [2, 4, 1, 7, 5, 0]  
Output: [2, 4, 5, 0, 1, 7]

Input: [3, 2, 1]  
Output: [1, 2, 3]

Input: [3, 4, 2, 5, 1]  
Output: [3, 4, 5, 1, 2]

## Constraints
- 1 ≤ arr.size() ≤ 10^5  
- 0 ≤ arr[i] ≤ 10^5  

## Approach
1. Find the pivot:
   - Traverse from right and find first index `i` such that `arr[i] < arr[i+1]`
2. If no pivot found:
   - Reverse entire array
3. Else:
   - Find the rightmost element greater than pivot
   - Swap it with pivot
4. Reverse the suffix (right side of pivot)

## Time Complexity
O(n)

## Space Complexity
O(1)

## Key Learning
- Lexicographical ordering
- Finding next greater arrangement
- Combination of searching + swapping + reversing
- Very important interview problem