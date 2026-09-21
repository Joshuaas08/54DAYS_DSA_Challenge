# 35. Search Insert Position

## Pattern
Binary Search / Lower Bound.

## Approach

Search for the target normally.

If the target exists, return its index.

If it does not exist, when the loop finishes:

left

points to the position where the target should be inserted.

## Complexity

Time: O(log n)
Space: O(1)

## Key Takeaway

At the end of a binary search:

left often represents the first valid position.

This idea is extremely important for:

- Lower Bound
- Search Insert Position
- First occurrence
- Insertion problems
