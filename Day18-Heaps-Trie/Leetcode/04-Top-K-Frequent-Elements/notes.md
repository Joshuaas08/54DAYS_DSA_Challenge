# Top K Frequent Elements

## Pattern

HashMap + Min Heap

## Steps

1. Count frequency of every number.
2. Put numbers into a min heap.
3. Compare numbers using their frequency.
4. Keep only k elements.
5. Extract the result.

## Complexity

Let n = number of elements.

Frequency counting:

O(n)

Heap processing:

O(n log k)

Total:

O(n log k)

Space:

O(n)

## Key Idea

HashMap finds frequencies.

Heap keeps the top k elements.
