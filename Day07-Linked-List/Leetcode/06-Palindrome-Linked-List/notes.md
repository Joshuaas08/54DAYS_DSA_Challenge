# 234. Palindrome Linked List

## Pattern
Find middle + reverse second half + compare.

## Approach

1. Find the middle using slow and fast pointers.
2. Reverse the second half.
3. Compare the first half with the reversed second half.

## Complexity

Time: O(n)
Space: O(1)

## Key Takeaway

A linked list doesn't support random access like an array.

Instead of converting it to an array, we can use pointer techniques to achieve O(1) extra space.
