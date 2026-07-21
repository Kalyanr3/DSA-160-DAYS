# Day 19 - Min Chars to Add for Palindrome

## Topic

Strings / KMP Algorithm / Longest Prefix Suffix (LPS)

## Difficulty

Hard

---

## Problem Statement

Given a string `s`, find the minimum number of characters that must be added **at the front** of the string to make it a palindrome.

---

## Examples

### Example 1

Input

s = "abc"

Output

2

Explanation

Add "cb" at the front.

Result:

cbabc

---

### Example 2

Input

s = "aacecaaaa"

Output

2

Explanation

Add "aa" at the front.

Result:

aaaacecaaaa

---

## Constraints

- 1 ≤ s.length() ≤ 10^6
- String contains lowercase English letters.

---

# Approach (KMP + LPS)

Instead of checking every possible prefix, we use the KMP preprocessing algorithm.

### Steps

1. Reverse the original string.
2. Create a combined string:

```
original + "$" + reverse
```

The special separator (`$`) prevents incorrect matches across the two strings.

3. Construct the LPS array for the combined string.
4. The last value of the LPS array gives the length of the longest palindromic prefix.
5. Minimum characters to add:

```
length of string − last LPS value
```

---

## Time Complexity

O(n)

---

## Space Complexity

O(n)

- Combined string
- LPS array

---

## Key Learning

- KMP Algorithm
- LPS Construction
- Palindrome Optimization
- String Preprocessing
- Pattern Matching

---

## Interview Pattern

Advanced String Algorithms

This problem demonstrates how KMP can be used beyond pattern searching.