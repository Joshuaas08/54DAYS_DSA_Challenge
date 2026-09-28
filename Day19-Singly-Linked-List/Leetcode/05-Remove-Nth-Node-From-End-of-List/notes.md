# Remove Nth Node From End

## Pattern

Two Pointers + Dummy Node

## Idea

Maintain a gap of n nodes between fast and slow.

When fast reaches the end:

slow is directly before the node
that needs to be removed.

## Example

1 → 2 → 3 → 4 → 5

n = 2

Remove:

4

Result:

1 → 2 → 3 → 5

## Why Dummy?

It handles the case where the head itself
needs to be removed.

## Complexity

Time: O(n)

Space: O(1)

## Key Idea

Create a fixed distance between two pointers.
