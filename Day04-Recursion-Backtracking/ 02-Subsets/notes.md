# Notes — Subsets

## Idea

For every element, we have two choices:

1. Include it
2. Don't include it

Backtracking explores all possible choices.

## Pattern

Choose → Explore → Undo

current.add(nums[i]);

backtrack(...);

current.remove(...);

## Example

[1,2]

Subsets:

[]
[1]
[2]
[1,2]

## Complexity

Time: O(n × 2^n)
Space: O(n) recursion depth, excluding output

## Key Learning

Backtracking is useful when we need to generate all possible
combinations.
