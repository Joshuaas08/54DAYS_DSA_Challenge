# Kth Largest Element in an Array

## Pattern

Min Heap

## Idea

Maintain a min heap containing only the k largest elements.

If the heap grows beyond k:

remove the smallest element.

At the end:

heap.peek() = kth largest element

## Example

nums = [3,2,1,5,6,4]
k = 2

Largest elements:

5, 6

Answer = 5

## Complexity

Time: O(n log k)

Space: O(k)

## Key Idea

For kth largest, maintain a min heap of size k.
