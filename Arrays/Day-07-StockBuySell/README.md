# Day 07 - Stock Buy and Sell (Multiple Transactions Allowed)

## Topic
Arrays / Greedy

## Problem Statement
Given an array where each element represents the stock price on a given day, find the maximum profit you can achieve.

Rules:
- You can buy and sell multiple times
- You must sell before buying again
- You can buy and sell on the same day

## Examples

Input: [100, 180, 260, 310, 40, 535, 695]  
Output: 865  

Input: [4, 2, 2, 2, 4]  
Output: 2  

## Constraints
- 1 ≤ prices.size() ≤ 10^5  
- 0 ≤ prices[i] ≤ 10^4  

## Approach (Greedy)
- Profit occurs only when price increases
- Traverse the array:
  - If today's price > yesterday's price:
    - Add the difference to profit
- This captures every upward movement

## Intuition
- Instead of finding global min and max,
- Capture every small profit
- Equivalent to buying at valley and selling at peak

## Time Complexity
O(n)

## Space Complexity
O(1)

## Key Learning
- Greedy approach for profit maximization
- Breaking problem into smaller gains
- Important stock problem pattern