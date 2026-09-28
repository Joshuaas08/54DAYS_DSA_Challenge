# Day 16 — Big O, Time & Space Complexity

Today I focused on analyzing algorithms using:

- Big O Notation
- Time Complexity
- Space Complexity
- Auxiliary Space
- Recursion Stack
- HashMap / HashSet complexity
- Sorting complexity
- Binary Search
- Exponential algorithms
- Factorial algorithms

## Problems Solved

| # | LeetCode | Problem | Main Complexity |
|---|---:|---|---|
| 1 | 217 | Contains Duplicate | O(n) |
| 2 | 704 | Binary Search | O(log n) |
| 3 | 1 | Two Sum | O(n) |
| 4 | 242 | Valid Anagram | O(n) |
| 5 | 347 | Top K Frequent Elements | O(n log n) |
| 6 | 128 | Longest Consecutive Sequence | O(n) |
| 7 | 78 | Subsets | O(2^n) |
| 8 | 46 | Permutations | O(n!) |

## Big O

Big O describes how the amount of work or memory
grows as the input size increases.

## Common Complexities

O(1)       Constant
O(log n)   Logarithmic
O(n)       Linear
O(n log n) Linearithmic
O(n²)      Quadratic
O(2^n)     Exponential
O(n!)      Factorial

## Important Rules

Drop constants:

O(2n) → O(n)

O(5n + 10) → O(n)

Keep the fastest-growing term:

O(n² + n) → O(n²)

Sequential operations:

O(n) + O(n) → O(n)

Nested loops:

O(n) × O(n) → O(n²)

## Space Complexity

Space complexity includes additional memory used by:

- Arrays
- HashMaps
- HashSets
- Recursion stack
- Queues
- Stacks

## Important

Input space and auxiliary space can be discussed separately.

For example:

int[] nums

is input space.

A new HashSet is auxiliary space.
