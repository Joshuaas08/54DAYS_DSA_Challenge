# Day 4 — Recursion & Backtracking

Today I focused on Recursion and Backtracking in Java.

## Problems Solved

| # | LeetCode | Problem | Concept |
|---|---:|---|---|
| 1 | 509 | Fibonacci Number | Recursion |
| 2 | 231 | Power of Two | Recursion |
| 3 | 78 | Subsets | Backtracking |
| 4 | 39 | Combination Sum | Backtracking |
| 5 | 46 | Permutations | Backtracking |
| 6 | 17 | Letter Combinations of a Phone Number | Backtracking |
| 7 | 131 | Palindrome Partitioning | Backtracking |
| 8 | 51 | N-Queens | Advanced Backtracking |

## What I Learned

- How recursion works using the call stack
- Base cases and recursive cases
- How to divide a problem into smaller subproblems
- Backtracking using choose → explore → undo
- Generating subsets and permutations
- Handling duplicate states
- Pruning unnecessary branches
- Using recursion for constraint-based problems

## Backtracking Template

```java
void backtrack(...) {

    if (baseCase) {
        // store answer
        return;
    }

    for (...) {

        // choose

        backtrack(...);

        // undo choice
    }
}
