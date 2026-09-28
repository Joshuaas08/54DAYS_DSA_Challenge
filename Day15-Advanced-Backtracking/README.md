# Day 15 — Advanced Backtracking

Today I focused on advanced backtracking techniques.

The main focus was:

- Permutations
- Duplicate handling
- Combinations
- Constraint checking
- N-Queens
- Sudoku Solver
- Grid Backtracking
- Pruning

## Problems Solved

| # | LeetCode | Problem | Concept |
|---|---:|---|---|
| 1 | 46 | Permutations | Backtracking |
| 2 | 47 | Permutations II | Duplicates |
| 3 | 40 | Combination Sum II | Combinations |
| 4 | 90 | Subsets II | Duplicates |
| 5 | 131 | Palindrome Partitioning | Partitioning |
| 6 | 51 | N-Queens | Constraints |
| 7 | 37 | Sudoku Solver | Constraints |
| 8 | 79 | Word Search | Grid Backtracking |

## Core Backtracking Pattern

```java
void backtrack(...) {

    if (baseCase) {
        // Store answer
        return;
    }

    for (...) {

        // Choose

        backtrack(...);

        // Undo
    }
}
