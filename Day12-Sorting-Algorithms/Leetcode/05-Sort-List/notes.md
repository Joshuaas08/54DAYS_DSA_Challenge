# LeetCode 148 - Sort List

## Problem

Given the head of a linked list, return the list after sorting it in ascending order.

## Approach

Use Merge Sort.

Merge Sort is a good choice for linked lists because we do not need random access to split and merge the list.

### Steps

1. Find the middle using slow and fast pointers.
2. Split the linked list into two halves.
3. Recursively sort both halves.
4. Merge the two sorted lists.

## Example

Input:

4 -> 2 -> 1 -> 3

Split:

4 -> 2

1 -> 3

Sort:

2 -> 4

1 -> 3

Merge:

1 -> 2 -> 3 -> 4

## Complexity

- Time: O(n log n)
- Space: O(log n) due to recursion

## Key Takeaway

Merge Sort is especially useful for linked lists because splitting and merging can be done without shifting elements.
