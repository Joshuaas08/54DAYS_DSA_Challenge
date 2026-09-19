# 160. Intersection of Two Linked Lists

## Pattern
Two pointers + pointer switching.

## Approach

Use two pointers:

- a starts at headA
- b starts at headB

When a reaches the end of list A, move it to headB.

When b reaches the end of list B, move it to headA.

Both pointers will travel the same total distance.

If the lists intersect, they meet at the intersection node.

If they don't intersect, both become null.

## Complexity

Time: O(n + m)
Space: O(1)

## Key Takeaway

Pointer switching removes the difference in lengths between the two linked lists.
