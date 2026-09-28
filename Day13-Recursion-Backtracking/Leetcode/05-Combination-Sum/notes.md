# Notes — Combination Sum

## Idea

Find all combinations whose sum equals target.

Each number can be used multiple times.

## Base Cases

target == 0

The current combination is valid.

target < 0

The current path is invalid.

## Important Detail

Notice that we pass:

i

instead of:

i + 1

This allows the same number to be selected again.

## Example

candidates = [2,3,6,7]
target = 7

Answer:

[2,2,3]
[7]

## Backtracking

Choose a number
↓
Reduce target
↓
Explore
↓
Undo the number

## Key Learning

The starting index controls whether we can reuse elements
and prevents duplicate combinations.
