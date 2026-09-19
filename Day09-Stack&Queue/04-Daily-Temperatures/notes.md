# 739. Daily Temperatures

## Pattern
Monotonic decreasing stack.

## Approach

Store indices instead of temperatures.

The stack contains days whose warmer future temperature has not been found yet.

When the current temperature is greater than the temperature at the top index:

Pop that index.

The answer is:

current index - previous index

Continue until the stack is valid again.

## Complexity

Time: O(n)
Space: O(n)

## Key Takeaway

When you see:

"Next greater element"
"Next warmer day"
"Next smaller element"

Think:

Monotonic Stack
