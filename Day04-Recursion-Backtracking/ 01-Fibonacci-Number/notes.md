# Notes — Fibonacci Number

## Idea

This is a basic recursion problem.

The Fibonacci relation is:

fib(n) = fib(n - 1) + fib(n - 2)

## Base Case

When n is 0 or 1, return n.

## Pattern

1. Check base case
2. Break the problem into smaller problems
3. Return the result of recursive calls

## Complexity

Time: O(2^n)
Space: O(n) — recursion stack

## Key Learning

Every recursive solution needs:

- Base case
- Recursive case
- Progress toward the base case
