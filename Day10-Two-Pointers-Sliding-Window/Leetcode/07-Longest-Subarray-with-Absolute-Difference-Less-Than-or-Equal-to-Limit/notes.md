# 1438. Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit

## Pattern
Sliding Window + Monotonic Deques.

## Approach

For every window, we need:

maximum - minimum <= limit

A normal sliding window cannot efficiently find the maximum and minimum.

So use two deques:

increasing deque → maintains minimum
decreasing deque → maintains maximum

If:

max - min > limit

shrink the window from the left.

## Complexity

Time: O(n)
Space: O(n)

## Key Takeaway

When a sliding window needs both:

Maximum
Minimum

Think:

Two Monotonic Deques.
