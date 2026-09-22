# LeetCode 1051 - Height Checker

## Problem

Given an array representing the current order of students by height, determine how many students are not standing in the positions they would occupy if the heights were sorted.

## Approach

Create a copy of the original array.

Sort the copy to obtain the expected order.

Then compare the original array with the sorted array.

Every position where the values are different represents a student who is in the wrong position.

## Example

Input:

[1,1,4,2,1,3]

Sorted:

[1,1,1,2,3,4]

Compare:

1 == 1
1 == 1
4 != 1
2 == 2
1 != 3
3 != 4

Answer:

3

## Complexity

- Time: O(n log n)
- Space: O(n)

## Key Takeaway

A sorted copy can be used as a reference to determine how much an array differs from its expected sorted order.
