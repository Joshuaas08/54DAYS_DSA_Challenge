# 42. Trapping Rain Water

## Pattern
Two pointers + left/right maximum.

## Approach

Water above a position depends on:

min(leftMax, rightMax) - currentHeight

Instead of calculating leftMax and rightMax for every position, maintain:

leftMax
rightMax

Use two pointers:

left → beginning
right → end

Move the side with the smaller height.

## Complexity

Time: O(n)
Space: O(1)

## Key Takeaway

When a problem asks for water trapped between heights, think:

Two pointers + left maximum + right maximum.
