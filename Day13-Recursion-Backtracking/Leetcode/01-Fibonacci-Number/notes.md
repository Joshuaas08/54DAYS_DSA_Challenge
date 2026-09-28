# Notes — Fibonacci Number

## Idea

Fibonacci follows this formula:

fib(n) = fib(n - 1) + fib(n - 2)

Example:

0, 1, 1, 2, 3, 5, 8...

## Base Case

When n is 0 or 1:

fib(0) = 0
fib(1) = 1

## Approach

1. Check the base case.
2. Break the problem into two smaller problems.
3. Add the results.

## Complexity

Time: O(2^n)

Space: O(n) because of the recursion stack.

## Key Learning

A recursive function needs a base case to stop the recursion.
