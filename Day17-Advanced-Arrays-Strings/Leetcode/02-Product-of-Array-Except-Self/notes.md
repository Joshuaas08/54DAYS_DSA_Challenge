# Product of Array Except Self

## Pattern

Prefix + Suffix

## Idea

For each index:

answer = product of elements on the left
       × product of elements on the right

First pass calculates prefix products.

Second pass calculates suffix products.

## Example

nums = [1,2,3,4]

Output:

[24,12,8,6]

## Complexity

Time: O(n)

Extra Space: O(1)

The output array does not count as extra space.

## Key Idea

Avoid division.

Build the answer using prefix and suffix products.
