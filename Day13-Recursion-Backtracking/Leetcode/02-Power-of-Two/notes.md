# Notes — Power of Two

## Idea

A number is a power of two if we can repeatedly divide it
by 2 until we reach 1.

Example:

16
↓
8
↓
4
↓
2
↓
1

## Base Case

n == 1 → true

If n <= 0 or n is odd → false.

## Approach

1. Check if n is 1.
2. Reject invalid values.
3. Divide n by 2.
4. Recursively check the result.

## Complexity

Time: O(log n)

Space: O(log n)

## Key Learning

Recursion can repeatedly reduce a problem into a smaller
version of the same problem.
