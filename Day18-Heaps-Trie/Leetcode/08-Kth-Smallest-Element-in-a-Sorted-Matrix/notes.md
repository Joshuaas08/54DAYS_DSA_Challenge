# Kth Smallest Element in a Sorted Matrix

## Pattern

Min Heap

## Idea

Every row is sorted.

Put the first element from each row into
a min heap.

Then:

1. Remove the smallest element.
2. Move to the next element in that row.
3. Add it to the heap.
4. Repeat until the kth element is reached.

## Complexity

Time:

O(k log n)

Space:

O(n)

## Key Idea

A heap lets us merge multiple sorted rows
while always processing the smallest value.
