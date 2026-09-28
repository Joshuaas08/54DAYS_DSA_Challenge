# Intersection of Two Linked Lists

## Pattern

Two Pointers

## Idea

The two lists may have different lengths.

When a pointer reaches the end:

move it to the head of the other list.

This makes both pointers travel:

lengthA + lengthB

Eventually:

- They meet at the intersection
- Or both become null

## Example

List A:

4 → 1 → 8 → 4 → 5

List B:

5 → 6 → 1 → 8 → 4 → 5

Intersection:

8

## Complexity

Time: O(n + m)

Space: O(1)

## Key Idea

Switch heads when reaching the end to
eliminate the length difference.
