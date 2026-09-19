# 239. Sliding Window Maximum

## Pattern
Deque + Monotonic Queue.

## Approach

Maintain a deque containing indices.

The deque is kept in decreasing order of values.

The largest value is always at the front.

For every new element:

1. Remove indices outside the window.
2. Remove smaller elements from the back.
3. Add the current index.
4. The front contains the maximum.

## Complexity

Time: O(n)
Space: O(k)

## Key Takeaway

When you need the maximum or minimum inside a moving window, think:

Deque + Monotonic Queue
