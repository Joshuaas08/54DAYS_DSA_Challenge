# Merge K Sorted Lists

## Pattern

Min Heap

## Idea

Each list is already sorted.

Put the first node of every list into
a min heap.

Repeatedly:

1. Remove smallest node.
2. Add it to the result.
3. Insert its next node.

## Complexity

Let:

k = number of lists
N = total number of nodes

Time: O(N log k)

Space: O(k)

## Key Idea

The heap always contains the smallest
available node from each list.
