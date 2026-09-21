# 69. Sqrt(x)

## Pattern
Binary Search on a numerical range.

## Approach

We need the largest integer:

mid

such that:

mid * mid <= x

Search between:

1 and x / 2

For every mid:

If mid² == x:

Return mid.

If mid² < x:

mid is valid, but a larger answer may exist.

Move right.

If mid² > x:

Move left.

## Complexity

Time: O(log x)
Space: O(1)

## Key Takeaway

Binary Search does not have to search an array.

It can search a range of possible answers.
