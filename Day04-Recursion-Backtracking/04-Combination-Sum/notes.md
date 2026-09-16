# Notes — Combination Sum

## Idea

Find all combinations whose sum equals target.

A number can be used multiple times.

## Important Detail

We pass `i` instead of `i + 1`.

backtrack(..., i, ...)

This allows the same candidate to be selected again.

## Base Cases

target == 0 → valid combination

target < 0 → stop exploring

## Pattern

Choose → Explore → Undo

## Key Learning

The `start` index prevents generating duplicate combinations
in different orders.
