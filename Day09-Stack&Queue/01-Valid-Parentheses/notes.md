# 20. Valid Parentheses

## Pattern
Stack.

## Approach

Opening brackets are pushed onto the stack.

When a closing bracket appears:

1. Check if the stack is empty.
2. Pop the top bracket.
3. Check whether it matches the closing bracket.

At the end, the stack must be empty.

## Complexity

Time: O(n)
Space: O(n)

## Key Takeaway

When you need to match something with the most recently opened item, think:

LIFO → Stack
