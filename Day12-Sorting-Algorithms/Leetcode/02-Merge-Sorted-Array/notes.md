# LeetCode 88 - Merge Sorted Array

## Problem

Given two sorted arrays `nums1` and `nums2`, merge `nums2` into `nums1`.

The final array must also be sorted.

## Approach

Use two pointers starting from the end.

- `i` points to the last valid element in `nums1`
- `j` points to the last element in `nums2`
- `k` points to the last position in `nums1`

We compare `nums1[i]` and `nums2[j]` and place the larger element at position `k`.

We work from the back because `nums1` already contains empty positions at the end.

## Example

nums1 = [1,2,3,0,0,0]
nums2 = [2,5,6]

Output:

[1,2,2,3,5,6]

## Complexity

- Time: O(m + n)
- Space: O(1)

## Key Takeaway

When merging sorted arrays in-place, processing from the end prevents us from overwriting useful elements.
