# Day 16 - Anagram

## Topic
Strings

## Difficulty
Easy

## Problem Statement

Given two non-empty strings `s1` and `s2`, determine whether they are anagrams of each other.

Two strings are anagrams if they contain exactly the same characters with the same frequencies, irrespective of their order.

---

## Examples

### Example 1

Input:
s1 = "geeks"
s2 = "kseeg"

Output:
true

---

### Example 2

Input:
s1 = "allergy"
s2 = "allergyy"

Output:
false

---

### Example 3

Input:
s1 = "listen"
s2 = "lists"

Output:
false

---

## Constraints

- 1 ≤ s1.length(), s2.length() ≤ 10^5
- Strings contain only lowercase English letters.

---

## Approach (Sorting)

1. Check if both strings have the same length.
2. Convert both strings into character arrays.
3. Sort both character arrays.
4. Compare the sorted arrays.
5. If both arrays are identical, the strings are anagrams.

---

## Time Complexity

O(n log n)

Sorting both strings dominates the complexity.

---

## Space Complexity

O(n)

Character arrays are used to store the strings.

---

## Key Learning

- Character array conversion
- Sorting strings
- Comparing arrays
- String manipulation
- Anagram detection

---

## Interview Pattern

This problem teaches two common approaches:

- Sorting
- Frequency Counting (Optimal)