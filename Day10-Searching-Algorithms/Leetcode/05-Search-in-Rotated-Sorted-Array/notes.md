# 33. Search in Rotated Sorted Array

## Pattern
Modified Binary Search.

## Important Observation

Even though the entire array is rotated, at least one half is always sorted.

Example:

4 5 6 7 0 1 2

For every mid:

Either:

Left half is sorted

or:

Right half is sorted.

## Approach

1. Find mid.
2. Check which half is sorted.
3. Check whether target belongs to that sorted half.
4. Search the appropriate half.

## Complexity

Time: O(log n)
Space: O(1)

## Key Takeaway

For rotated sorted arrays:

One half is always sorted.

Identify the sorted half first.
