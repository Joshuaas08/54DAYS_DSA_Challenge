# 155. Min Stack

## Pattern
Stack + auxiliary stack.

## Approach

Use two stacks:

1. Normal stack
2. Min stack

The min stack keeps track of the minimum value at every level.

For every push:

minStack.push(
    min(current value, previous minimum)
)

Therefore getMin() can be done in O(1).

## Complexity

push: O(1)
pop: O(1)
top: O(1)
getMin: O(1)

Space: O(n)

## Key Takeaway

When you need O(1) access to additional information about a stack, consider maintaining an auxiliary stack.
