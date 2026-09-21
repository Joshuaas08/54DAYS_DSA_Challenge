# 1004. Max Consecutive Ones III

## Pattern
Variable-size sliding window.

## Approach

We are allowed to flip at most k zeros.

Therefore, our window can contain at most k zeros.

Expand using right.

If:

zeros > k

shrink from the left until the window becomes valid.

Then calculate:

window length = right - left + 1

## Complexity

Time: O(n)
Space: O(1)

## Key Takeaway

A very common sliding-window pattern is:

Expand → Count bad elements → Shrink if invalid → Update answer.
