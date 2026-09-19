# 876. Middle of the Linked List

## Pattern
Fast and slow pointers.

## Approach

Move:

- slow → 1 step
- fast → 2 steps

When fast reaches the end, slow will be at the middle.

For an even-sized list, this returns the second middle node.

## Complexity

Time: O(n)
Space: O(1)

## Key Takeaway

Whenever you need the middle of a linked list, think:

slow = 1 step
fast = 2 steps
