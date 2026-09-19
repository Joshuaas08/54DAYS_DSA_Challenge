# 209. Minimum Size Subarray Sum

## Pattern
Variable-size sliding window.

## Approach

Expand the window by moving right.

When:

sum >= target

the window is valid.

Now shrink it from the left while it remains valid.

Every time the condition is satisfied, update the minimum length.

## Complexity

Time: O(n)
Space: O(1)

## Key Takeaway

For minimum-length sliding window problems:

Expand until valid → Shrink as much as possible → Record answer.
