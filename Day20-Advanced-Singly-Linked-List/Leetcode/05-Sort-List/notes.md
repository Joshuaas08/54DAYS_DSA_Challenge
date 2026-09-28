# Sort List

## Pattern

Merge Sort

## Steps

1. Find middle.
2. Split the list.
3. Recursively sort both halves.
4. Merge the sorted halves.

## Why Merge Sort?

Linked lists do not provide O(1) random access,
so algorithms like array-based quicksort are
less natural.

Merge Sort works very well with linked lists.

## Complexity

Time: O(n log n)

Space: O(log n) recursion stack.

## Key Idea

Split → Sort → Merge
