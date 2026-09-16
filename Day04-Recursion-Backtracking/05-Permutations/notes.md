# Notes — Permutations

## Idea

Unlike subsets, order matters.

Example:

[1,2,3]

[1,2,3] and [2,1,3] are different.

## Used Array

boolean[] used

keeps track of which elements are already in the current
permutation.

## Backtracking

1. Choose an unused number
2. Mark it as used
3. Recursively continue
4. Remove it
5. Mark it unused

## Complexity

Time: O(n × n!)
Space: O(n)

## Key Learning

When generating permutations, use a `used[]` array to track
elements already selected.
