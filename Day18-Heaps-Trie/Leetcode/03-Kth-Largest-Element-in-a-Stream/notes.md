# Kth Largest Element in a Stream

## Pattern

Min Heap

## Idea

The numbers arrive one at a time.

Maintain a min heap containing
the k largest values seen so far.

The root is always the kth largest.

## Example

k = 3

Stream:

4 → 5 → 8 → 2 → 10

After processing:

4, 5, 8

Then:

5, 8, 10

Answer = 5

## Complexity

Each add:

O(log k)

Space:

O(k)

## Key Idea

A heap is useful when data arrives continuously.
