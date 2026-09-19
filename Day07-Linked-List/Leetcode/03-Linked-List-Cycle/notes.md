# 141. Linked List Cycle

## Pattern
Fast and slow pointers.

## Approach

Use two pointers:

- slow moves one step
- fast moves two steps

If there is a cycle, fast will eventually meet slow.

If fast reaches null, there is no cycle.

## Complexity

Time: O(n)
Space: O(1)

## Key Takeaway

Fast and slow pointers are commonly used for cycle detection and finding the middle of a linked list.
