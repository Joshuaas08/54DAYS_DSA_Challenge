# Notes — Permutations

## Idea

A permutation uses every element exactly once,
but the order changes.

Example:

[1,2,3]

Possible permutations include:

[1,2,3]
[1,3,2]
[2,1,3]
[2,3,1]
[3,1,2]
[3,2,1]

## Used Array

We use:

boolean[] used

to track which numbers are already inside the current
permutation.

## Approach

1. Pick an unused number.
2. Mark it as used.
3. Add it to current.
4. Recursively continue.
5. Remove it.
6. Mark it unused.

## Complexity

Time: O(n × n!)

Space: O(n) excluding output.

## Key Learning

For permutations, order matters and a used[] array is
commonly required.
