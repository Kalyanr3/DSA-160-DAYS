# Day 17 - First Non-Repeating Character

## Topic
Strings / HashMap

## Difficulty
Easy

## Problem Statement

Given a string consisting of lowercase English letters, return the first non-repeating character.

If every character repeats, return '$'.

---

## Examples

### Example 1

Input:
s = "geeksforgeeks"

Output:
'f'

Explanation:
'f' is the first character that appears only once.

---

### Example 2

Input:
s = "racecar"

Output:
'e'

Explanation:
'e' occurs only once.

---

### Example 3

Input:
s = "aabbccc"

Output:
'$'

Explanation:
Every character repeats.

---

## Constraints

- 1 ≤ s.length() ≤ 10^5

---

## Approach

1. Traverse the string once.
2. Store the frequency of every character in a HashMap.
3. Traverse the string again.
4. Return the first character whose frequency is 1.
5. If no such character exists, return '$'.

---

## Time Complexity

O(n)

---

## Space Complexity

O(k)

where k is the number of distinct characters.

---

## Key Learning

- HashMap
- Frequency Counting
- Two-pass Traversal
- String Processing

---

## Interview Pattern

Frequency counting using HashMap.