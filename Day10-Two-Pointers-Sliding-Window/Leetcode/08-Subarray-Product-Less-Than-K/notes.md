# 713. Subarray Product Less Than K

## Pattern
Variable-size sliding window.

## Approach

Maintain:

product = product of elements inside the window

Expand using right.

If:

product >= k

shrink from the left until:

product < k

For every valid window:

[right - left + 1]

new subarrays end at right.

Therefore add:

right - left + 1

to the answer.

## Complexity

Time: O(n)
Space: O(1)

## Key Takeaway

When counting valid subarrays ending at right:

Number of valid subarrays = right - left + 1
