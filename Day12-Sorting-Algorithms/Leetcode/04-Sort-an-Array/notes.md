# LeetCode 912 - Sort an Array

## Problem

Given an integer array, sort the array in ascending order.

## Approach

Use Merge Sort.

Merge Sort follows the Divide and Conquer technique.

### Steps

1. Divide the array into two halves.
2. Recursively sort both halves.
3. Merge the two sorted halves.

Example:

[5,2,3,1]

Divide:

[5,2] [3,1]

Divide again:

[5] [2] [3] [1]

Merge:

[2,5] [1,3]

Final:

[1,2,3,5]

## Complexity

- Time: O(n log n)
- Space: O(n)

## Key Takeaway

Merge Sort guarantees O(n log n) time and demonstrates the Divide and Conquer technique.
