# Day 18 - Search Pattern (KMP Algorithm)

## Topic

Strings / Pattern Matching

## Difficulty

Hard

---

## Problem Statement

Given a text string `txt` and a pattern string `pat`, return all starting indices (0-based) where the pattern occurs in the text.

If the pattern is not present, return an empty list.

---

## Examples

### Example 1

Input

txt = "geeksforgeeks"

pat = "geek"

Output

[0,8]

---

### Example 2

Input

txt = "abesdu"

pat = "edu"

Output

[]

---

### Example 3

Input

txt = "aabaacaadaabaaba"

pat = "aaba"

Output

[0,9,12]

---

## Constraints

- 1 ≤ txt.length() ≤ 10^5
- 1 ≤ pat.length() ≤ txt.length()

---

# Approach

This problem is solved using the **Knuth-Morris-Pratt (KMP) Algorithm**.

KMP avoids unnecessary comparisons by preprocessing the pattern into an LPS (Longest Prefix Suffix) array.

### Steps

1. Construct the LPS array.
2. Compare text and pattern.
3. On mismatch:
   - Use LPS instead of restarting.
4. Whenever the complete pattern matches,
   store the starting index.
5. Continue searching for the next occurrence.

---

## Time Complexity

O(n + m)

where

- n = length of text
- m = length of pattern

---

## Space Complexity

O(m)

LPS array.

---

## Key Learning

- Pattern Matching
- KMP Algorithm
- LPS Construction
- Prefix-Suffix Optimization
- Efficient String Searching

---

## Interview Pattern

Pattern Matching

This is one of the most important String algorithms for coding interviews.