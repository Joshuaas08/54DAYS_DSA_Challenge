# Notes — Permutations

## Idea

Generate every possible ordering of the numbers.

Example:

[1,2,3]

Produces:

[1,2,3]
[1,3,2]
[2,1,3]
[2,3,1]
[3,1,2]
[3,2,1]

## Important Concept

Order matters.

We use:

boolean[] used

to make sure the same element is not selected twice
in the same permutation.

## Backtracking

Choose
↓
Explore
↓
Undo

## Complexity

Time: O(n × n!)

Space: O(n)

## Key Learning

Permutations usually require tracking which elements
have already been used.
