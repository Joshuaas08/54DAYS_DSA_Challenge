# 643. Maximum Average Subarray I

## Pattern
Fixed-size sliding window.

## Approach

The window always contains exactly k elements.

First calculate the sum of the first k elements.

Then slide the window:

Add the new element.

Remove the element leaving the window.

Keep track of the maximum sum.

## Complexity

Time: O(n)
Space: O(1)

## Key Takeaway

For a fixed-size window:

1. Build the first window.
2. Add the incoming element.
3. Remove the outgoing element.
4. Repeat.
