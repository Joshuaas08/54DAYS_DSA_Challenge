# Last Stone Weight

## Pattern

Max Heap

## Idea

We always need the two heaviest stones.

A max heap gives us the largest stones quickly.

Take:

largest
second largest

If they are different:

largest - second largest

Insert the remaining stone back.

## Complexity

Time: O(n log n)

Space: O(n)

## Key Idea

When repeatedly processing the largest element,
think Max Heap.
