# Day 20 - Strings Rotations of Each Other

## Topic

Strings / KMP Algorithm / Pattern Matching

---

## Difficulty

Medium

---

## Problem Statement

Given two strings `s1` and `s2` of equal length, determine whether `s2` is a rotated version of `s1`.

A string is said to be a rotation of another string if it can be obtained by moving characters from the beginning to the end (or vice versa) without changing their order.

---

## Examples

### Example 1

Input

s1 = "abcd"

s2 = "cdab"

Output

true

Explanation

After two right rotations, `abcd` becomes `cdab`.

---

### Example 2

Input

s1 = "aab"

s2 = "aba"

Output

true

---

### Example 3

Input

s1 = "abcd"

s2 = "acbd"

Output

false

---

## Constraints

- 1 ≤ s1.length(), s2.length() ≤ 10^5
- Both strings contain lowercase English letters.

---

# Approach (KMP Pattern Matching)

If `s2` is a rotation of `s1`, then it must appear as a substring inside `s1 + s1`.

Example:

s1 = "abcd"

s1 + s1 = "abcdabcd"

s2 = "cdab"

Since "cdab" exists inside "abcdabcd", the answer is true.

Instead of using the built-in `contains()` method, we use the KMP algorithm for efficient pattern matching.

### Steps

1. Check that both strings have the same length.
2. Concatenate the first string with itself.
3. Build the LPS (Longest Prefix Suffix) array for the second string.
4. Perform KMP search.
5. If the pattern is found, return true; otherwise, return false.

---

## Time Complexity

O(n)

---

## Space Complexity

O(n)

LPS array requires O(n) space.

---

## Key Learning

- String Rotation
- KMP Algorithm
- Longest Prefix Suffix (LPS)
- Efficient Pattern Matching

---

## Interview Pattern

Classic String Interview Problem

Can be solved using:
- Built-in contains() method
- KMP Algorithm (Optimal)
- Rabin-Karp Algorithm