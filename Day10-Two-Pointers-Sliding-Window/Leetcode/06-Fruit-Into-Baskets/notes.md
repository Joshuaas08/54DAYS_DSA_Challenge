# 904. Fruit Into Baskets

## Pattern
Variable-size sliding window + HashMap.

## Approach

The window can contain at most two different fruit types.

Use a HashMap to store:

fruit → frequency

Expand the window using right.

If:

frequency.size() > 2

shrink from the left.

Continue until the window contains at most two types.

## Complexity

Time: O(n)
Space: O(n)

In practice, the map contains at most 3 entries temporarily.

## Key Takeaway

When a problem says:

"Longest subarray with at most K distinct elements"

Think:

Sliding Window + HashMap frequency.
