# 19. Remove Nth Node From End of List

## Pattern
Two pointers + dummy node.

## Approach

Create a gap of n nodes between fast and slow.

Move both pointers until fast reaches the end.

At that point, slow is directly before the node that needs to be removed.

The dummy node handles the case where the head itself needs to be removed.

## Complexity

Time: O(n)
Space: O(1)

## Key Takeaway

For "Nth node from the end", think about maintaining a fixed gap between two pointers.
