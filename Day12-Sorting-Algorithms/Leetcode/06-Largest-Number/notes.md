# LeetCode 179 - Largest Number

## Problem

Given a list of non-negative integers, arrange them such that they form the largest possible number.

## Approach

Convert all numbers to strings.

The important part is creating a custom comparator.

For two strings `a` and `b`, compare:

a + b

with:

b + a

If `b + a` is larger, `b` should come before `a`.

### Example

For:

[3, 30]

Compare:

"330"

and:

"303"

Since "330" is larger, `3` should come before `30`.

Therefore:

330

## Example

Input:

[3,30,34,5,9]

Output:

9534330

## Complexity

- Time: O(n log n)
- Space: O(n)

## Key Takeaway

Custom comparators allow us to define exactly how elements should be ordered.

The key comparison is:

(b + a).compareTo(a + b)
