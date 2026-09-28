# Notes — Permutations

## Idea

Generate every possible ordering of n elements.

Number of permutations:

n!

For example:

3! = 3 × 2 × 1 = 6

## Time Complexity

There are n! permutations.

Each result contains n elements.

Therefore:

O(n × n!)

## Space Complexity

O(n)

for:

- used[]
- current list
- recursion stack

Excluding output.

## Key Learning

When every possible ordering must be generated,
factorial complexity often appears.

O(n!)
