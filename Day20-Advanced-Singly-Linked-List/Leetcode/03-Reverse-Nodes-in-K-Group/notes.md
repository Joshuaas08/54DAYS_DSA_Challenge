# Reverse Nodes in K-Group

## Pattern

Advanced Reversal

## Example

1 → 2 → 3 → 4 → 5

k = 2

Result:

2 → 1 → 4 → 3 → 5

## Idea

For every group:

1. Find kth node.
2. Reverse the group.
3. Connect it to the previous group.
4. Continue.

If fewer than k nodes remain,
leave them unchanged.

## Complexity

Time: O(n)

Space: O(1)

## Key Idea

Break a large pointer problem into
independent groups.
