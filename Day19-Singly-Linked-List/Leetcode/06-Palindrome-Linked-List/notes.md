# Palindrome Linked List

## Pattern

Fast & Slow + Reverse

## Idea

A palindrome reads the same forward and backward.

Example:

1 → 2 → 2 → 1

Steps:

1. Find the middle.
2. Reverse the second half.
3. Compare both halves.

## Complexity

Time: O(n)

Space: O(1)

## Key Idea

Reverse half of the linked list instead of
copying all values into an array.
