# 206. Reverse Linked List

## Pattern
Three-pointer technique.

## Approach

Use three pointers:

- prev → previous node
- curr → current node
- next → next node

For every node:

1. Save the next node.
2. Reverse the current node's pointer.
3. Move prev forward.
4. Move curr forward.

## Complexity

Time: O(n)
Space: O(1)

## Key Takeaway

Always save curr.next before changing curr.next.
