# Day 06 - Majority Element (More Than n/3)

## Topic
Arrays

## Problem Statement
Given an array of integers, find all elements that appear more than ⌊n/3⌋ times.

Note:
- There can be at most two such elements.
- Return the result in sorted order.

## Examples

Input: [2, 2, 3, 1, 3, 2, 1, 1]  
Output: [1, 2]

Input: [-5, 3, -5]  
Output: [-5]

Input: [3, 2, 2, 4, 1, 4]  
Output: []

## Constraints
- 1 ≤ arr.size() ≤ 10^6  
- -10^5 ≤ arr[i] ≤ 10^5  

## Approach (Boyer-Moore Voting Algorithm)
- There can be at most 2 elements appearing more than n/3 times
- Maintain two candidates and their counts

### Step 1: Find Potential Candidates
- If element matches candidate → increment count
- If count becomes 0 → assign new candidate
- If no match → decrement both counts

### Step 2: Verify Candidates
- Count occurrences of both candidates
- Add to result if frequency > n/3

### Step 3: Sort Result
- Ensure output is in sorted order

## Time Complexity
O(n)

## Space Complexity
O(1)

## Key Learning
- Extended Boyer-Moore Voting Algorithm
- Handling multiple majority candidates
- Two-pass validation technique
- Very important for interview problems
