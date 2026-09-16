# Notes — Power of Two

## Idea

A number is a power of two if we can repeatedly divide it by 2
until we reach 1.

Example:

16 → 8 → 4 → 2 → 1

## Base Case

n == 1 → true

If n is <= 0 or odd → false.

## Complexity

Time: O(log n)
Space: O(log n)

## Key Learning

Recursion can repeatedly reduce a problem until it reaches a simple
base case.
