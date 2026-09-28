# Middle of the Linked List

## Pattern

Fast and Slow Pointers

## Idea

slow moves one step.

fast moves two steps.

When fast reaches the end,
slow is at the middle.

## Example

1 → 2 → 3 → 4 → 5

slow ends at:

3

## Even Length

For:

1 → 2 → 3 → 4 → 5 → 6

slow returns:

4

This matches the problem requirement.

## Complexity

Time: O(n)

Space: O(1)

## Key Idea

Fast moves twice as quickly as slow.
