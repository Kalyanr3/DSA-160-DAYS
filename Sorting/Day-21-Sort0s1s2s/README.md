# Day 21 - Sort 0s, 1s and 2s

## Topic

Sorting / Dutch National Flag Algorithm

---

## Difficulty

Medium

---

## Problem Statement

Given an array `arr[]` containing only **0s, 1s, and 2s**, sort the array in ascending order.

**Note:** You are not allowed to use any built-in sorting function.

---

## Examples

### Example 1

Input

arr = [0, 1, 2, 0, 1, 2]

Output

[0, 0, 1, 1, 2, 2]

---

### Example 2

Input

arr = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]

Output

[0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]

---

## Constraints

- 1 ≤ arr.length ≤ 10^5
- 0 ≤ arr[i] ≤ 2

---

# Approach (Dutch National Flag Algorithm)

Maintain three pointers:

- `low` → next position for 0
- `mid` → current element
- `high` → next position for 2

### Steps

1. Initialize:
   - `low = 0`
   - `mid = 0`
   - `high = n - 1`
2. Traverse while `mid <= high`.
3. If `arr[mid] == 0`, swap `arr[low]` and `arr[mid]`, then increment both.
4. If `arr[mid] == 1`, just move `mid`.
5. If `arr[mid] == 2`, swap `arr[mid]` and `arr[high]`, then decrement `high`. Do **not** increment `mid` because the swapped element must be checked.

---

## Time Complexity

O(n)

---

## Space Complexity

O(1)

---

## Key Learning

- Three Pointer Technique
- In-place Sorting
- Dutch National Flag Algorithm
- One-pass Traversal

---

## Interview Pattern

This is a classic interview problem for mastering in-place partitioning and pointer manipulation.