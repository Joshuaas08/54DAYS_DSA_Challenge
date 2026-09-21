# 704. Binary Search

## Pattern
Binary Search.

## Requirement

The array must be sorted.

## Approach

Maintain a search range:

left ... right

Find the middle:

mid = left + (right - left) / 2

If nums[mid] == target:

Target found.

If nums[mid] < target:

Search the right half.

If nums[mid] > target:

Search the left half.

Each step eliminates half of the search space.

## Complexity

Time: O(log n)
Space: O(1)

## Key Takeaway

Binary Search reduces:

n → n/2 → n/4 → n/8 ...

Therefore:

Time = O(log n)
