# Reorder List

## Pattern

Find Middle + Reverse + Merge

## Goal

Convert:

1 → 2 → 3 → 4

into:

1 → 4 → 2 → 3

For:

1 → 2 → 3 → 4 → 5

becomes:

1 → 5 → 2 → 4 → 3

## Steps

1. Find the middle.
2. Split the list.
3. Reverse the second half.
4. Merge the two halves alternately.

## Complexity

Time: O(n)

Space: O(1)

## Key Idea

Many difficult linked-list problems can be
broken into smaller linked-list patterns.
