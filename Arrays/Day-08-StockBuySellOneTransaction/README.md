# Day 08 - Stock Buy and Sell (One Transaction Allowed)

## Topic
Arrays / Greedy

## Problem Statement
Given an array where each element represents the stock price on a given day, find the maximum profit by performing at most one transaction (one buy and one sell).

Note:
- You must buy before selling
- If no profit is possible, return 0

## Examples

Input: [7, 10, 1, 3, 6, 9, 2]  
Output: 8  

Input: [7, 6, 4, 3, 1]  
Output: 0  

Input: [1, 3, 6, 9, 11]  
Output: 10  

## Constraints
- 1 ≤ prices.size() ≤ 10^5  
- 0 ≤ prices[i] ≤ 10^4  

## Approach (One Pass / Greedy)
- Keep track of minimum price so far
- For each day:
  - Calculate profit = current price - minimum price
  - Update maximum profit if needed
  - Update minimum price if current price is smaller

## Intuition
- Buy at lowest price
- Sell at highest price after that
- Continuously track best opportunity

## Time Complexity
O(n)

## Space Complexity
O(1)

## Key Learning
- Greedy approach using min tracking
- Difference between single vs multiple transactions
- Important stock problem variation