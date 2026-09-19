# 496. Next Greater Element I

## Pattern
Monotonic decreasing stack + HashMap.

## Approach

Process nums2 from left to right.

Maintain a decreasing stack.

When the current number is greater than the stack top:

The current number is the next greater element for the stack top.

Store the result in a HashMap.

Then use nums1 to retrieve the answers.

## Complexity

Time: O(n + m)
Space: O(n)

## Key Takeaway

For "next greater" problems:

1. Use a monotonic stack.
2. Store unresolved elements.
3. Resolve them when a larger value appears.
