# LeetCode 147 - Insertion Sort List

## Problem

Sort a linked list using the insertion sort algorithm.

## Approach

Insertion Sort maintains a sorted portion of the list.

For every node:

1. Save the next node.
2. Find the correct position in the sorted portion.
3. Insert the current node there.
4. Continue with the next node.

A dummy node is used to simplify insertion at the beginning of the list.

## Example

Input:

4 -> 2 -> 1 -> 3

Sorted:

1 -> 2 -> 3 -> 4

## Complexity

- Time: O(n²)
- Space: O(1)

## Key Takeaway

Insertion Sort works by inserting each element into its correct position in an already sorted section.

It can be useful for small or nearly sorted inputs.
