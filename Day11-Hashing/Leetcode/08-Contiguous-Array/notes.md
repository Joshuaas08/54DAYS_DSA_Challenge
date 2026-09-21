# Contiguous Array

## Pattern

Prefix Sum + HashMap

## Key Idea

We need an equal number of:

0s and 1s.

Convert:

0 → -1
1 → +1

Now the problem becomes:

Find the longest subarray with sum = 0.

If the same prefix sum appears at two indices,
the elements between them sum to zero.

Therefore they contain equal numbers of 0s and 1s.

## Example

[0, 1, 0, 1]

Convert:

[-1, +1, -1, +1]

Prefix sums:

-1
 0
-1
 0

The same prefix sum appearing again means
the section between them has sum 0.

## Complexity

Time: O(N)
Space: O(N)

## Takeaway

For equal-count problems:

Try converting one value to +1
and the other to -1.

Then use:

Prefix Sum + HashMap
