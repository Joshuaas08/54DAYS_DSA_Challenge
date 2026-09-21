# 1493. Longest Subarray of 1's After Deleting One Element

## Pattern
Variable-size sliding window.

## Approach

The window can contain at most one zero.

Maintain:

zeros = number of zeros in the window

Expand using right.

If zeros > 1:

shrink the window from the left.

We subtract one from the window length because the problem requires deleting exactly one element.

Therefore:

answer = right - left

## Complexity

Time: O(n)
Space: O(1)

## Key Takeaway

When a problem allows at most K "bad" elements:

Maintain the count of bad elements inside the window.

If count > K, shrink the window.
