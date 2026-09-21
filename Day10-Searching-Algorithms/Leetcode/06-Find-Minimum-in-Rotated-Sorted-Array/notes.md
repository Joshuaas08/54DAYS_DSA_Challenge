# 153. Find Minimum in Rotated Sorted Array

## Pattern
Modified Binary Search.

## Approach

Compare:

nums[mid]

with:

nums[right]

If:

nums[mid] > nums[right]

the minimum must be in the right half.

Otherwise:

the minimum is at mid or somewhere in the left half.

Therefore:

left = mid + 1

or:

right = mid

## Complexity

Time: O(log n)
Space: O(1)

## Key Takeaway

When searching for a minimum/maximum in a rotated sorted array, compare the middle element with one boundary.
