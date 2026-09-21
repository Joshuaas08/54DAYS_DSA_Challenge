# 11. Container With Most Water

## Pattern
Two pointers from opposite ends.

## Approach

Start with:

left = 0
right = n - 1

The area is:

width × minimum height

So:

area = (right - left) × min(height[left], height[right])

After calculating the area, move the pointer with the smaller height.

Why?

The smaller height is limiting the current area.

Moving the taller pointer cannot increase the limiting height.

## Complexity

Time: O(n)
Space: O(1)

## Key Takeaway

For container problems:

Start from both ends.

Always move the pointer with the smaller value.
