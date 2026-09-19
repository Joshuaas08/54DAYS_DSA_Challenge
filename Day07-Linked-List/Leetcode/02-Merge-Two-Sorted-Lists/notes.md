# 21. Merge Two Sorted Lists

## Pattern
Two pointers + dummy node.

## Approach

Compare the current nodes of both lists.

Attach the smaller node to the result list.

When one list becomes empty, attach the remaining list.

## Complexity

Time: O(n + m)
Space: O(1)

## Key Takeaway

A dummy node makes linked-list construction much easier because we don't need special handling for the first node.
