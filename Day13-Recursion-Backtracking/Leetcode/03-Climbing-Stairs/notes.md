# Notes — Climbing Stairs

## Idea

You can climb either:

- 1 step
- 2 steps

To reach step n, you could have arrived from:

n - 1

or

n - 2

Therefore:

ways(n) = ways(n - 1) + ways(n - 2)

## Base Cases

n = 1 → 1 way

n = 2 → 2 ways

## Example

For n = 3:

1 + 1 + 1
1 + 2
2 + 1

Answer = 3

## Complexity

Time: O(2^n)

Space: O(n)

## Key Learning

Many recursive problems can be expressed using smaller
versions of the same problem.

Note: This direct recursive version is useful for learning
recursion, but a DP solution is needed for larger n.
