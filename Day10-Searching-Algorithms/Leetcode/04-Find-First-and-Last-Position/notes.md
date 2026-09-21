# 34. Find First and Last Position of Element in Sorted Array

## Pattern
Binary Search + First/Last occurrence.

## Approach

Run binary search twice.

First search:

When target is found, store the answer and continue searching left.

Second search:

When target is found, store the answer and continue searching right.

Therefore:

First occurrence → move right pointer left

Last occurrence → move left pointer right

## Complexity

Time: O(log n)
Space: O(1)

## Key Takeaway

Normal binary search stops when it finds the target.

Variant binary search continues searching to find:

- First occurrence
- Last occurrence
- Lower bound
- Upper bound
