# Merge Two Sorted Lists

## Pattern

Two Pointers + Dummy Node

## Idea

Compare the current nodes of both lists.

Take the smaller node.

Move that list forward.

Continue until one list is empty.

Then attach the remaining list.

## Example

List 1:

1 → 3 → 5

List 2:

2 → 4 → 6

Result:

1 → 2 → 3 → 4 → 5 → 6

## Complexity

Time: O(n + m)

Space: O(1)

## Key Idea

The dummy node makes head insertion easier.
