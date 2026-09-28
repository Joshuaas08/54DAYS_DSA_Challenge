# Day 13 — Recursion & Backtracking

Today I focused on recursion fundamentals and basic backtracking.

## Problems Solved

| # | LeetCode | Problem | Concept |
|---|---:|---|---|
| 1 | 509 | Fibonacci Number | Basic Recursion |
| 2 | 231 | Power of Two | Recursion |
| 3 | 70 | Climbing Stairs | Recursion / DP |
| 4 | 78 | Subsets | Backtracking |
| 5 | 39 | Combination Sum | Backtracking |
| 6 | 46 | Permutations | Backtracking |
| 7 | 17 | Letter Combinations of a Phone Number | Backtracking |
| 8 | 131 | Palindrome Partitioning | Backtracking |

## Recursion Fundamentals

Every recursive solution should have:

1. Base Case
2. Recursive Case
3. Progress toward the Base Case

## Basic Recursion Pattern

```java
void recursion(...) {

    if (baseCase) {
        return;
    }

    recursion(...);
}
