# Longest Consecutive Sequence

## Pattern

HashSet

## Key Idea

Put all numbers into a HashSet.

For every number:

If `num - 1` does NOT exist,
then `num` is the beginning of a sequence.

Example:

[100, 4, 200, 1, 3, 2]

Set = {1,2,3,4,100,200}

1 is a starting point because 0 doesn't exist.

Sequence:

1 → 2 → 3 → 4

Length = 4

## Complexity

Time: O(N)
Space: O(N)

## Important

Don't start counting from every number.

Only start when:

num - 1 not in set

This prevents unnecessary work.
