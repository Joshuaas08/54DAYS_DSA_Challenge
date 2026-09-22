# LeetCode 75 - Sort Colors

## Problem

Given an array containing `0`, `1`, and `2`, sort the array in-place so that objects of the same color are adjacent.

The order should be:

`0 -> 1 -> 2`

## Approach

Use the Dutch National Flag algorithm with three pointers:

- `low` - position where the next `0` should go
- `mid` - current element being processed
- `high` - position where the next `2` should go

### Rules

If `nums[mid] == 0`:

- Swap `low` and `mid`
- Increment both `low` and `mid`

If `nums[mid] == 1`:

- Move `mid`

If `nums[mid] == 2`:

- Swap `mid` and `high`
- Decrement `high`
- Do not increment `mid` because the swapped element still needs to be checked

## Example

Input:

[2,0,2,1,1,0]

Output:

[0,0,1,1,2,2]

## Complexity

- Time: O(n)
- Space: O(1)

## Key Takeaway

The Dutch National Flag algorithm can sort an array containing three distinct values in linear time without using extra space.
