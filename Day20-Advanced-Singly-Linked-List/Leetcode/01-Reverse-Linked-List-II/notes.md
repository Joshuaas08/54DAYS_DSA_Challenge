# Reverse Linked List II

## Pattern

Partial Reversal

## Example

1 → 2 → 3 → 4 → 5

left = 2
right = 4

Result:

1 → 4 → 3 → 2 → 5

## Idea

Keep the part before `left` connected.

Then repeatedly move the next node to the
front of the section being reversed.

## Important

A dummy node handles the case where:

left = 1

## Complexity

Time: O(n)

Space: O(1)

## Key Idea

Reverse only the required section without
creating another list.
